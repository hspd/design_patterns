package in.impetusits;

import com.sun.jdi.ClassNotPreparedException;

/**
 *
 * @author Hrishikesh Pisal
 */
abstract class Computer {

    abstract protected HardDisk setHardDisk();

    abstract protected Memory setMemory();

//    public Computer() {
//        harddisk = setHardDisk();
//        memory = setMemory();
//    }


    static Computer getComputer(int compType) {
        Computer computer;
        if (compType == 1) {
            computer = new OfficeComputer();
        } else if (compType == 2) {
            computer = new GamingComputer();
        } else if (compType == 3) {
            computer = new DeveloperComputer();
        } else {
            throw new ClassNotPreparedException("We do not have such computer as of now");
        }
         computer.assembleComputer();
        return computer;
    }

    public HardDisk getHardDisk() {
        return harddisk;
    }

    public Memory getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Computer{" + "harddisk=" + harddisk + ", memory=" + memory + '}';
    }

    private HardDisk harddisk;
    private Memory memory;

    private void assembleComputer() {
     harddisk = setHardDisk();
        memory = setMemory();  
    }
}
