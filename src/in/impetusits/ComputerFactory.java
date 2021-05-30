package in.impetusits;

import com.sun.jdi.ClassNotPreparedException;

/**
 *
 * @author Hrishikesh Pisal
 */
class ComputerFactory {

    static Computer getComputer(int compType) {
        if (compType == 1) {
            return new OfficeComputer();
        } else if (compType == 2) {
            return new GamingComputer();
        } else if (compType == 3) {
            return new DeveloperComputer();
        } else {
            throw new ClassNotPreparedException("We do not have such computer as of now");
        }
    }

}
