package com.directi.training.ocp.exercise;

public class SpaceSlotResource implements Resource {

    @Override
    public int allocate() {
        int id = findFreeSpaceSlot();
        markSpaceSlotBusy(id);
        return id;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot() { return 0; }
    private void markSpaceSlotBusy(int id) {}
    private void markSpaceSlotFree(int id) {}
}
