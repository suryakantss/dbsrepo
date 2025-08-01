import './App.css'
import { Counter } from './components/counter'
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
    <hr />
    <Counter></Counter>
    </>
  )
}

export default App
