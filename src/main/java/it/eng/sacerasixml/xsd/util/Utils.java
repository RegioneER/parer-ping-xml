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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.sacerasixml.xsd.util;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/**
 *
 * @author Iacolucci_M
 */
public class Utils {

    public static String getStandardXsDateFormat(Date data) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        return sf.format(data);
    }

    /*
     * Metodo che consente di ignorare i namespace multipli all'interno di un xml passato dalle applicazioni. Senza
     * questo filtro JAXB esplode con gli XML che vengono passati.
     */
    public static Source getSaxSourceForUnmarshal(String datiXml) throws SAXException, ParserConfigurationException {
        final SAXParserFactory sax = SAXParserFactory.newInstance();
        sax.setNamespaceAware(true);
        final XMLReader xmlReader = sax.newSAXParser().getXMLReader();
        NamespaceFilterForUnmashal inFilter = new NamespaceFilterForUnmashal();
        inFilter.setParent(xmlReader);
        InputSource is = new InputSource(new StringReader(datiXml));
        // Crea un SAXSource specificando il filtro per ignorare i namespaces
        return new SAXSource(inFilter, is);
    }

}
