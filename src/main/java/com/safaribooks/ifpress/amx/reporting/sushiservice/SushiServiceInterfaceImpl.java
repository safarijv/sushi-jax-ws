
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.safaribooks.ifpress.amx.reporting.sushiservice;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-26T14:54:36.619-04:00
 * Generated source version: 2.7.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "SushiService",
                      portName = "SushiServicePort",
                      targetNamespace = "SushiService",
                      wsdlLocation = "classpath:counter_sushi4_0.wsdl",
                      endpointInterface = "com.safaribooks.ifpress.amx.reporting.sushiservice.SushiServiceInterface")
                      
public class SushiServiceInterfaceImpl implements SushiServiceInterface {

    private static final Logger LOG = Logger.getLogger(SushiServiceInterfaceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.safaribooks.ifpress.amx.reporting.sushiservice.SushiServiceInterface#getReport(org.niso.schemas.sushi.ReportRequest  messagePart )*
     */
    public org.niso.schemas.sushi.counter.CounterReportResponse getReport(org.niso.schemas.sushi.ReportRequest messagePart) { 
        LOG.info("Executing operation getReport");
        System.out.println(messagePart);
        try {
            org.niso.schemas.sushi.counter.CounterReportResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}