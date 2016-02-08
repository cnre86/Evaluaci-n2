package nayeli.giti7083s.futbol;


	public static void main(String[] args) {
	
	Futbolista fut =new Futbolista() {
		
		@Override
		public void viajar() {
			// TODO Auto-generated method stub
			System.out.println("Los futbolistas se van de viaje");
		}
		
		@Override
		public void jugarPartido() {
			// TODO Auto-generated method stub
			System.out.println("Los futbolistas juegan varios partidos");
		}
		
		@Override
		public void entrenar() {
			// TODO Auto-generated method stub
			System.out.println("Los futbolistas entrenan mucho");
		}
		
		@Override
		public void concentrarse() {
			// TODO Auto-generated method stub
			System.out.println("Los futbolistas deben concentrarse");	
		}
	};
	fut.concentrarse();
	fut.entrenar();
	fut.viajar();
	fut.jugarPartido();
}


