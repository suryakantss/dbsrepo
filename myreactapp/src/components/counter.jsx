import { Component } from "react";
export class Counter extends Component {
    state = { count: 10 };
    inc = () => {
        this.setState({count: this.state.count + 1});
    }
    dec = () => {
        this.setState({count: this.state.count + 1});
    }
    render() {
        return (
            <div>
                <h3>Counter : {this.state.count}</h3>
                <div>
                    <button onClick={this.inc}>INC</button>
                    <button onClick={this.dec}>DEC</button>
                </div>
            </div>
        )
    }

}