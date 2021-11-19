class Sub{
	private int a, b;
	public void setData(int a, int b){
		this.a = a;
		this.b = b;
	}

	Sub(){
		a= b = 0;
	}

	public int getVal(){
		return a-b;
	}

}