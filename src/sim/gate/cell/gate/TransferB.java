package sim.gate.cell.gate;

import sim.gate.cell.Gate;

public class TransferB extends Gate {
    @Override
    protected boolean internalFunction() {
        return inputB;
    }
}
