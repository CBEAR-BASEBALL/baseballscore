package org.meerkatlabs.baseballscore.models.enums;

/**
 * A collection of results that were determined by an at bat.
 * @author Robert Robinson rerobins@meerkatlabs.org
 */
public enum AtBatResult {

    /**
     * The result is that the batter struck out.
     */
    STRIKE_OUT,

    /**
     * The result is that the batter flew out.
     */
    FLY_OUT,

    /**
     * The result is that the batter grounded out.
     */
    GROUND_OUT,

    /**
     * The result is that the batter hit a single.
     */
    SINGLE,

    /**
     * The result is that the batter hit a double.
     */
    DOUBLE,

    /**
     * The result is that the batter hit a triple.
     */
    TRIPLE,

    /**
     * The result is that the batter hit a home run.
     */
    HOME_RUN,

    /**
     * The result is that the batter walked.
     */
    BASE_ON_BALLS,

    /**
     * The result doesn't impact the state of the game, only the at bat.
     */
    NONE;

    /**
     * Is the batter out because of the at bat.
     * @return if the batter is out.
     */
    public boolean isOut() {
        switch (this) {
            case STRIKE_OUT:
            case FLY_OUT:
            case GROUND_OUT:
                return true;

            case SINGLE:
            case DOUBLE:
            case TRIPLE:
            case HOME_RUN:
            case BASE_ON_BALLS:
            case NONE:
            default:
                return false;
        }
    }

    /**
     * Does the result of the at bat advance the line up.
     * @return if the at bat should progress the game forward.
     */
    public boolean advanceLineup() {
        switch (this) {
            case NONE:
                return false;

            case STRIKE_OUT:
            case FLY_OUT:
            case GROUND_OUT:
            case SINGLE:
            case DOUBLE:
            case TRIPLE:
            case HOME_RUN:
            case BASE_ON_BALLS:
            default:
                return true;
        }
    }
}