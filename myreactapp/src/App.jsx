import { Link, Route, Routes } from 'react-router';
import './App.css'
import { Courses } from './components/courses';
import { Counter } from './components/counter';
import { Home } from './components/home';
import Login from './components/login';




function App() {
  return (
    <>
  <div>
    <Link to=''>Home</Link>
    <Link to='login'>Login</Link>
    <Link to='courses'>Course</Link>
    <Link to='counter'>Counter</Link>
  </div>
  <div>
    <Routes>
      <Route path='' element={<Home></Home>}></Route>
      <Route path='login' element={<Login></Login>}></Route>
      <Route path='courses' element={<Courses></Courses>}></Route>
      <Route path='counter' element={<Counter></Counter>}></Route>
    </Routes>
    
  </div>

    </>
  )
}

export default App
