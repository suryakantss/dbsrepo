import './App.css'
import { Courses } from './components/courses'
import { Home } from './components/home'
import { Login } from './components/login'

function App() {
  return (
    <>
    <Home></Home>
    <hr />
    <Login></Login>
    <hr />
    <Courses></Courses>
    </>
  )
}

export default App
