package sim.gate;

import sim.gate.playground.ITest;
import sim.gate.playground.TestCCS2;

public class Main {

    public static void main(String[] args) {

        // Emulator emulator = new EmulatorCCS2();

        ITest test = new TestCCS2();//TestRsLatchWithNand();//TestCCS2();
        test.execute(); // TODO: 9/12/15 fix results
    }

}
