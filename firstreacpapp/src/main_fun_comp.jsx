import { createRoot } from 'react-dom/client';

function Greet(props){
  let msg3='This is function comp!!';
  return (
   <>
   <h3>{props.msg1}</h3>
   <h3>{props.msg2}</h3>
   <h3>{msg3}</h3>
   </> 
  )
}

                                                  
createRoot(document.getElementById('root')).render(
  <>
  <Greet msg1="Hello!!!" msg2="Welcome to Component"></Greet>
  <Greet msg1="Hi!!" msg2="Happy Learning!!"></Greet>
  </>
);


  
