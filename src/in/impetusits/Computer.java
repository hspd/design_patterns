
package in.impetusits;

/**
 *
 * @author Hrishikesh Pisal
 */
abstract class Computer {
    protected  HardDisk harddisk;
    protected  Memory memory;
    abstract protected HardDisk getHardDisk();
    abstract protected Memory getMemory();
    
    
}
