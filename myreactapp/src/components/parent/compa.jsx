import { useRef } from "react"

export function CompA(props) {
    let tref = useRef();
 
return (
    <div>
        <h3>CompA</h3>
        <div>
            <label>Enter Some Text :</label>
            <input type="text" name="txt" ref={tref}></input>
            <button onClick={()=> props.sendData(tref.current.value)}>Send</button>
        </div>
    </div>
)
}