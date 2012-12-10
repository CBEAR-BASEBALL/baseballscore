/*
 * This file is part of BaseballScore.
 *
 * BaseballScore is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BaseballScore is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with BaseballScore.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.meerkatlabs.baseballscore.models;

import org.meerkatlabs.baseballscore.models.enums.AtBatResult;

/**
 * Created with IntelliJ IDEA.
 * User: rerobins
 * Date: 9/24/12
 * Time: 11:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class AtBat {

    /**
     * Pitcher.
     */
    Player pitcher;

    /**
     * Batter.
     */
    Player batter;

    /**
     * How did it go down...
     */
    AtBatResult result;

    /**
     * Current Strike count.
     */
    int strikes;

    /**
     * Current balls.
     */
    int balls;

    /**
     * Current fouls.
     */
    int fouls;

    /**
     * Constructor.
     * @param pitcher the pitcher for this at bat.
     * @param batter the batter for this at bat.
     */
    public AtBat(final Player pitcher, final Player batter) {
        this.pitcher = pitcher;
        this.batter = batter;
    }

    /**
     * Return the pitcher for this at bat
     * @return pitcher.
     */
    public Player getPitcher() {
        return pitcher;
    }

    /**
     * Return the batter for this at bat.
     * @return the player that is batting.
     */
    public Player getBatter() {
        return batter;
    }

    /**
     * Result accessor.
     * @return result.
     */
    public AtBatResult getResult() {
        return result;
    }

    /**
     * Strikes accessor.
     * @return strike count.
     */
    public int getStrikes() {
        return strikes;
    }

    /**
     * Balls accessor.
     * @return balls.
     */
    public int getBalls() {
        return balls;
    }

    /**
     * Fouls accessor.
     * @return foul count.
     */
    public int getFouls() {
        return fouls;
    }

    /**
     * Throw a strike and return the result.
     * @return the result from throwing a strike.
     */
    public AtBatResult throwStrike() {
        strikes++;
        if (strikes == 3) {
            return AtBatResult.STRIKE_OUT;
        }

        return AtBatResult.NONE;
    }

    /**
     * Throw a ball and return the result.
     * @return the result from throwing a ball.
     */
    public AtBatResult throwBall() {
        balls++;
        if (balls == 4) {
            return AtBatResult.BASE_ON_BALLS;
        }

        return AtBatResult.NONE;
    }
}
