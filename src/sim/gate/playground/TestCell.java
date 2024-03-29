package sim.gate.playground;

import sim.gate.cell.CellWithInputMux;

public class TestCell implements ITest {

    @Override
    public void execute() {
        scenario1();
        //scenario2();
    }

    private void scenario1() {
        int rows = 3;
        int cols = 3;
        CellWithInputMux[][] cell = new CellWithInputMux[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cell[i][j] = new CellWithInputMux();
            }
        }

        cell[1][1].mux1SetInputs(new boolean[]{cell[2][0].getOutput(), cell[0][1].getOutput()});
        cell[1][1].mux2SetInputs(new boolean[]{cell[0][0].getOutput(), cell[0][2].getOutput()});
        boolean result = cell[1][1].getOutput();
        System.out.println(result);

    }

    private void scenario2() {
        CellWithInputMux cell = new CellWithInputMux();
        cell.mux1SetInputs(new boolean[]{true, false});
        cell.mux2SetInputs(new boolean[]{false, true});
        cell.getOutput();

    }

    private void printBooleanArray(boolean[] array) {
        for (boolean element : array) {
            System.out.println(element);
        }
    }

}
