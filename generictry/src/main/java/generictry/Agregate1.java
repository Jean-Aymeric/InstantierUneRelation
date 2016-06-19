package generictry;

import generictry.agregate1.A;
import generictry.agregate1.A2;
import generictry.agregate1.B;
import generictry.agregate1.B2;

/**
 * @author Jean-Aymeric Diet
 *
 */
public class Agregate1 {
	/**
	 *
	 */
	public final void start() {
		final A<B> a = new A<B>();
		final B b = new B();

		final A2 a2 = new A2();
		final B2 b2 = new B2();

		a.setB(b);
		a.setB(b2);

		// a2.setB(b);
		a2.setB(b2);
	}

}
