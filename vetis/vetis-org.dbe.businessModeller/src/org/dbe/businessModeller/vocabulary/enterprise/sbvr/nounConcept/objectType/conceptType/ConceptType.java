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
package org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.conceptType;

import org.dbe.businessModeller.vocabulary.enterprise.VocabularyAttributesHandler;
import org.dbe.businessModeller.vocabulary.enterprise.exchange.ListChecker.SBVRLists;
import org.dbe.businessModeller.vocabulary.enterprise.sbvr.nounConcept.objectType.ObjectType;

public class ConceptType extends ObjectType{
	
	/**
	 * Constructor
	 * @param newThingList
	 * @param newConceptualSchema
	 * @param newAttributesHandler
	 */
	public ConceptType(SBVRLists newThingList, SBVR.ConceptualSchema newConceptualSchema, VocabularyAttributesHandler newAttributesHandler){
		super(newThingList, newConceptualSchema, newAttributesHandler);
	}
}