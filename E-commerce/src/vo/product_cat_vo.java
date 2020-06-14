package vo;

public class product_cat_vo {
		private int id;
		private String title;
		private int status;
		
		public product_cat_vo() {
			super();
			// TODO Auto-generated constructor stub
		}

		public product_cat_vo(String title) {
			super();
			this.title = title;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		
		

		
		
}
