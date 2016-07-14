import processing.core.PVector;

import java.util.Random;

/**
 * Created at 14/07/16
 *
 * @author tmshv
 */
public class RandomWalker extends Agent {
    private Random random = new Random();

    public RandomWalker(float maxForce, float maxSpeed, int agentColor) {
        super(maxForce, maxSpeed, agentColor);
    }

    @Override
    public void run() {
        float angle = (float) (random.nextDouble() * Math.PI * 2);
        PVector direction = PVector.fromAngle(angle);
        applyForce(direction);
        super.run();
    }
}
