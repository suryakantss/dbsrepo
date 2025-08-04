
import './App.css'
import { Link, Route, Routes } from 'react-router'
import { Home } from './components/home/home'
import { Products } from './components/products/products'
import { Details } from './components/products/details'

function App() {

  return (
    <>
      <div>
        <Link to=''>Home</Link>
        <Link to='products'>Product Manager</Link>
      </div>
      <div>
        <Routes>
          <Route path='' element={<Home></Home>}></Route>
          <Route path='products' element={<Products></Products>}>
            <Route path='details/:id' element={<Details></Details>}></Route>
          </Route>
        </Routes>
      </div>
    </>
  )
}

export default App
