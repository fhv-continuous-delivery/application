package at.fhv.cicd.application.models;

// Start of user code (user defined imports)

// End of user code

public class HistoryItem {
	/**
	 * Description of the property text.
	 */
	public String text = null;
	
	/**
	 * Description of the property requested.
	 */
	public long requested = null;
	
	/**
	 * Description of the property result.
	 */
	public at.fhv.cicd.application.models.SentimentResult result = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getText(){
		   return this.text;
		}
		
		public void setText(String text){
		   this.text = text;
		}
		
		public long getRequested(){
		   return this.requested;
		}
		
		public void setRequested(long requested){
		   this.requested = requested;
		}
		
		public at.fhv.cicd.application.models.SentimentResult getResult(){
		   return this.result;
		}
		
		public void setResult(at.fhv.cicd.application.models.SentimentResult result){
		   this.result = result;
		}
		
	
}
