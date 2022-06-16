package com.markbdsouza.jsonviewtutorial.level1;

/**
 * List of Views for LevelOne functionality.
 */
public class LevelOneViews {
    /*
     * Any variable associated with Public will be picked up by this view
     */
    public interface Public {
    }

    /*
     * Any variable associated with UserNameDetails or Public will be picked up by this view
     */
    public interface UserNameDetails extends Public {
    }

    /*
     * Any variable associated with UserDetails, UserNameDetails or Public(since UserNameDetails internally
     *  extends Public)  will be picked up by this view
     */
    public interface UserDetails extends UserNameDetails {
    }

    /*
     * Any variable associated with OtherDetails or Public will be picked up by this view.
     * Note: Will not pick up variables associated with UserNameDetails or UserDetails
     */
    public interface OtherDetails extends Public {
    }
}
