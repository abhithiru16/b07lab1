class Polynomial{
	//fields
	private double[] coefficient;
	
	public Polynomial() {
		this.coefficient = new double[]{0};
	}

	public Polynomial(double[] coeffs) {
		this.coefficient = coeffs;
	}

	public Polynomial add(Polynomial other) {
		int maxLength = Math.max(this.coefficient.length, other.coefficient.length);
		double[] result = new double[maxLength];

		for (int i = 0; i < maxLength; i++) {
			double a = 0;
			if (i < this.coefficient.length) {
				a = this.coefficient[i];
			}
			double b = 0;
			if (i < other.coefficient.length) {
				b = other.coefficient[i];
			}
			result[i] = a + b;
		}

		return new Polynomial(result);
	}

	public double evaluate(double x) {
		double result = 0;
		for (int i = 0; i < coefficient.length; i++) {
			result += coefficient[i] * Math.pow(x, i);
		}
		return result;
	}

	public boolean hasRoot(double x) {
		return evaluate(x) == 0;
	}
}