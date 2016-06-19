package generictry.agregate1;

// TODO: Auto-generated Javadoc
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
	public TB getB() {
		return this.b;
	}

	/**
	 * Sets the b.
	 *
	 * @param b
	 *          the new b
	 */
	public void setB(final TB b) {
		this.b = b;
	}
}
