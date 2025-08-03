import { useState } from "react"
export function Counter() {
    let [counter, setCounter] = useState(0);
    function inc() {
        setCounter(counter + 1);
    }
    function dec() {
        setCounter(counter - 1);
    }
    return (
        <>
            <div>
                <h3 data-testid='countervalue'>{counter}</h3>
            </div>
            <div>
                <button onClick={inc}>INC</button>
                <button onClick={dec}>DEC</button>
            </div>
        </>
    )
}