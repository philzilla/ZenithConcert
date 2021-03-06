// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package billeterie.proxies;

public class Billet
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject billetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Billeterie.Billet";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		billetID("billetID"),
		billetRef("billetRef"),
		billetNom("billetNom"),
		billetPrixHT("billetPrixHT"),
		billetAffiche("billetAffiche"),
		billetTotal("billetTotal"),
		billetTTC("billetTTC");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Billet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Billeterie.Billet"));
	}

	protected Billet(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject billetMendixObject)
	{
		if (billetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Billeterie.Billet", billetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Billeterie.Billet");

		this.billetMendixObject = billetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Billet.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static billeterie.proxies.Billet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return billeterie.proxies.Billet.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static billeterie.proxies.Billet initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new billeterie.proxies.Billet(context, mendixObject);
	}

	public static billeterie.proxies.Billet load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return billeterie.proxies.Billet.initialize(context, mendixObject);
	}

	public static java.util.List<billeterie.proxies.Billet> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<billeterie.proxies.Billet> result = new java.util.ArrayList<billeterie.proxies.Billet>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Billeterie.Billet" + xpathConstraint))
			result.add(billeterie.proxies.Billet.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of billetID
	 */
	public final java.lang.Long getbilletID()
	{
		return getbilletID(getContext());
	}

	/**
	 * @param context
	 * @return value of billetID
	 */
	public final java.lang.Long getbilletID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.billetID.toString());
	}

	/**
	 * Set value of billetID
	 * @param billetid
	 */
	public final void setbilletID(java.lang.Long billetid)
	{
		setbilletID(getContext(), billetid);
	}

	/**
	 * Set value of billetID
	 * @param context
	 * @param billetid
	 */
	public final void setbilletID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long billetid)
	{
		getMendixObject().setValue(context, MemberNames.billetID.toString(), billetid);
	}

	/**
	 * @return value of billetRef
	 */
	public final java.lang.Integer getbilletRef()
	{
		return getbilletRef(getContext());
	}

	/**
	 * @param context
	 * @return value of billetRef
	 */
	public final java.lang.Integer getbilletRef(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.billetRef.toString());
	}

	/**
	 * Set value of billetRef
	 * @param billetref
	 */
	public final void setbilletRef(java.lang.Integer billetref)
	{
		setbilletRef(getContext(), billetref);
	}

	/**
	 * Set value of billetRef
	 * @param context
	 * @param billetref
	 */
	public final void setbilletRef(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer billetref)
	{
		getMendixObject().setValue(context, MemberNames.billetRef.toString(), billetref);
	}

	/**
	 * @return value of billetNom
	 */
	public final java.lang.String getbilletNom()
	{
		return getbilletNom(getContext());
	}

	/**
	 * @param context
	 * @return value of billetNom
	 */
	public final java.lang.String getbilletNom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.billetNom.toString());
	}

	/**
	 * Set value of billetNom
	 * @param billetnom
	 */
	public final void setbilletNom(java.lang.String billetnom)
	{
		setbilletNom(getContext(), billetnom);
	}

	/**
	 * Set value of billetNom
	 * @param context
	 * @param billetnom
	 */
	public final void setbilletNom(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String billetnom)
	{
		getMendixObject().setValue(context, MemberNames.billetNom.toString(), billetnom);
	}

	/**
	 * @return value of billetPrixHT
	 */
	public final java.math.BigDecimal getbilletPrixHT()
	{
		return getbilletPrixHT(getContext());
	}

	/**
	 * @param context
	 * @return value of billetPrixHT
	 */
	public final java.math.BigDecimal getbilletPrixHT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.billetPrixHT.toString());
	}

	/**
	 * Set value of billetPrixHT
	 * @param billetprixht
	 */
	public final void setbilletPrixHT(java.math.BigDecimal billetprixht)
	{
		setbilletPrixHT(getContext(), billetprixht);
	}

	/**
	 * Set value of billetPrixHT
	 * @param context
	 * @param billetprixht
	 */
	public final void setbilletPrixHT(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal billetprixht)
	{
		getMendixObject().setValue(context, MemberNames.billetPrixHT.toString(), billetprixht);
	}

	/**
	 * @return value of billetAffiche
	 */
	public final java.lang.String getbilletAffiche()
	{
		return getbilletAffiche(getContext());
	}

	/**
	 * @param context
	 * @return value of billetAffiche
	 */
	public final java.lang.String getbilletAffiche(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.billetAffiche.toString());
	}

	/**
	 * Set value of billetAffiche
	 * @param billetaffiche
	 */
	public final void setbilletAffiche(java.lang.String billetaffiche)
	{
		setbilletAffiche(getContext(), billetaffiche);
	}

	/**
	 * Set value of billetAffiche
	 * @param context
	 * @param billetaffiche
	 */
	public final void setbilletAffiche(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String billetaffiche)
	{
		getMendixObject().setValue(context, MemberNames.billetAffiche.toString(), billetaffiche);
	}

	/**
	 * @return value of billetTotal
	 */
	public final java.lang.Integer getbilletTotal()
	{
		return getbilletTotal(getContext());
	}

	/**
	 * @param context
	 * @return value of billetTotal
	 */
	public final java.lang.Integer getbilletTotal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.billetTotal.toString());
	}

	/**
	 * Set value of billetTotal
	 * @param billettotal
	 */
	public final void setbilletTotal(java.lang.Integer billettotal)
	{
		setbilletTotal(getContext(), billettotal);
	}

	/**
	 * Set value of billetTotal
	 * @param context
	 * @param billettotal
	 */
	public final void setbilletTotal(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer billettotal)
	{
		getMendixObject().setValue(context, MemberNames.billetTotal.toString(), billettotal);
	}

	/**
	 * @return value of billetTTC
	 */
	public final java.math.BigDecimal getbilletTTC()
	{
		return getbilletTTC(getContext());
	}

	/**
	 * @param context
	 * @return value of billetTTC
	 */
	public final java.math.BigDecimal getbilletTTC(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.billetTTC.toString());
	}

	/**
	 * Set value of billetTTC
	 * @param billetttc
	 */
	public final void setbilletTTC(java.math.BigDecimal billetttc)
	{
		setbilletTTC(getContext(), billetttc);
	}

	/**
	 * Set value of billetTTC
	 * @param context
	 * @param billetttc
	 */
	public final void setbilletTTC(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal billetttc)
	{
		getMendixObject().setValue(context, MemberNames.billetTTC.toString(), billetttc);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return billetMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final billeterie.proxies.Billet that = (billeterie.proxies.Billet) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Billeterie.Billet";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
