import { useState } from "react"

export default function Register() {

    let [user,setUser] = useState({fname:'',email:''});
    function doSignUp(){
        alert("Thank You , " + user.fname);
    }

    function formChanged(e){
         setUser({...user,[e.target.name]:e.target.value});
    }
    return (
        <div>
            <h3>SignUp</h3>
            <div>
                {JSON.stringify(user)}
            </div>
        <div>
            <label htmlFor="">Full Name</label>
            <input type="text" name='fname' onChange={formChanged}/>
        </div>
        <div>
            <label htmlFor="">Email</label>
            <input type="text" name='email' onChange={formChanged} />
        </div>
        <div>
            <button onClick={doSignUp}>SignUp</button>
        </div>
         </div>
    )

}