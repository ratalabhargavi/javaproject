package inlab;
	class EndUser {
		
		private String name;
		private Logger logger;
		public EndUser(String name) {
		this.name = name;
		this.logger = Logger.getInstance();
		}
		public void performAction(String action) {
		logger.log(name + " performed action: " + action);
		}
		
		}
