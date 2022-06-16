package com.markbdsouza.jsonviewtutorial.level2;

/**
 * List of Views for LevelTwo functionality.
 */
public class LevelTwoViews {
    /*
     * Any variable associated with Public will be picked up by this view
     */
    public interface Public {
    }

    /*
     * Any variable associated with BasicStudentDetails or Public will be picked up by this view
     */
    public interface BasicStudentDetails extends Public {
    }

    /*
     * Any variable associated with BasicStudentDetails, AllStudentDetails or Public will be picked up by this view
     */
    public interface AllStudentDetails extends BasicStudentDetails {
    }

}
