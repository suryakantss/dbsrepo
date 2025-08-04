import { Link, Route, Routes } from 'react-router';
import './App.css'
import { Home } from './components/home';
import { lazy, Suspense } from 'react';




function App() {
  let Counter = lazy(() => import('./components/counter'));
  let Login = lazy(() => import('./components/login'));
  let Courses = lazy(() => import('./components/courses'));
  let Register = lazy(() => import('./components/register'));
  let Parent = lazy(() => import('./components/parent/parent'));
  let Users = lazy(() => import('./components/users'));

  return (
    <>
      <div>
        <Link to=''>Home</Link>
        <Link to='login'>Login</Link>
        <Link to='courses'>Course</Link>
        <Link to='counter'>Counter</Link>
        <Link to='parent'>Parent</Link>
        <Link to='users'>Users</Link>
      </div>
      <div>
        <Suspense fallback={<div>wait loading....</div>}>
          <Routes>
            <Route path='' element={<Home></Home>}></Route>
            <Route path='login' element={<Login></Login>}></Route>
            <Route path='courses' element={<Courses></Courses>}></Route>
            <Route path='counter' element={<Counter></Counter>}></Route>
            <Route path='register' element={<Register></Register>}></Route>
            <Route path='parent' element={<Parent></Parent>}></Route>
            <Route path='users' element={<Users></Users>}></Route>
          </Routes>
        </Suspense>
      </div>

    </>
  )
}

export default App
