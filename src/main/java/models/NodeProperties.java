package models;

public class NodeProperties {

    private int processorId;
    private int startingTime;
    private int inDegree;

    public NodeProperties() {
    }

    public NodeProperties(int processorId, int startingTime) {
        this.processorId = processorId;
        this.startingTime = startingTime;
    }

    public int getProcessorId() {
        return processorId;
    }

    public void setProcessorId(int processorId) {
        this.processorId = processorId;
    }

    public int getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(int startingTime) {
        this.startingTime = startingTime;
    }

    public int getInDegree() {
        return inDegree;
    }

    public void setInDegree(int inDegree) {
        this.inDegree = inDegree;
    }

    @Override
    public String toString() {
        return String.format("NodeProperty{processorId=%d, startTime=%d}", this.processorId, this.startingTime);
    }
}
