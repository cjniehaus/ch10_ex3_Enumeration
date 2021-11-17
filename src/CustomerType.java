
public enum CustomerType {
	RETAIL,
	TRADE,
	COLLEGE;

	@Override
	public String toString() {
		String s = "";
		if (this.ordinal() == 0) {
			s = "Retail customers";
		} else if (this.ordinal() == 1) {
			s = "Trade customers";
		} else if (this.ordinal() == 2) {
			s = "College customers";
		} 
		return s;
	}
}
