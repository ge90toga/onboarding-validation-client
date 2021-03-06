
package au.edu.unsw.soacourse.onboardingservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.4
 * 2017-03-25T20:47:02.018+11:00
 * Generated source version: 3.0.4
 */

@WebFault(name = "ValidateAddressFault", targetNamespace = "http://onboardingservice.soacourse.unsw.edu.au")
public class ValidateAddressFaultMsg extends Exception {
    
    private au.edu.unsw.soacourse.onboardingservice.ServiceFaultType validateAddressFault;

    public ValidateAddressFaultMsg() {
        super();
    }
    
    public ValidateAddressFaultMsg(String message) {
        super(message);
    }
    
    public ValidateAddressFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidateAddressFaultMsg(String message, au.edu.unsw.soacourse.onboardingservice.ServiceFaultType validateAddressFault) {
        super(message);
        this.validateAddressFault = validateAddressFault;
    }

    public ValidateAddressFaultMsg(String message, au.edu.unsw.soacourse.onboardingservice.ServiceFaultType validateAddressFault, Throwable cause) {
        super(message, cause);
        this.validateAddressFault = validateAddressFault;
    }

    public au.edu.unsw.soacourse.onboardingservice.ServiceFaultType getFaultInfo() {
        return this.validateAddressFault;
    }
}
