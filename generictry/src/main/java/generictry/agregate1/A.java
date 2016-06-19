package generictry.agregate1;

/**
 * The Class A.
 *
 * @author Jean-Aymeric Diet
 * @param <TB>
 *          the generic type
 */
public class A<TB extends B> {

	/** The b. */
	private TB b;

	/**
	 * Gets the b.
	 *
	 * @return the b
	 */
	public final TB getB() {
		return this.b;
	}

	/**
	 * Sets the b.
	 *
	 * @param b
	 *          the new b
	 */
	public final void setB(final TB b) {
		this.b = b;
	}
}
