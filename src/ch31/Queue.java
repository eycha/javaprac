package ch31;

public interface Queue {
    void enQueue(String title);
    String deQueue();

    int getSize();
}
