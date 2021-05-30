package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
public class OfficeComputer extends Computer {
@Override
    protected HardDisk selectHardDisk() {
       return  new SATA();
    }

    @Override
    Memory selectMemory() {
        return new DDR2();
    }

    
}
