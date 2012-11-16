
package WebService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WebService package. 
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

    private final static QName _Consultar_QNAME = new QName("http://WebService/", "consultar");
    private final static QName _PruebaResponse_QNAME = new QName("http://WebService/", "pruebaResponse");
    private final static QName _Guardar_QNAME = new QName("http://WebService/", "guardar");
    private final static QName _ConsultarResponse_QNAME = new QName("http://WebService/", "consultarResponse");
    private final static QName _GuardarResponse_QNAME = new QName("http://WebService/", "guardarResponse");
    private final static QName _Prueba_QNAME = new QName("http://WebService/", "prueba");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WebService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Guardar }
     * 
     */
    public Guardar createGuardar() {
        return new Guardar();
    }

    /**
     * Create an instance of {@link Consultar }
     * 
     */
    public Consultar createConsultar() {
        return new Consultar();
    }

    /**
     * Create an instance of {@link PruebaResponse }
     * 
     */
    public PruebaResponse createPruebaResponse() {
        return new PruebaResponse();
    }

    /**
     * Create an instance of {@link ConsultarResponse }
     * 
     */
    public ConsultarResponse createConsultarResponse() {
        return new ConsultarResponse();
    }

    /**
     * Create an instance of {@link Prueba }
     * 
     */
    public Prueba createPrueba() {
        return new Prueba();
    }

    /**
     * Create an instance of {@link GuardarResponse }
     * 
     */
    public GuardarResponse createGuardarResponse() {
        return new GuardarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consultar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "consultar")
    public JAXBElement<Consultar> createConsultar(Consultar value) {
        return new JAXBElement<Consultar>(_Consultar_QNAME, Consultar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PruebaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "pruebaResponse")
    public JAXBElement<PruebaResponse> createPruebaResponse(PruebaResponse value) {
        return new JAXBElement<PruebaResponse>(_PruebaResponse_QNAME, PruebaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guardar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "guardar")
    public JAXBElement<Guardar> createGuardar(Guardar value) {
        return new JAXBElement<Guardar>(_Guardar_QNAME, Guardar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "consultarResponse")
    public JAXBElement<ConsultarResponse> createConsultarResponse(ConsultarResponse value) {
        return new JAXBElement<ConsultarResponse>(_ConsultarResponse_QNAME, ConsultarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "guardarResponse")
    public JAXBElement<GuardarResponse> createGuardarResponse(GuardarResponse value) {
        return new JAXBElement<GuardarResponse>(_GuardarResponse_QNAME, GuardarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prueba }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "prueba")
    public JAXBElement<Prueba> createPrueba(Prueba value) {
        return new JAXBElement<Prueba>(_Prueba_QNAME, Prueba.class, null, value);
    }

}
