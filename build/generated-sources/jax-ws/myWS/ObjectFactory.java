
package myWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the myWS package. 
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

    private final static QName _AllAccounts_QNAME = new QName("http://ws/", "allAccounts");
    private final static QName _AllAccountsResponse_QNAME = new QName("http://ws/", "allAccountsResponse");
    private final static QName _AllClienti_QNAME = new QName("http://ws/", "allClienti");
    private final static QName _AllClientiResponse_QNAME = new QName("http://ws/", "allClientiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: myWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllAccounts }
     * 
     */
    public AllAccounts createAllAccounts() {
        return new AllAccounts();
    }

    /**
     * Create an instance of {@link AllAccountsResponse }
     * 
     */
    public AllAccountsResponse createAllAccountsResponse() {
        return new AllAccountsResponse();
    }

    /**
     * Create an instance of {@link AllClienti }
     * 
     */
    public AllClienti createAllClienti() {
        return new AllClienti();
    }

    /**
     * Create an instance of {@link AllClientiResponse }
     * 
     */
    public AllClientiResponse createAllClientiResponse() {
        return new AllClientiResponse();
    }

    /**
     * Create an instance of {@link ContDTO }
     * 
     */
    public ContDTO createContDTO() {
        return new ContDTO();
    }

    /**
     * Create an instance of {@link ClientDTO }
     * 
     */
    public ClientDTO createClientDTO() {
        return new ClientDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "allAccounts")
    public JAXBElement<AllAccounts> createAllAccounts(AllAccounts value) {
        return new JAXBElement<AllAccounts>(_AllAccounts_QNAME, AllAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "allAccountsResponse")
    public JAXBElement<AllAccountsResponse> createAllAccountsResponse(AllAccountsResponse value) {
        return new JAXBElement<AllAccountsResponse>(_AllAccountsResponse_QNAME, AllAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllClienti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "allClienti")
    public JAXBElement<AllClienti> createAllClienti(AllClienti value) {
        return new JAXBElement<AllClienti>(_AllClienti_QNAME, AllClienti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllClientiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "allClientiResponse")
    public JAXBElement<AllClientiResponse> createAllClientiResponse(AllClientiResponse value) {
        return new JAXBElement<AllClientiResponse>(_AllClientiResponse_QNAME, AllClientiResponse.class, null, value);
    }

}
