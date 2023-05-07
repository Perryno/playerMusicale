package contenutoMultimediale;

public class video extends volume implements luminosità{
	int lumin;
	
	
	public int getLumin() {
		return lumin;
	}

	public void setLumin(int lumin) {
		this.lumin = lumin;
	}
	public void aumentaLumin() {
		setLumin(++lumin);
	}
	public void diminuisciLumin() {
		setLumin(--lumin);
	}
	public video(String titolo, int durata,int volume , int lumin) {
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
		this.lumin = lumin;
	}
	@Override	
	public String generaAsterischi(int lumin) {
		
	       StringBuilder sb = new StringBuilder();

	       for (int i = 0; i < lumin; i++) {
	           sb.append("*");
	       }
	  
	       return sb.toString();
	
}

	
	public void playVideo() {
		String punti = generaPuntiEsclamativi(volume);
		String asterix = generaAsterischi(lumin);
		String title = getTitolo();
		int numeroVolte = durata;
		
		for (int i = 0; i < numeroVolte; i++) {
			 
			 System.out.println(title + punti + asterix);
		}
	}

}
