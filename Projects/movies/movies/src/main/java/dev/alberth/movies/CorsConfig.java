package dev.alberth.movies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Allow requests from the React application's origin (http://localhost:3000)
        config.addAllowedOrigin("http://localhost:3000");

        // You can configure other CORS settings here if needed

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
