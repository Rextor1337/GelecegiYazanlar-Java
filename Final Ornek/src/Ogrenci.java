
public /*final*/ class Ogrenci { // public final yazarsan bu klastan baska klas turetemezsin
		private final int numara;
		
		public Ogrenci(int n) {
			numara = n;
		}
		
		public int getNumara() {
			return numara;
		}
		
		public /*final*/ void Yazdir() {
			System.out.println(numara);
		}
		
	}
