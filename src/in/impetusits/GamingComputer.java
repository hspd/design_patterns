package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
public class GamingComputer extends Computer {

    @Override
    protected HardDisk selectHardDisk() {
       return  new SSD();
    }

    @Override
    Memory selectMemory() {
        return new SDRM5();
    }

}
