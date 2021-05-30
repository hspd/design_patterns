
package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
public class DeveloperComputer extends Computer {

    public DeveloperComputer() {
        super();
    }

   @Override
    public Memory setMemory() {
        return new SDRM5();
    }

    @Override
    public HardDisk setHardDisk() {
        return new SATA();
    }


  
}
