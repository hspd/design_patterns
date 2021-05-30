package in.impetusits;

import com.sun.jdi.ClassNotPreparedException;

/**
 *
 * @author Hrishikesh Pisal
 */
abstract class Computer {

    private HardDisk harddisk;
    private Memory memory;

    private void assembleComputer(){
        harddisk = selectHardDisk();
        memory = selectMemory();
    }
    
    static Computer getComputer(int compType) {
        Computer comp;
        if (compType == 1) {
            comp = new OfficeComputer();
        } else if (compType == 2) {
            comp =  new GamingComputer();
        } else if (compType == 3) {
            comp =  new DeveloperComputer();
        } else {
            throw new ClassNotPreparedException("We do not have such computer as of now");
        }
        comp.assembleComputer();
        return comp;
    }

    protected HardDisk getHardDisk() {
        return harddisk;
    }

    protected Memory getMemory() {
        return memory;
    }

    abstract protected HardDisk selectHardDisk();
    abstract Memory selectMemory();

    @Override
    public String toString() {
        return "Computer{" + "harddisk=" + harddisk + ", memory=" + memory + '}';
    }

    
}
