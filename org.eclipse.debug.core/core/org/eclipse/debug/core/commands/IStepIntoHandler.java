/*******************************************************************************
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.debug.core.commands;

/**
 * A step into handler typically steps into the next instruction to
 * be executed.
 * <p>
 * Clients may implement this interface. The debug platform provides a
 * step into action that delegates to this handler interface. As well, the
 * debug platform provides an implementation of the step into handler registered
 * as an adapter on objects that implement
 * {@link org.eclipse.debug.core.model.IStep}.
 * </p>
 * @since 3.3
 */
public interface IStepIntoHandler extends IDebugCommandHandler {

}
