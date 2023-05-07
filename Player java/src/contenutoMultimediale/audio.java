package contenutoMultimediale;

public class audio extends volume {
	public audio (String titolo, int durata, int volume) {
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
	}
	public void playAudio() {
		String punti = generaPuntiEsclamativi(volume);
		String title = getTitolo();
		int numeroVolte = durata;
		for (int i = 0; i < numeroVolte; i++) {
			 
			 System.out.println(title + punti);
		}
	}
}
