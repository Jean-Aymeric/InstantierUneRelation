package generictry.agregaten;

import java.util.ArrayList;

/**
 * The Class A.
 *
 * @author Jean-Aymeric Diet
 * @param <TB>
 *          the generic type
 */
public class A<TB extends B> {

	/** The bs. */
	private final ArrayList<TB> bs;

	/**
	 * Instantiates a new a.
	 */
	public A() {
		this.bs = new ArrayList<TB>();
	}

	/**
	 * Gets the bs.
	 *
	 * @return the bs
	 */
	public final ArrayList<TB> getBs() {
		return this.bs;
	}

	/**
	 * Adds the b.
	 *
	 * @param tb
	 *          the tb
	 */
	public final void addB(final TB tb) {
		this.getBs().add(tb);
	}
}