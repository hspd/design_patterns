package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
public class GamingComputer extends Computer {

    public GamingComputer() {
        super();
    }

    
    @Override
    public Memory setMemory() {
        return new SDRM5();
    }

    @Override
    public HardDisk setHardDisk() {
        return new SSD();
    }

   
}
