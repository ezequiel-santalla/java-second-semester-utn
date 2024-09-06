package interfaces;

import model.Bus;

public interface Transport {
    public void start();
    public void stop();
    public int getCapacity(int capacity);
}
