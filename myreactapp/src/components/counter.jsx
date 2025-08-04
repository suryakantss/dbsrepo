import { Component } from "react";
export default class Counter extends Component {
    state = { count: 10 };
    inc = () => {
        this.setState({count: this.state.count + 1});
    }
    dec = () => {
        this.setState({count: this.state.count + 1});
    }

    componentDidMount(){
        console.log('Counter Mounted...')
    }
    componentDidUpdate(pprops,pstate){
        console.log('Counter Updated...' + JSON.stringify(pstate));
    }

    shouldComponentUpdate(){
        return true;
    }
    componentWillUnmount(){
        console.log('Counter Unmounted....')
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