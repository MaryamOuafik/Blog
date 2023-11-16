//package bloggy.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//
//import jakarta.servlet.http.HttpServletRequest;
//
//@Configuration
//public class CorsConfig implements CorsConfigurationSource {
//
//    @Override
//    public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
//        CorsConfiguration config = new CorsConfiguration();
//        config.addAllowedOrigin("*");
//        config.addAllowedMethod("*");
//        config.addAllowedHeader("*");
//        config.setAllowCredentials(true);
//        return config;
//    }
//}
