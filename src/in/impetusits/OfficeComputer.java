package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
public class OfficeComputer extends Computer {

    public OfficeComputer() {
        super();
    }
    
 @Override
    public Memory setMemory() {
        return new DDR2();
    }

    @Override
    public HardDisk setHardDisk() {
        return new SATA();
    }

}
