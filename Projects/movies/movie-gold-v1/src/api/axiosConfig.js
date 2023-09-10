import axios from "axios";
import { createProxyMiddleware } from "http-proxy-middleware";

// Create an instance of Axios with custom configuration
const axiosInstance = axios.create({
  baseURL: "http://localhost:3000", // Your proxy server URL
  headers: { "ngrok-skip-browser-warning": "true" },
});

// Create a proxy middleware for requests to the remote server
const proxyMiddleware = createProxyMiddleware({
  target: "https://063d-158-62-82-255.ngrok-free.app",
  changeOrigin: true,
  pathRewrite: {
    "^/api": "/api/v1", // Optional: Rewrite the URL if needed
  },
});

// Add the proxy middleware to your development server (Express.js or similar)
// Make sure this code runs before your routes are defined
app.use("/api", proxyMiddleware);

export default axiosInstance;
