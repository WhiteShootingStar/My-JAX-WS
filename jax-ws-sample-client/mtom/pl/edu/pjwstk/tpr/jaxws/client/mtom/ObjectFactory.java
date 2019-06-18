
package pl.edu.pjwstk.tpr.jaxws.client.mtom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.edu.pjwstk.tpr.jaxws.client.mtom package. 
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

    private final static QName _DownloadResponse_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "downloadResponse");
    private final static QName _GetList_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "getListResponse");
    private final static QName _FilterListResponse_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "filterListResponse");
    private final static QName _CreateMyImageResponse_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "createMyImageResponse");
    private final static QName _Download_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "download");
    private final static QName _CreateMyImage_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "createMyImage");
    private final static QName _FilterList_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "filterList");
    private final static QName _UploadImageResponse_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "uploadImageResponse");
    private final static QName _UploadImage_QNAME = new QName("http://mtom.jaxws.tpr.pjwstk.edu.pl/", "uploadImage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.edu.pjwstk.tpr.jaxws.client.mtom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FilterListResponse }
     * 
     */
    public FilterListResponse createFilterListResponse() {
        return new FilterListResponse();
    }

    /**
     * Create an instance of {@link CreateMyImageResponse }
     * 
     */
    public CreateMyImageResponse createCreateMyImageResponse() {
        return new CreateMyImageResponse();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link CreateMyImage }
     * 
     */
    public CreateMyImage createCreateMyImage() {
        return new CreateMyImage();
    }

    /**
     * Create an instance of {@link DownloadResponse }
     * 
     */
    public DownloadResponse createDownloadResponse() {
        return new DownloadResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link UploadImage }
     * 
     */
    public UploadImage createUploadImage() {
        return new UploadImage();
    }

    /**
     * Create an instance of {@link FilterList }
     * 
     */
    public FilterList createFilterList() {
        return new FilterList();
    }

    /**
     * Create an instance of {@link UploadImageResponse }
     * 
     */
    public UploadImageResponse createUploadImageResponse() {
        return new UploadImageResponse();
    }

    /**
     * Create an instance of {@link MyImage }
     * 
     */
    public MyImage createMyImage() {
        return new MyImage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "downloadResponse")
    public JAXBElement<DownloadResponse> createDownloadResponse(DownloadResponse value) {
        return new JAXBElement<DownloadResponse>(_DownloadResponse_QNAME, DownloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "filterListResponse")
    public JAXBElement<FilterListResponse> createFilterListResponse(FilterListResponse value) {
        return new JAXBElement<FilterListResponse>(_FilterListResponse_QNAME, FilterListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMyImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "createMyImageResponse")
    public JAXBElement<CreateMyImageResponse> createCreateMyImageResponse(CreateMyImageResponse value) {
        return new JAXBElement<CreateMyImageResponse>(_CreateMyImageResponse_QNAME, CreateMyImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMyImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "createMyImage")
    public JAXBElement<CreateMyImage> createCreateMyImage(CreateMyImage value) {
        return new JAXBElement<CreateMyImage>(_CreateMyImage_QNAME, CreateMyImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "filterList")
    public JAXBElement<FilterList> createFilterList(FilterList value) {
        return new JAXBElement<FilterList>(_FilterList_QNAME, FilterList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "uploadImageResponse")
    public JAXBElement<UploadImageResponse> createUploadImageResponse(UploadImageResponse value) {
        return new JAXBElement<UploadImageResponse>(_UploadImageResponse_QNAME, UploadImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtom.jaxws.tpr.pjwstk.edu.pl/", name = "uploadImage")
    public JAXBElement<UploadImage> createUploadImage(UploadImage value) {
        return new JAXBElement<UploadImage>(_UploadImage_QNAME, UploadImage.class, null, value);
    }

}
