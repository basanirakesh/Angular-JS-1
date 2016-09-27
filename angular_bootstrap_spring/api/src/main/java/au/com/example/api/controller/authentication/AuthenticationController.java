package au.com.example.api.controller.authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

<<<<<<< HEAD
 private static Logger log40 = LoggerFactory.getLogger(AuthenticationController.class);
=======
 private static Logger log39 = LoggerFactory.getLogger(AuthenticationController.class);
>>>>>>> branch 'master' of https://github.com/basanirakesh/Angular-JS-1.git

    @PreAuthorize("isAuthenticated()")
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    public void login() { }

    @RequestMapping(value = "/logout/validate", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public void logout(@RequestParam(value = "status") String status) {
<<<<<<< HEAD
        if(log40.isDebugEnabled()) {
            log40.debug("Logout status " + status);
=======
        if(log39.isDebugEnabled()) {
            log39.debug("Logout status " + status);
>>>>>>> branch 'master' of https://github.com/basanirakesh/Angular-JS-1.git
        }
    }
}
