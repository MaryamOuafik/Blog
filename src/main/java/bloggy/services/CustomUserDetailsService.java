//package bloggy.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import bloggy.models.User;
//import bloggy.repositories.UserRepository;
//import bloggy.models.LoginForm;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository; // You need to define a UserRepository for database access.
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // Retrieve user information from the database based on the username.
//        User user = userRepository.findByEmail(username);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//
//        // Create and return a UserDetails object with the retrieved user information.
//        return org.springframework.security.core.userdetails.User.builder()
//            .username(user.getUsername())
//            .password(user.getPassword()) // Ensure that you properly hash the password stored in the database.
//            .roles(user.getRole())
//            .build();
//    }
//}
