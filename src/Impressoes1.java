import java.text.DecimalFormat;

public class Impressoes1 {
	public static void main(String[] args) {
		
		double x = 28.5f;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Saída do print: " + df.format(x));
	}
}
