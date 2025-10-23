package com.directi.training.ocp.exercise;

public class TimeSlotResource implements Resource {

    @Override
    public int allocate() {
        int id = findFreeTimeSlot();
        markTimeSlotBusy(id);
        return id;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot() { return 0; }
    private void markTimeSlotBusy(int id) {}
    private void markTimeSlotFree(int id) {}
}

