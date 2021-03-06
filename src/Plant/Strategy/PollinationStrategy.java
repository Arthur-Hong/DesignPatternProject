/**
 * Strategy
 * interface pollination strategy
 * @author TMY, QXC
 */

package Plant.Strategy;

import Plant.Corn;
import Plant.Rice;

public interface PollinationStrategy {
    void pollinate(Corn c);
    void pollinate(Rice r);
}
