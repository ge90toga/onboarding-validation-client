package au.edu.unsw.soacourse.onboardingservice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import au.edu.unsw.soacourse.onboardingservice.ObjectFactory;
import au.edu.unsw.soacourse.onboardingservice.OnboadrdingValidationService;
import au.edu.unsw.soacourse.onboardingservice.OnboadrdingValidationServiceImplService;
import au.edu.unsw.soacourse.onboardingservice.ValidateAddressFaultMsg;
import au.edu.unsw.soacourse.onboardingservice.ValidateAddressRequest;
import au.edu.unsw.soacourse.onboardingservice.ValidateAddressResponse;

public class ValidateAddress extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public ValidateAddress(){
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		OnboadrdingValidationServiceImplService onboadrdingValidationServiceImpl = 
				new OnboadrdingValidationServiceImplService(
						new URL("http://localhost:8080/onboarding-validation-service/OnboadrdingValidationService?wsdl"));
		OnboadrdingValidationService onboadrdingValidationService = 
				onboadrdingValidationServiceImpl.getOnboadrdingValidationServiceImplPort();
		ObjectFactory objectFactory = new ObjectFactory();
		ValidateAddressRequest validateAddressRequest = objectFactory.createValidateAddressRequest();
		validateAddressRequest.setHouseNumber("455");
		validateAddressRequest.setPostCode(2000);
		validateAddressRequest.setRoadName("George");
		validateAddressRequest.setRoadType("St");
		validateAddressRequest.setState("NSW");
		validateAddressRequest.setSuburb("Sydney");		
		
		try {
			ValidateAddressResponse validateAddressResponse = 
					onboadrdingValidationService.validateAddress(validateAddressRequest);
			validateAddressResponse.getCouncilName();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<HEAD>");
			out.println("<TITLE>Onboarding Validation Client Page</TITLE>");
			out.println("</HEAD>");
			out.println("<body>");
			out.println("<CENTER>");
			out.print("The local council for this address is : " + validateAddressResponse.getCouncilName());
			out.println("</CENTER>");
			out.println("</BODY>");
			out.println("</HTML>");
		} catch (ValidateAddressFaultMsg e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
