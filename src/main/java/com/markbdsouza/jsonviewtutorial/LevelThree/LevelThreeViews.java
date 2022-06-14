package com.markbdsouza.jsonviewtutorial.LevelThree;

/**
 * List of Views for LevelThree functionality.
 */
public class LevelThreeViews {
    /*
     * Any variable associated with Public will be picked up by this view
     */
    public interface Public {
    }

    /*
     * Any variable associated with CustomerDetails or Public will be picked up by this view
     */
    public interface CustomerDetails extends Public {
    }

}
