
package com.example.demo.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo.service package. 
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

    private final static QName _SellProduct_QNAME = new QName("http://service.demo.example.com/", "sellProduct");
    private final static QName _GetDetail_QNAME = new QName("http://service.demo.example.com/", "getDetail");
    private final static QName _GetList_QNAME = new QName("http://service.demo.example.com/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://service.demo.example.com/", "getListResponse");
    private final static QName _SaveResponse_QNAME = new QName("http://service.demo.example.com/", "saveResponse");
    private final static QName _SellProductResponse_QNAME = new QName("http://service.demo.example.com/", "sellProductResponse");
    private final static QName _GetDetailResponse_QNAME = new QName("http://service.demo.example.com/", "getDetailResponse");
    private final static QName _Save_QNAME = new QName("http://service.demo.example.com/", "save");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDetail }
     * 
     */
    public GetDetail createGetDetail() {
        return new GetDetail();
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
     * Create an instance of {@link SellProduct }
     * 
     */
    public SellProduct createSellProduct() {
        return new SellProduct();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link GetDetailResponse }
     * 
     */
    public GetDetailResponse createGetDetailResponse() {
        return new GetDetailResponse();
    }

    /**
     * Create an instance of {@link SellProductResponse }
     * 
     */
    public SellProductResponse createSellProductResponse() {
        return new SellProductResponse();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demo.example.com/", name = "sellProduct")
    public JAXBElement<SellProduct> createSellProduct(SellProduct value) {
        return new JAXBElement<SellProduct>(_SellProduct_QNAME, SellProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demo.example.com/", name = "getDetail")
    public JAXBElement<GetDetail> createGetDetail(GetDetail value) {
        return new JAXBElement<GetDetail>(_GetDetail_QNAME, GetDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demo.example.com/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demo.example.com/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demo.example.com/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demo.example.com/", name = "sellProductResponse")
    public JAXBElement<SellProductResponse> createSellProductResponse(SellProductResponse value) {
        return new JAXBElement<SellProductResponse>(_SellProductResponse_QNAME, SellProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demo.example.com/", name = "getDetailResponse")
    public JAXBElement<GetDetailResponse> createGetDetailResponse(GetDetailResponse value) {
        return new JAXBElement<GetDetailResponse>(_GetDetailResponse_QNAME, GetDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.demo.example.com/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

}
