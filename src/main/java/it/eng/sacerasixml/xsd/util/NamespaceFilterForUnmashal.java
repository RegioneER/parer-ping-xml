/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package it.eng.sacerasixml.xsd.util;

/**
 *
 * @author Iacolucci_M
 */
import com.sun.xml.bind.v2.runtime.unmarshaller.SAXConnector;
import java.util.Collection;
import javax.xml.namespace.QName;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import org.xml.sax.helpers.XMLFilterImpl;

public class NamespaceFilterForUnmashal extends XMLFilterImpl {

    private SAXConnector saxConnector;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {

        if (saxConnector != null) {
            Collection<QName> expected = saxConnector.getContext().getCurrentExpectedElements();
            for (QName expectedQname : expected) {
                if (localName.equals(expectedQname.getLocalPart())) {
                    super.startElement(expectedQname.getNamespaceURI(), localName, qName, atts);
                    return;
                }
            }
        }
        super.startElement(uri, localName, qName, atts);

    }

    @Override
    public void setContentHandler(ContentHandler handler) {

        super.setContentHandler(handler);
        if (handler instanceof SAXConnector) {
            saxConnector = (SAXConnector) handler;
        }

    }

}
