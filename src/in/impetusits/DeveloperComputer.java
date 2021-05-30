
package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
public class DeveloperComputer extends Computer {

    public DeveloperComputer() {
        harddisk = new SSD();
        memory = new SDRM5();
    }

  
    @Override
    protected HardDisk getHardDisk() {
        return harddisk;
    }

    @Override
    protected Memory getMemory() {
        return memory;
    }
}
