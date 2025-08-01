import { useRef, useState } from 'react';
import './login.css';
import { LoginService } from '../services/loginservice';
export function Login() {

    let [msg, setMsg] = useState('');
    let lref = useRef();
    let pref = useRef();

    function doLogin() {
        if (LoginService.checklogin(lref.current.value, pref.current.value))
            setMsg('Welcome ' + lref.current.value);
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
                <button onClick={doLogin}>Login</button>
            </div>
        </div>
    )
}