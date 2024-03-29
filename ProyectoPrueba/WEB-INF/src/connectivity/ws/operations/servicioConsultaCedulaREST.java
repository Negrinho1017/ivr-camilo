package connectivity.ws.operations;

/**
 * This class is generated automatically.  Manual edits must be outside of the tagged
 * areas (for example, "START:CLASS:..." and "END:CLASS:...").  Changes within the
 * tag areas will be overwritten when the web service operation is regenerated.
 * Last generated by Orchestration Designer at: 14 DE JUNIO DE 2019 10:17:18 AM COT
 */
public class servicioConsultaCedulaREST extends com.avaya.sce.runtime.connectivity.restws.CallService {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

    /**
    * Constructor for servicioConsultaCedulaREST.
    */
    public servicioConsultaCedulaREST( com.avaya.sce.runtimecommon.IRuntimeSession mySession ) {
		//{{START:CLASS:CONSTRUCTOR
        super(mySession);

        //Web Service
        setServiceName("servicioConsultaCedulaREST");
		setHttpMethod("GET");
		setOutputFormat("Server Default");
		setUseQuery("true");
		setUseJavaObject("true");
		setUseBody("false");
        setTimeoutSecondsFromParameter("servicioConsultaCedulaREST_1560519953145TimeoutSeconds");
        setEndpointFromParameter("servicioConsultaCedulaREST_1560519953145EndpointUrl");
        setAuthenticationFromParameter("servicioConsultaCedulaREST_1560519953145Authentication");
        setPasswordFromParameter("servicioConsultaCedulaREST_1560519953145Password");
        setUsernameFromParameter("servicioConsultaCedulaREST_1560519953146Username");
        setPreemptiveFromParameter("servicioConsultaCedulaREST_1560519953146Preemptive");
        setSecurityFromParameter("servicioConsultaCedulaREST_1560519953146Security");
        setPortFromParameter("servicioConsultaCedulaREST_1560519953146Port");

        //Operation
        setOperation(new javax.xml.namespace.QName("", "servicioConsultaCedulaREST_OP"));

        //Input parameters

        //Output parameters
		setMessageBody("");
        //}}END:CLASS:CONSTRUCTOR

    }

}

