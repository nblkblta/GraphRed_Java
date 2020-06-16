package view;

enum Tool{
	Ellipse ("Ellipse"),
	Rectangle ("Rectangle"),
	Polyline ("Polyline"),
	Polygon ("Polygon"),
	Pencil ("Pencil"),
	Refresh ("Refresh"),
	Save ("Save"),
	Load ("Load"),
	SaveAsPNG ("SaveAsPNG");
	
	private String name;
	
	Tool(String name){
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	};
}
