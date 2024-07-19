const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.json());

mongoose.connect('mongodb://localhost:27017/eldercare', {
    useNewUrlParser: true,
    useUnifiedTopology: true
});

const UserSchema = new mongoose.Schema({
    name: String,
    age: Number,
    medications: [{ name: String, time: String }],
    healthData: {
        heartRate: Number,
        bloodPressure: String
    }
});

const User = mongoose.model('User', UserSchema);

// Endpoint to get user health data
app.get('/api/health/:userId', (req, res) => {
    User.findById(req.params.userId, (err, user) => {
        if (err) return res.status(500).send(err);
        res.send(user.healthData);
    });
});

// Endpoint to set medication reminders
app.post('/api/medication/:userId', (req, res) => {
    User.findByIdAndUpdate(req.params.userId, { medications: req.body.medications }, { new: true }, (err, user) => {
        if (err) return res.status(500).send(err);
        res.send(user);
    });
});

app.listen(3000, () => {
    console.log('Server is running on port 3000');
});
