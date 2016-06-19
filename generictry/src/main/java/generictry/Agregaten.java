package generictry;

import generictry.agregaten.A;
import generictry.agregaten.A2;
import generictry.agregaten.B;
import generictry.agregaten.B2;

/**
 * @author Jean-Aymeric Diet
 *
 */
public class Agregaten {
	/**
	 *
	 */
	public final void start() {
		final A<B> a = new A<B>();
		final B b = new B();

		final A2 a2 = new A2();
		final B2 b2 = new B2();

		a.addB(b);
		a.addB(b2);

		// a2.addB(b);
		a2.addB(b2);
	}

}
