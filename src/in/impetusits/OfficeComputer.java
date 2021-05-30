package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
public class OfficeComputer extends Computer {

    public OfficeComputer() {
        harddisk = new SATA();
        memory = new DDR2();
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
