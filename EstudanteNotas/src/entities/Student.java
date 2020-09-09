package entities;

public class Student {

	public static String name;
	public static double notaA;
	public static double notaB;
	public static double notaC;

	public double finalGrade() {

		// return notaA + notaB + notaC;
		double notaFinal = notaA + notaB + notaC;
		return notaFinal;

	}

	public double pontosFaltantes() {

		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}

		else {

			return 0.0;
		}

	}

}
