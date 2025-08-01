import { createElement } from 'react';
import { createRoot } from 'react-dom/client';

//let hd1= createElement('h3',null,'Welcome to React Element!!');
//let hd2= createElement('h3',null,'A popular framework!!');
//let dv = createElement('div',null,hd1,hd2);

let hd1 = <h3>Welcome to JSX</h3>
let hd2 = <h3>Popular Web Framework!!</h3>

                                                  
createRoot(document.getElementById('root')).render(hd2);


  
