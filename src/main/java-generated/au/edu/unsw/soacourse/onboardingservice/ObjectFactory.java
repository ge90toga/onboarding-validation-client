
package au.edu.unsw.soacourse.onboardingservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.edu.unsw.soacourse.onboardingservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidateAddressFault_QNAME = new QName("http://onboardingservice.soacourse.unsw.edu.au", "ValidateAddressFault");
    private final static QName _ValidateDriverLicenseFault_QNAME = new QName("http://onboardingservice.soacourse.unsw.edu.au", "ValidateDriverLicenseFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.edu.unsw.soacourse.onboardingservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateAddressRequest }
     * 
     */
    public ValidateAddressRequest createValidateAddressRequest() {
        return new ValidateAddressRequest();
    }

    /**
     * Create an instance of {@link ValidateAddressResponse }
     * 
     */
    public ValidateAddressResponse createValidateAddressResponse() {
        return new ValidateAddressResponse();
    }

    /**
     * Create an instance of {@link ValidateDriverLicenseRequest }
     * 
     */
    public ValidateDriverLicenseRequest createValidateDriverLicenseRequest() {
        return new ValidateDriverLicenseRequest();
    }

    /**
     * Create an instance of {@link ValidateDriverLicenseResponse }
     * 
     */
    public ValidateDriverLicenseResponse createValidateDriverLicenseResponse() {
        return new ValidateDriverLicenseResponse();
    }

    /**
     * Create an instance of {@link ServiceFaultType }
     * 
     */
    public ServiceFaultType createServiceFaultType() {
        return new ServiceFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onboardingservice.soacourse.unsw.edu.au", name = "ValidateAddressFault")
    public JAXBElement<ServiceFaultType> createValidateAddressFault(ServiceFaultType value) {
        return new JAXBElement<ServiceFaultType>(_ValidateAddressFault_QNAME, ServiceFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onboardingservice.soacourse.unsw.edu.au", name = "ValidateDriverLicenseFault")
    public JAXBElement<ServiceFaultType> createValidateDriverLicenseFault(ServiceFaultType value) {
        return new JAXBElement<ServiceFaultType>(_ValidateDriverLicenseFault_QNAME, ServiceFaultType.class, null, value);
    }

}
