package at.fhv.cicd.application.endpoints;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class HistoryEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.GetMapping("invalid")
	public at.fhv.cicd.application.models.History getHistory(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code getHistory
		return null;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
