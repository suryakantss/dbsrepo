import { Component } from 'react';
import { createRoot } from 'react-dom/client';

class Greet extends Component {
  constructor(props) {
    super(props);
  }
  render() {
    return (
    <div>
      <h3>{this.props.msg1}</h3>
      <h3>{this.props.msg2}</h3>
    </div>
    )
  }
}


createRoot(document.getElementById('root')).render(
  <>
    <Greet msg1="Hello!!!" msg2="Welcome to Component"></Greet>
    <Greet msg1="Hi!!" msg2="Happy Learning!!"></Greet>
  </>
);



