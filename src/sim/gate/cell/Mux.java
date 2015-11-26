package sim.gate.cell;

public class Mux {
    private int selectedInput;
    private int selectLinesNumber;
    private int maxInputs;
    private boolean[] inputs;

    public Mux () {
        setSelectLinesNumber(1); // 1 line = 2 inputs
        setSelectedInput(0); // select first input
    }
    public Mux(int selectLinesNumber) {
        setSelectLinesNumber(selectLinesNumber);
        setupMaxInputs();
    }

    public void setSelectLinesNumber(int selectLinesNumber) {
        this.selectLinesNumber = selectLinesNumber;
        setupMaxInputs();
    }

    public boolean getOutput () {
        return inputs[this.selectedInput];
    }

    public boolean[] getInputs() {
        return inputs;
    }

    public void setInputs(boolean[] inputs) {
        this.inputs = inputs;
    }

    public int getOutput (int[] inputs, int selectedInput) {
        if (selectedInput > this.maxInputs -1 || selectedInput < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return inputs[selectedInput];
    }

    public int getMaxInputs () {
        return maxInputs;
    }

    public void setSelectedInput(int selectedInput) {
        if (selectedInput > this.maxInputs -1 || selectedInput < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.selectedInput = selectedInput;
    }

    public int getSelectedInput() {
        return selectedInput;
    }

    private void setupMaxInputs () {
        if(this.selectLinesNumber <= 0 ) {
            throw new IndexOutOfBoundsException();
        }
        int base2 = 2;
        this.maxInputs = (int) Math.pow(base2, this.selectLinesNumber);
        initializeInputs();
    }
    private void initializeInputs() { // check if in reinitialization the lost of state of inputs create any trouble
        inputs = new boolean[maxInputs];
        for(int i = 0; i < maxInputs; i++) {
            inputs[i] = false;
        }
    }


}