import { useState } from "react";
import { CompA } from "./compa";
import { CompB } from "./compb";

export default function Parent() {
    let [txt,setTxt] = useState('');
       function sendData(t){
        setTxt(t);
    }
return (
    <div>
        <h3>Parent</h3>
        <CompA sendData={sendData}></CompA>
        <hr />
        <CompB txt={txt}></CompB>
    </div>
)
}