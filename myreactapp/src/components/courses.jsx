import { useRef, useState } from "react";
import { CourseService } from "../services/courseservice";
export function Courses() {
    let cref = useRef();

    let [tlist,setTlist] = useState(CourseService.search());
    
    function addCourse() {
       CourseService.add(cref.current.value);
       setTlist(CourseService.search());
       cref.current.value='';
    }

    return (
        <div>
            <h3>Training Courses</h3>
            <input type="text" name='crs' ref={cref}></input>
            <button onClick={addCourse}>Add</button>
            <ul>{tlist.map(c => <li key={c}>{c}</li>)}</ul>
        </div>
    )
}