/*******************************************************************************
 * Copyright (c) 2009 Vetis.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://opensource.org/licenses/eclipse-1.0.php

 * Author:
 *	KTU  Department of Information Systems, http://www.isd.ktu.lt
 *
 *******************************************************************************/
package SBVR.impl;

import SBVR.Representation;
import SBVR.Rulebook;
import SBVR.SBVRPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rulebook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SBVR.impl.RulebookImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RulebookImpl extends SetImpl implements Rulebook {
	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Representation> representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulebookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBVRPackage.Literals.RULEBOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Representation> getRepresentation() {
		if (representation == null) {
			representation = new EObjectResolvingEList<Representation>(Representation.class, this, SBVRPackage.RULEBOOK__REPRESENTATION);
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBVRPackage.RULEBOOK__REPRESENTATION:
				return getRepresentation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SBVRPackage.RULEBOOK__REPRESENTATION:
				getRepresentation().clear();
				getRepresentation().addAll((Collection<? extends Representation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SBVRPackage.RULEBOOK__REPRESENTATION:
				getRepresentation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SBVRPackage.RULEBOOK__REPRESENTATION:
				return representation != null && !representation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RulebookImpl
