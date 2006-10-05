/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.debug.internal.ui.model;

import org.eclipse.ui.IMemento;

/**
 * Request to store a memento for an element in a specific context.
 * 
 * @since 3.3
 */
public interface IElementMementoRequest extends IPresentationUpdate {

	/**
	 * Returns the element for which the memento has been requested.
	 * 
	 * @return element
	 */
	public Object getElement();
	
	/**
	 * Returns the memento used to persist the element.
	 * 
	 * @return memento
	 */
	public IMemento getMemento();
}
