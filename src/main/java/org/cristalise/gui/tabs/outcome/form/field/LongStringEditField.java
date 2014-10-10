/**
 * This file is part of the CRISTAL-iSE default user interface.
 * Copyright (c) 2001-2014 The CRISTAL Consortium. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License, or (at
 * your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
 *
 * http://www.fsf.org/licensing/licenses/lgpl.html
 */
package org.cristalise.gui.tabs.outcome.form.field;

import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

import org.cristalise.kernel.utils.Language;



/**************************************************************************
 *
 * $Revision$
 * $Date$
 *
 * Copyright (C) 2003 CERN - European Organization for Nuclear Research
 * All rights reserved.
 **************************************************************************/
public class LongStringEditField extends StringEditField {

    JTextArea bigText;
    JScrollPane bigScroller;
    public LongStringEditField() {
        super();
        field.setToolTipText(Language.translate("This field can contain any string."));
    }

    @Override
	public JTextComponent makeTextField() {
    	return new JTextArea();
    }
    @Override
	public Component getControl() {
    	if (bigScroller == null) {
    		bigScroller = new JScrollPane(field);
    	}
        return bigScroller;
    }
}