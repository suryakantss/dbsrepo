import { Link, Route, Routes } from 'react-router';
import './App.css'
import { Home } from './components/home';
import { lazy, Suspense } from 'react';




function App() {
  let Counter = lazy(() => import('./components/counter'));
  let Login = lazy(() => import('./components/login'));
  let Courses = lazy(() => import('./components/courses'));
  let Register = lazy(() => import('./components/register'));
  return (
    <>
      <div>
        <Link to=''>Home</Link>
        <Link to='login'>Login</Link>
        <Link to='courses'>Course</Link>
        <Link to='counter'>Counter</Link>
        <Link to='register'>Register</Link>

      </div>
      <div>
        <Suspense fallback={<div>wait loading....</div>}>
          <Routes>
            <Route path='' element={<Home></Home>}></Route>
            <Route path='login' element={<Login></Login>}></Route>
            <Route path='courses' element={<Courses></Courses>}></Route>
            <Route path='counter' element={<Counter></Counter>}></Route>
            <Route path='register' element={<Register></Register>}></Route>

          </Routes>
        </Suspense>
      </div>

    </>
  )
}

export default App
