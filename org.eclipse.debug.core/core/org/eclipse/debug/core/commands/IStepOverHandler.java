/*******************************************************************************
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.debug.core.commands;

/**
 * A step over handler typically steps over the next instruction or line
 * of code to be executed.
 * <p>
 * Clients may implement this interface. The debug platform provides a
 * step over action that delegates to this handler interface. As well, the
 * debug platform provides an implementation of the step over handler registered
 * as an adapter on objects that implement
 * {@link org.eclipse.debug.core.model.IStep}.
 * </p>
 * @since 3.3
 */
public interface IStepOverHandler extends IDebugCommandHandler {

}