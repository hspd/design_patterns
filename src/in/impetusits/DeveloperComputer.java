
package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
public class DeveloperComputer extends Computer {

   @Override
    protected HardDisk selectHardDisk() {
       return  new SSD();
    }

    @Override
    Memory selectMemory() {
        return new SDRM5();
    }
  
}
