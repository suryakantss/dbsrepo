let courses = ['Java'];

function search(){
    return courses;
}

function add(course) {
    courses = [...courses,course];
}
export const CourseService = {search,add};