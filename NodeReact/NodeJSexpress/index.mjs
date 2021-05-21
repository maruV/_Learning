import Express from 'express'; //useful for routing i'e it is a route handler
import Joi from 'joi';  //used for easier input validation

const app = Express();
app.use(Express.json());

const port = process.env.port || 3000;

const courses = [
    {id:1, name:'course1'},
    {id:2, name:'course2'}
];

app.get('/', (req, res) =>{
    res.send('Pappan!!!!!');
 });

app.get('/api/courses', (req, res) =>{
    res.send(courses);
});

app.post('/api/courses/:id', (req, res) => {

    const {error} = validateCourse(req.body);

    if (error) return res.status(400).send(error.details[0].message);

    const course = {
        id: courses.length + 1,
        name: req.body.name        
    }

    courses.push(course);
    res.send(course);

});

app.get('/api/courses/:id', (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    
    // if the coursse does not have a value send 400
    if (!course) res.status(400).send(`no course with the given id`);
    res.send(course);
 });


app.put('/api/courses/:id', (req, res) => {

    const course = courses.find(c => c.id === parseInt(req.params.id));
    if (!course) return res.status(404).send('no course with given id');

    const { error } = validateCourse(req.body); 

    if ( error ) return res.status(400).send(error.details[0].message);

    course.name = req.body.name;
    res.send(course);
});

app.delete('/api/courses/:id', (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    if (!course) return res.status(404).send('no course with given id');

    const index = courses.indexOf(courses);
    courses.splice(index, 1);

    res.send(course);

});

function validateCourse(course){
    const schema = Joi.object({
        name : Joi.string().min(3).required()
    });

    return schema.validate(course);
};


 app.listen(port, () => console.log(`Listening on port ${port}...`));
