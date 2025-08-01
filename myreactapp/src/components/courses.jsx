import { useRef, useState } from "react";
export function Courses() {
    let cref = useRef();

    let [tlist,setTlist] = useState(['Java', 'SpringBoot']);
    
    function addCourse() {
       setTlist([...tlist,cref.current.value]);
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