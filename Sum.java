class Sum {
	private int a, b;

	Sum (){
		a = 0;
		b = 0;
	}
	public void setData(int a, int b){
		this.a = a;
		this.b = b;
	}

	public int getSumVal(){
		return a + b;
	}
}