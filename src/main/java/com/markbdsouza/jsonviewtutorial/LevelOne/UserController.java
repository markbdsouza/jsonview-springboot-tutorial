package com.markbdsouza.jsonviewtutorial.LevelOne;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /**
     * GET without any view
     *
     * @return created User
     */
    @GetMapping("/levelOne/default")
    public User getLevelOneUser() {
        return createUser();
    }

    /**
     * GET with Public View
     *
     * @return created User
     */
    @JsonView(LevelOneViews.Public.class)
    @GetMapping("/levelOne/public")
    public User getLevelOnePublicUser() {
        return createUser();
    }

    /**
     * GET with UserNameDetails View which extends Public
     *
     * @return created User
     */
    @JsonView(LevelOneViews.UserNameDetails.class)
    @GetMapping("/levelOne/name")
    public User getLevelOneNameUser() {
        return createUser();
    }

    /**
     * GET with UserDetails  View which extends UserNameDetails and also Public
     *
     * @return created User
     */
    @JsonView(LevelOneViews.UserDetails.class)
    @GetMapping("/levelOne/details")
    public User getLevelDetailsUser() {
        return createUser();
    }

    /**
     * GET with OtherDetails View which extends Public
     *
     * @return created User
     */
    @JsonView(LevelOneViews.OtherDetails.class)
    @GetMapping("/levelOne/other")
    public User getLevelOneOther() {
        return createUser();
    }

    /**
     * POST without any view
     *
     * @param user
     */
    @PostMapping("/levelOne/default")
    public User postLevelOneDefault(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    /**
     * POST with Public view
     *
     * @param user
     */
    @PostMapping("/levelOne/name")
    public User postLevelOneDetails(@RequestBody @JsonView(LevelOneViews.UserNameDetails.class) User user) {
        System.out.println(user);
        return user;
    }

    /**
     * @return created user
     */
    private static User createUser() {
        User user = new User();
        user.setUserId(1);
        user.setFirstName("Mark");
        user.setLastName("Dsouza");
        user.setEmail("mark.benjamin.dsouza@google.com");
        user.setIsActive(true);
        user.setOrganization("DEV.TO");
        return user;
    }

}
