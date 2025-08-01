import { useRef, useState } from 'react';
import './login.css';
export function Login(){

    let [msg,setMsg]= useState('************');
    let lref = useRef();
    let pref = useRef();
    

    function checkLogin(){
        if(lref.current.value =='James' && pref.current.value=='Bond')
            setMsg('Welcome '+ lref.current.value);
        else
           setMsg('Invalid login/password');

        console.log(msg);

    }
    return (
        <div className="loginst">
        <h3>Login </h3>
        <div>
            <label>Login</label>
            <input type='text' ref={lref}></input>
        </div>
         <div>
            <label>Password</label>
            <input type='password' ref={pref}></input>
        </div>
        <div>
            <p>{msg}</p>
        </div>
        <div>
            <button onClick={checkLogin}>Login</button>
        </div>
        </div>
    )
}