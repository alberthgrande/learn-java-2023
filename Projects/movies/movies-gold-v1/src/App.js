import "./App.css";
import api from "./api/axiosConfig";
import { useState, useEffect } from "react";

function App() {
  const [movies, setMovies] = useState([]);

  const getMovies = async () => {
    try {
      const response = await api.get("/api/v1/movies");
      console.log(response.data);
      setMovies(response.data);
    } catch (error) {
      console.error(error); // Use "console.error" instead of "console.log" for errors
    }
  };

  useEffect(() => {
    getMovies();
  }, []);

  return (
    <div className="App">
      <h1>Movie List</h1>
      <ul>
        {movies.map((movie) => (
          <li key={movie.imdbId}>{movie.title}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
