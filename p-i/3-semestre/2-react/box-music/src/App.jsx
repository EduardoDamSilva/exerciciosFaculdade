import React from 'react'
import api from "./api"

function App() {
  const [musicas, setMusicas] = React.useState(null);
  console.log(musicas)

  function listar() {
    api.get()
      .then((respostaObtida) => {
        setMusicas(respostaObtida.data)
      })
      .catch((erroOcorrido) => {
        console.log(erroOcorrido);
      })
  }

  return (
    <>
    
      <button onClick={listar}>Listar</button>
      {musicas && musicas.map(musica => {
        return <div key={musica.id}>
          <p>{musica.nome}</p>
          <p>{musica.genero}</p>
          <p>{musica.artista}</p>
          <img src={musica.imagem} alt="" />
        </div>
      })}
    </>
  )
}

export default App
