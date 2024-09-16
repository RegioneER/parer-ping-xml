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
package it.eng.sacerasixml;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Iacolucci_M
 */
public class TestJaxb {

    public TestJaxb() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /*
     * @Test public void testJaxb1() { System.out.println("TEST Chiamata Recupero Diario da DPI");
     *
     * String datiXmlOri="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+
     * "<ns2:ListaFiltri xmlns:ns2=\"http://diariofiltri.xml.ws.sacerasi.eng.it/\"><Filtro>"+
     * "<FiltroUnValore><DatoSpecifico>AETNodoDicom</DatoSpecifico><Operatore>UGUALE</Operatore><Valore>DCM4CHEE</Valore></FiltroUnValore>"+
     * "</Filtro></ns2:ListaFiltri>"; try { XMLReader reader = XMLReaderFactory.createXMLReader(); //Create the filter
     * (to add namespace) and set the xmlReader as its parent. NamespaceFilter inFilter = new NamespaceFilter(null,
     * false); inFilter.setParent(reader); //Prepare the input, in this case a java.io.File (output) InputSource is =
     * new InputSource(new StringReader(datiXmlOri)); //Create a SAXSource specifying the filter SAXSource source = new
     * SAXSource(inFilter, is); //Do unmarshalling SchemaFactory schemaFctry =
     * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); JAXBContext datispecFiltriCtx_ListaFiltri =
     * JAXBContext.newInstance("it.eng.sacerasi.ws.xml.datiSpecFiltri"); Schema datispecFiltriSchema =
     * schemaFctry.newSchema(new File(
     * "/Progetti/parer-ping-xml/target/classes/xsd/it/eng/sacerasi/ws/xml/datiSpecFiltri/WSDatiSpecificiDiarioFiltri.xsd"
     * )); Unmarshaller u = datispecFiltriCtx_ListaFiltri.createUnmarshaller(); u.setSchema(datispecFiltriSchema);
     *
     * JAXBElement<ListaFiltriType> elemento=(JAXBElement<ListaFiltriType>)u.unmarshal(source); ListaFiltriType
     * parsedListaFiltri = elemento.getValue(); System.out.println("asdas"+parsedListaFiltri);
     *
     * } catch (JAXBException | SAXException ex) { ex.printStackTrace(); } }
     */
    /*
     * @Test public void testJaxb2() { System.out.println("TEST Chiamata Recupero Diario da DPI");
     *
     * String datiXmlOri= "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
     * "<ns2:ListaUnitaDocumentarie xmlns:ns2=\"http://invioasync.xml.ws.sacerasi.eng.it/\">\n" +
     *
     * "    <Versione>1.0</Versione>\n" +
     *
     * "    <UnitaDocumentaria>\n" +
     * "        <ns3:DatiSpecifici xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">\n" +
     * "            <VersioneDatiSpecifici>1.0</VersioneDatiSpecifici>\n" +
     * "            <AETNodoDicom>DCM4CHEE</AETNodoDicom>\n" + "            <SOPClassList>\n" +
     * "                <SOPClass>1.2.840.10008.5.1.4.1.1.88.33</SOPClass>\n" + "            </SOPClassList>\n" +
     * "            <StudyDate>2011-10-20T17:52:51.000+02:00</StudyDate>\n" +
     * "            <AccessionNumber>MS2166105</AccessionNumber>\n" + "            <ModalityInStudyList>\n" +
     * "                <ModalityInStudy>SR</ModalityInStudy>\n" + "            </ModalityInStudyList>\n" +
     * "            <StudyDescription>MAMMOGRAFIA BILATERALE</StudyDescription>\n" +
     * "            <PatientName>COTTERLI^SIMONETTA</PatientName>\n" + "            <PatientId>408560</PatientId>\n" +
     * "            <PatientBirthDate>1961-12-31</PatientBirthDate>\n" + "            <PatientSex>F</PatientSex>\n" +
     * "            <StudyInstanceUID>1.2.3.4.5.6.7.8.9.45143</StudyInstanceUID>\n" +
     * "            <NumberStudyRelatedSeries>1</NumberStudyRelatedSeries>\n" +
     * "            <NumberStudyRelatedImages>1</NumberStudyRelatedImages>\n" +
     * "            <StudyID>REQ2011002131945</StudyID>\n" +
     * "            <DataPresaInCarico>2019-01-14T16:53:27.000+01:00</DataPresaInCarico>\n" +
     * "            <DCM-hash>2f6c093b112be04fe9609531d68b1e7843b3d5b4</DCM-hash>\n" +
     * "            <DCM-hash-algo>SHA-1</DCM-hash-algo>\n" +
     * "            <DCM-hash-encoding>hexBinary</DCM-hash-encoding>\n" +
     * "            <DCM-hash-Descrizione>MHgwMDA4MDAyMD0yMDExMTAyMAoweDAwMDgwMDMwPTE3NTI1MQoweDAwMDgwMDUwPU1TMjE2NjEwNQoweDAwMTAwMDEwPUNPVFRFUkxJXlNJTU9ORVRUQQoweDAwMTAwMDIwPTQwODU2MAoweDAwMTAwMDIxPQoweDAwMTAwMDMwPTE5NjExMjMxCjB4MDAxMDAwNDA9RgoweDAwMjAwMDBEPTEuMi4zLjQuNS42LjcuOC45LjQ1MTQzCjB4MDAyMDEyMDg9OQo=</DCM-hash-Descrizione>\n"
     * + "            <GLOBAL-hash>f7be65e2a794d25852e58a5acea73f83f56157b2</GLOBAL-hash>\n" +
     * "            <GLOBAL-hash-algo>SHA-1</GLOBAL-hash-algo>\n" +
     * "            <GLOBAL-hash-encoding>hexBinary</GLOBAL-hash-encoding>\n" +
     * "            <GLOBAL-hash-Descrizione>MS4yLjg0MC4xMTM3MDQuNy4xLjEuMzUxNjk0ODY1OC41MDY2Mjg0NjEuNDUxMTEuMzAuMTY2LjUzNTg5NzkvMS4yLjg0MC4xMTM3MDQuNy4xLjIyMjAxNjU5NDEuMjAwMjguMTMxOTEyNjI4My4yNDM5LmRjbSwwODNmYTRlODk1YjY3ZWFlM2QzNjNmODQ2NWYyOWI4YTA2ZjcwNWNjCg==</GLOBAL-hash-Descrizione>\n"
     * + "            <FILE-hash>ad1a9adb9c57492060ce942cec036a8849d9eb09</FILE-hash>\n" +
     * "            <FILE-hash-algo>SHA-1</FILE-hash-algo>\n" +
     * "            <FILE-hash-encoding>hexBinary</FILE-hash-encoding>\n" + "        </ns3:DatiSpecifici>\n" +
     * "    </UnitaDocumentaria>\n" +
     *
     * "</ns2:ListaUnitaDocumentarie>";
     *
     * // StringReader tmpReaderFiltri = new StringReader(datiXml);
     *
     * try { XMLReader reader = XMLReaderFactory.createXMLReader(); //Create the filter (to add namespace) and set the
     * xmlReader as its parent. NamespaceFilter inFilter = new NamespaceFilter(null, false); inFilter.setParent(reader);
     * //Prepare the input, in this case a java.io.File (output) InputSource is = new InputSource(new
     * StringReader(datiXmlOri)); //Create a SAXSource specifying the filter SAXSource source = new SAXSource(inFilter,
     * is); //Do unmarshalling SchemaFactory schemaFctry =
     * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); // JAXBContext ctx =
     * JAXBContext.newInstance(ListaUnitaDocumentarieType.class, it.eng.sacerasi.ws.xml.invioAsync.ObjectFactory.class);
     * JAXBContext ctx = JAXBContext.newInstance(ListaUnitaDocumentarieType.class,
     * it.eng.sacerasi.ws.xml.invioAsync.ObjectFactory.class); Schema datispecFiltriSchema = schemaFctry.newSchema(new
     * File("/Progetti/parer-ping-xml/target/classes/xsd/it/eng/sacerasi/ws/xml/invioAsync/WSInvioAsync.xsd"));
     * Unmarshaller u = ctx.createUnmarshaller(); u.setSchema(datispecFiltriSchema);
     *
     * JAXBElement<ListaUnitaDocumentarieType> elemento=(JAXBElement<ListaUnitaDocumentarieType>)u.unmarshal(source);
     * ListaUnitaDocumentarieType parsedListaFiltri = elemento.getValue();
     * System.out.println("asdas"+parsedListaFiltri);
     *
     * } catch (JAXBException | SAXException ex) { ex.printStackTrace(); } }
     */
    /*
     * @Test public void testJaxb3() { System.out.println("TEST Chiamata Recupero Diario da DPI");
     *
     * String datiXmlOri= "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
     * "<ns2:ListaUnitaDocumentarie xmlns:ns2=\"http://invioasync.xml.ws.sacerasi.eng.it/\">\n" +
     *
     * "    <Versione>1.0</Versione>\n" +
     *
     * "    <UnitaDocumentaria>\n" +
     * "        <ns3:DatiSpecifici xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">\n" +
     * "            <VersioneDatiSpecifici>1.0</VersioneDatiSpecifici>\n" +
     * "            <AETNodoDicom>DCM4CHEE</AETNodoDicom>\n" + "            <SOPClassList>\n" +
     * "                <SOPClass>1.2.840.10008.5.1.4.1.1.88.33</SOPClass>\n" + "            </SOPClassList>\n" +
     * "            <StudyDate>2011-10-20T17:52:51.000+02:00</StudyDate>\n" +
     * "            <AccessionNumber>MS2166105</AccessionNumber>\n" + "            <ModalityInStudyList>\n" +
     * "                <ModalityInStudy>SR</ModalityInStudy>\n" + "            </ModalityInStudyList>\n" +
     * "            <StudyDescription>MAMMOGRAFIA BILATERALE</StudyDescription>\n" +
     * "            <PatientName>COTTERLI^SIMONETTA</PatientName>\n" + "            <PatientId>408560</PatientId>\n" +
     * "            <PatientBirthDate>1961-12-31</PatientBirthDate>\n" + "            <PatientSex>F</PatientSex>\n" +
     * "            <StudyInstanceUID>1.2.3.4.5.6.7.8.9.45143</StudyInstanceUID>\n" +
     * "            <NumberStudyRelatedSeries>1</NumberStudyRelatedSeries>\n" +
     * "            <NumberStudyRelatedImages>1</NumberStudyRelatedImages>\n" +
     * "            <StudyID>REQ2011002131945</StudyID>\n" +
     * "            <DataPresaInCarico>2019-01-14T16:53:27.000+01:00</DataPresaInCarico>\n" +
     * "            <DCM-hash>2f6c093b112be04fe9609531d68b1e7843b3d5b4</DCM-hash>\n" +
     * "            <DCM-hash-algo>SHA-1</DCM-hash-algo>\n" +
     * "            <DCM-hash-encoding>hexBinary</DCM-hash-encoding>\n" +
     * "            <DCM-hash-Descrizione>MHgwMDA4MDAyMD0yMDExMTAyMAoweDAwMDgwMDMwPTE3NTI1MQoweDAwMDgwMDUwPU1TMjE2NjEwNQoweDAwMTAwMDEwPUNPVFRFUkxJXlNJTU9ORVRUQQoweDAwMTAwMDIwPTQwODU2MAoweDAwMTAwMDIxPQoweDAwMTAwMDMwPTE5NjExMjMxCjB4MDAxMDAwNDA9RgoweDAwMjAwMDBEPTEuMi4zLjQuNS42LjcuOC45LjQ1MTQzCjB4MDAyMDEyMDg9OQo=</DCM-hash-Descrizione>\n"
     * + "            <GLOBAL-hash>f7be65e2a794d25852e58a5acea73f83f56157b2</GLOBAL-hash>\n" +
     * "            <GLOBAL-hash-algo>SHA-1</GLOBAL-hash-algo>\n" +
     * "            <GLOBAL-hash-encoding>hexBinary</GLOBAL-hash-encoding>\n" +
     * "            <GLOBAL-hash-Descrizione>MS4yLjg0MC4xMTM3MDQuNy4xLjEuMzUxNjk0ODY1OC41MDY2Mjg0NjEuNDUxMTEuMzAuMTY2LjUzNTg5NzkvMS4yLjg0MC4xMTM3MDQuNy4xLjIyMjAxNjU5NDEuMjAwMjguMTMxOTEyNjI4My4yNDM5LmRjbSwwODNmYTRlODk1YjY3ZWFlM2QzNjNmODQ2NWYyOWI4YTA2ZjcwNWNjCg==</GLOBAL-hash-Descrizione>\n"
     * + "            <FILE-hash>ad1a9adb9c57492060ce942cec036a8849d9eb09</FILE-hash>\n" +
     * "            <FILE-hash-algo>SHA-1</FILE-hash-algo>\n" +
     * "            <FILE-hash-encoding>hexBinary</FILE-hash-encoding>\n" + "        </ns3:DatiSpecifici>\n" +
     * "    </UnitaDocumentaria>\n" +
     *
     * "</ns2:ListaUnitaDocumentarie>";
     *
     * // StringReader tmpReaderFiltri = new StringReader(datiXml);
     *
     * try { JAXBContext ctx = JAXBContext.newInstance("it.eng.sacerasi.ws.xml.invioAsync");
     *
     * Unmarshaller u = ctx.createUnmarshaller(); SchemaFactory schemaFctry =
     * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); Schema datispecFiltriSchema =
     * schemaFctry.newSchema(new
     * File("/Progetti/parer-ping-xml/target/classes/xsd/it/eng/sacerasi/ws/xml/invioAsync/WSInvioAsync.xsd"));
     * u.setSchema(datispecFiltriSchema); //Create a SAXSource specifying the filter Source source =
     * it.eng.sacerasixml.xsd.util.Utils.getSaxSource2(datiXmlOri); //Do unmarshalling
     * JAXBElement<ListaUnitaDocumentarieType> elemento=(JAXBElement<ListaUnitaDocumentarieType>)u.unmarshal(source);
     * ListaUnitaDocumentarieType parsedListaFiltri = elemento.getValue();
     * System.out.println("asdas"+parsedListaFiltri);
     *
     * } catch (JAXBException | SAXException ex) { ex.printStackTrace(); } }
     */
    /*
     * @Test public void testJaxb4() { System.out.println("TEST Chiamata Recupero Diario da DPI");
     *
     * String datiXmlOri= "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
     * "<ns2:ListaUnitaDocumentarie xmlns:ns2=\"http://invioasync.xml.ws.sacerasi.eng.it/\">\n" +
     * "    <Versione>1.0</Versione>\n" + "    <UnitaDocumentaria>\n" +
     * "        <ns3:DatiSpecifici xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">\n" +
     * "            <VersioneDatiSpecifici>1.0</VersioneDatiSpecifici>\n" +
     * "            <AETNodoDicom>DCM4CHEE</AETNodoDicom>\n" + "            <SOPClassList>\n" +
     * "                <SOPClass>1.2.840.10008.5.1.4.1.1.88.33</SOPClass>\n" + "            </SOPClassList>\n" +
     * "            <StudyDate>2011-10-20T17:52:51.000+02:00</StudyDate>\n" +
     * "            <AccessionNumber>MS2166105</AccessionNumber>\n" + "            <ModalityInStudyList>\n" +
     * "                <ModalityInStudy>SR</ModalityInStudy>\n" + "            </ModalityInStudyList>\n" +
     * "            <StudyDescription>MAMMOGRAFIA BILATERALE</StudyDescription>\n" +
     * "            <PatientName>COTTERLI^SIMONETTA</PatientName>\n" + "            <PatientId>408560</PatientId>\n" +
     * "            <PatientBirthDate>1961-12-31</PatientBirthDate>\n" + "            <PatientSex>F</PatientSex>\n" +
     * "            <StudyInstanceUID>1.2.3.4.5.6.7.8.9.951206</StudyInstanceUID>\n" +
     * "            <NumberStudyRelatedSeries>1</NumberStudyRelatedSeries>\n" +
     * "            <NumberStudyRelatedImages>1</NumberStudyRelatedImages>\n" +
     * "            <StudyID>REQ2011002131945</StudyID>\n" +
     * "            <DataPresaInCarico>2019-01-15T11:22:40.000+01:00</DataPresaInCarico>\n" +
     * "            <DCM-hash>0a58b8b47b1e11d2a062d6bf13eeab14ded32271</DCM-hash>\n" +
     * "            <DCM-hash-algo>SHA-1</DCM-hash-algo>\n" +
     * "            <DCM-hash-encoding>hexBinary</DCM-hash-encoding>\n" +
     * "            <DCM-hash-Descrizione>MHgwMDA4MDAyMD0yMDExMTAyMAoweDAwMDgwMDMwPTE3NTI1MQoweDAwMDgwMDUwPU1TMjE2NjEwNQoweDAwMTAwMDEwPUNPVFRFUkxJXlNJTU9ORVRUQQoweDAwMTAwMDIwPTQwODU2MAoweDAwMTAwMDIxPQoweDAwMTAwMDMwPTE5NjExMjMxCjB4MDAxMDAwNDA9RgoweDAwMjAwMDBEPTEuMi4zLjQuNS42LjcuOC45Ljk1MTIwNgoweDAwMjAxMjA4PTkK</DCM-hash-Descrizione>\n"
     * + "            <GLOBAL-hash>1f1578d1f67df28f14ce9f70e1d02a2a474f45f6</GLOBAL-hash>\n" +
     * "            <GLOBAL-hash-algo>SHA-1</GLOBAL-hash-algo>\n" +
     * "            <GLOBAL-hash-encoding>hexBinary</GLOBAL-hash-encoding>\n" +
     * "            <GLOBAL-hash-Descrizione>MS4yLjg0MC4xMTM3MDQuNy4xLjEuMzUxNjk0ODY1OC41MDY2Mjg0NjEuNDUxMTEuMzAuMTY2LjUzNTg5NzkvMS4yLjg0MC4xMTM3MDQuNy4xLjIyMjAxNjU5NDEuMjAwMjguMTMxOTEyNjI4My4yNDM5LmRjbSxmMGEyNjFmODE3M2ZjMTEwOTYwMzdmMmI1ZGJlOWZhZWY1YTc5OGQ4Cg==</GLOBAL-hash-Descrizione>\n"
     * + "            <FILE-hash>014ce934c9fbdaccbee18a917a447ef2e3df3261</FILE-hash>\n" +
     * "            <FILE-hash-algo>SHA-1</FILE-hash-algo>\n" +
     * "            <FILE-hash-encoding>hexBinary</FILE-hash-encoding>\n" + "        </ns3:DatiSpecifici>\n" +
     * "    </UnitaDocumentaria>\n" + "</ns2:ListaUnitaDocumentarie>";
     *
     * // StringReader tmpReaderFiltri = new StringReader(datiXml);
     *
     * try { // JAXBContext ctx = JAXBContext.newInstance("it.eng.sacerasi.ws.xml.invioAsync"); JAXBContext ctx =
     * JAXBContext.newInstance(ListaUnitaDocumentarieType.class, it.eng.sacerasi.ws.xml.invioAsync.ObjectFactory.class);
     * Unmarshaller u = ctx.createUnmarshaller(); SchemaFactory schemaFctry =
     * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); Schema datispecFiltriSchema =
     * schemaFctry.newSchema(new
     * File("/Progetti/parer-ping-xml/target/classes/xsd/it/eng/sacerasi/ws/xml/invioAsync/WSInvioAsync.xsd"));
     * u.setSchema(datispecFiltriSchema); //Create a SAXSource specifying the filter Source source =
     * it.eng.sacerasixml.xsd.util.Utils.getSaxSource(datiXmlOri); //Do unmarshalling
     * JAXBElement<ListaUnitaDocumentarieType> elemento=(JAXBElement<ListaUnitaDocumentarieType>)u.unmarshal(source);
     * ListaUnitaDocumentarieType parsedListaFiltri = elemento.getValue();
     * System.out.println("asdas"+parsedListaFiltri);
     *
     * } catch (JAXBException | SAXException ex) { ex.printStackTrace(); } }
     *
     *
     */
    /*
     * @Test public void testJaxb6() { System.out.println("TEST InvioAsync");
     *
     * String datiXmlInvio= "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
     * "<ns2:ListaUnitaDocumentarie xmlns:ns2=\"http://invioasync.xml.ws.sacerasi.eng.it/\">\n" +
     *
     * "    <Versione>1.0</Versione>\n" + "    <UnitaDocumentaria>\n" +
     * "        <ns3:DatiSpecifici xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">\n" + //
     * "        <DatiSpecifici>\n" + "            <VersioneDatiSpecifici>1.0</VersioneDatiSpecifici>\n" +
     * "            <AETNodoDicom>DCM4CHEE</AETNodoDicom>\n" + "            <SOPClassList>\n" +
     * "                <SOPClass>1.2.840.10008.5.1.4.1.1.88.33</SOPClass>\n" + "            </SOPClassList>\n" +
     * "            <StudyDate>2011-10-20T17:52:51.000+02:00</StudyDate>\n" +
     * "            <AccessionNumber>MS2166105</AccessionNumber>\n" + "            <ModalityInStudyList>\n" +
     * "                <ModalityInStudy>SR</ModalityInStudy>\n" + "            </ModalityInStudyList>\n" +
     * "            <StudyDescription>MAMMOGRAFIA BILATERALE</StudyDescription>\n" +
     * "            <PatientName>COTTERLI^SIMONETTA</PatientName>\n" + "            <PatientId>408560</PatientId>\n" +
     * "            <PatientBirthDate>1961-12-31</PatientBirthDate>\n" + "            <PatientSex>F</PatientSex>\n" +
     * "            <StudyInstanceUID>1.2.3.4.5.6.7.8.9.951206</StudyInstanceUID>\n" +
     * "            <NumberStudyRelatedSeries>1</NumberStudyRelatedSeries>\n" +
     * "            <NumberStudyRelatedImages>1</NumberStudyRelatedImages>\n" +
     * "            <StudyID>REQ2011002131945</StudyID>\n" +
     * "            <DataPresaInCarico>2019-01-15T11:22:40.000+01:00</DataPresaInCarico>\n" +
     * "            <DCM-hash>0a58b8b47b1e11d2a062d6bf13eeab14ded32271</DCM-hash>\n" +
     * "            <DCM-hash-algo>SHA-1</DCM-hash-algo>\n" +
     * "            <DCM-hash-encoding>hexBinary</DCM-hash-encoding>\n" +
     * "            <DCM-hash-Descrizione>MHgwMDA4MDAyMD0yMDExMTAyMAoweDAwMDgwMDMwPTE3NTI1MQoweDAwMDgwMDUwPU1TMjE2NjEwNQoweDAwMTAwMDEwPUNPVFRFUkxJXlNJTU9ORVRUQQoweDAwMTAwMDIwPTQwODU2MAoweDAwMTAwMDIxPQoweDAwMTAwMDMwPTE5NjExMjMxCjB4MDAxMDAwNDA9RgoweDAwMjAwMDBEPTEuMi4zLjQuNS42LjcuOC45Ljk1MTIwNgoweDAwMjAxMjA4PTkK</DCM-hash-Descrizione>\n"
     * + "            <GLOBAL-hash>1f1578d1f67df28f14ce9f70e1d02a2a474f45f6</GLOBAL-hash>\n" +
     * "            <GLOBAL-hash-algo>SHA-1</GLOBAL-hash-algo>\n" +
     * "            <GLOBAL-hash-encoding>hexBinary</GLOBAL-hash-encoding>\n" +
     * "            <GLOBAL-hash-Descrizione>MS4yLjg0MC4xMTM3MDQuNy4xLjEuMzUxNjk0ODY1OC41MDY2Mjg0NjEuNDUxMTEuMzAuMTY2LjUzNTg5NzkvMS4yLjg0MC4xMTM3MDQuNy4xLjIyMjAxNjU5NDEuMjAwMjguMTMxOTEyNjI4My4yNDM5LmRjbSxmMGEyNjFmODE3M2ZjMTEwOTYwMzdmMmI1ZGJlOWZhZWY1YTc5OGQ4Cg==</GLOBAL-hash-Descrizione>\n"
     * + "            <FILE-hash>014ce934c9fbdaccbee18a917a447ef2e3df3261</FILE-hash>\n" +
     * "            <FILE-hash-algo>SHA-1</FILE-hash-algo>\n" +
     * "            <FILE-hash-encoding>hexBinary</FILE-hash-encoding>\n" + // "        </DatiSpecifici>\n" +
     * "        </ns3:DatiSpecifici>\n" + "    </UnitaDocumentaria>\n" +
     *
     * "</ns2:ListaUnitaDocumentarie>";
     *
     * try { XMLReader reader = XMLReaderFactory.createXMLReader(); //Create the filter (to add namespace) and set the
     * xmlReader as its parent. // NamespaceFilterForUnmashal inFilter = new NamespaceFilterForUnmashal();
     * NamespaceFilterForUnmashal inFilter = new NamespaceFilterForUnmashal(); inFilter.setParent(reader); //Prepare the
     * input, in this case a java.io.File (output) InputSource is = new InputSource(new StringReader(datiXmlInvio));
     * //Create a SAXSource specifying the filter SAXSource source = new SAXSource(inFilter, is); //Do unmarshalling
     * SchemaFactory schemaFctry = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); JAXBContext
     * datispecFiltriCtx_ListaFiltri = JAXBContext.newInstance(ListaUnitaDocumentarieType.class,
     * it.eng.sacerasi.ws.xml.invioAsync.ObjectFactory.class); Schema datispecFiltriSchema = schemaFctry.newSchema(new
     * File("/Progetti/parer-ping-xml/target/classes/xsd/it/eng/sacerasi/ws/xml/invioAsync/WSInvioAsync.xsd"));
     * Unmarshaller u = datispecFiltriCtx_ListaFiltri.createUnmarshaller(); u.setSchema(datispecFiltriSchema);
     *
     * JAXBElement<ListaUnitaDocumentarieType> elemento=(JAXBElement<ListaUnitaDocumentarieType>)u.unmarshal(source);
     * ListaUnitaDocumentarieType parsedListaFiltri = elemento.getValue();
     * System.out.println("asdas"+parsedListaFiltri);
     *
     * } catch (JAXBException | SAXException ex) { ex.printStackTrace(); }
     *
     * System.out.println("TEST DatiSpecifici");
     *
     * String datiXmlDatiSpecifici= "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
     * "<DatiSpecifici xmlns:ns2=\"http://invioasync.xml.ws.sacerasi.eng.it/\">\n" +
     * "	<VersioneDatiSpecifici>1.0</VersioneDatiSpecifici>\n" +
     * "	<AETNodoDicom xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">DCM4CHEE</AETNodoDicom>\n" +
     * "	<SOPClassList xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">\n" +
     * "		<SOPClass>1.2.840.10008.5.1.4.1.1.88.33</SOPClass>\n" + "	</SOPClassList>\n" +
     * "	<StudyDate xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">2011-10-20T17:52:51.000+02:00</StudyDate>\n"
     * + "	<AccessionNumber xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">MS2166105</AccessionNumber>\n" +
     * "	<ModalityInStudyList xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">\n" +
     * "		<ModalityInStudy>SR</ModalityInStudy>\n" + "	</ModalityInStudyList>\n" +
     * "	<StudyDescription xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">MAMMOGRAFIA BILATERALE</StudyDescription>\n"
     * + "	<PatientName xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">COTTERLI^SIMONETTA</PatientName>\n"
     * + "	<PatientId xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">408560</PatientId>\n" +
     * "	<PatientBirthDate xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">1961-12-31</PatientBirthDate>\n"
     * + "	<PatientSex xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">F</PatientSex>\n" +
     * "	<StudyInstanceUID xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">1.2.3.4.5.6.7.8.9.159260</StudyInstanceUID>\n"
     * +
     * "	<NumberStudyRelatedSeries xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">1</NumberStudyRelatedSeries>\n"
     * +
     * "	<NumberStudyRelatedImages xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">1</NumberStudyRelatedImages>\n"
     * + "	<StudyID xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">REQ2011002131945</StudyID>\n" +
     * "	<DataPresaInCarico xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">2019-01-23T16:08:19.000+01:00</DataPresaInCarico>\n"
     * +
     * "	<DCM-hash xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">ebc5dac17ac0f3428239a95cb34b639b27554eb2</DCM-hash>\n"
     * + "	<DCM-hash-algo xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">SHA-1</DCM-hash-algo>\n" +
     * "	<DCM-hash-encoding xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">hexBinary</DCM-hash-encoding>\n"
     * +
     * "	<DCM-hash-Descrizione xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">MHgwMDA4MDAyMD0yMDExMTAyMAoweDAwMDgwMDMwPTE3NTI1MQoweDAwMDgwMDUwPU1TMjE2NjEwNQoweDAwMTAwMDEwPUNPVFRFUkxJXlNJTU9ORVRUQQoweDAwMTAwMDIwPTQwODU2MAoweDAwMTAwMDIxPQoweDAwMTAwMDMwPTE5NjExMjMxCjB4MDAxMDAwNDA9RgoweDAwMjAwMDBEPTEuMi4zLjQuNS42LjcuOC45LjE1OTI2MAoweDAwMjAxMjA4PTkK</DCM-hash-Descrizione>\n"
     * +
     * "	<GLOBAL-hash xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">81e0c12933f64f5f5c51b49acfa5c729a6b7e44f</GLOBAL-hash>\n"
     * + "	<GLOBAL-hash-algo xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">SHA-1</GLOBAL-hash-algo>\n" +
     * "	<GLOBAL-hash-encoding xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">hexBinary</GLOBAL-hash-encoding>\n"
     * +
     * "	<GLOBAL-hash-Descrizione xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">MS4yLjg0MC4xMTM3MDQuNy4xLjEuMzUxNjk0ODY1OC41MDY2Mjg0NjEuNDUxMTEuMzAuMTY2LjUzNTg5NzkvMS4yLjg0MC4xMTM3MDQuNy4xLjIyMjAxNjU5NDEuMjAwMjguMTMxOTEyNjI4My4yNDM5LmRjbSw1ZjBkZWU4OTA2YTVjZmVkY2IzMGVmYjAyNWI5NDA2M2FjYzIwZmNmCg==</GLOBAL-hash-Descrizione>\n"
     * +
     * "	<FILE-hash xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">998a9d6447a6591d63effa1efb3ffeebfccab013</FILE-hash>\n"
     * + "	<FILE-hash-algo xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">SHA-1</FILE-hash-algo>\n" +
     * "	<FILE-hash-encoding xmlns:ns3=\"http://datispecdicom.xml.ws.sacerasi.eng.it/\">hexBinary</FILE-hash-encoding>\n"
     * + "</DatiSpecifici>";
     *
     * try { XMLReader reader = XMLReaderFactory.createXMLReader(); //Create the filter (to add namespace) and set the
     * xmlReader as its parent. // NamespaceFilterForUnmashal inFilter = new NamespaceFilterForUnmashal();
     * NamespaceFilterForUnmashal inFilter = new NamespaceFilterForUnmashal(); inFilter.setParent(reader); //Prepare the
     * input, in this case a java.io.File (output) InputSource is = new InputSource(new
     * StringReader(datiXmlDatiSpecifici)); //Create a SAXSource specifying the filter SAXSource source = new
     * SAXSource(inFilter, is); //Do unmarshalling SchemaFactory schemaFctry =
     * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); JAXBContext datiSpecDicomCtx =
     * JAXBContext.newInstance(DatiSpecificiType.class, it.eng.sacerasi.ws.xml.datiSpecDicom.ObjectFactory.class);
     * Schema datispecDicomSchema = schemaFctry.newSchema(new File(
     * "/Progetti/parer-ping-xml/target/classes/xsd/it/eng/sacerasi/ws/xml/datiSpecDicom/WSMetadatiSpecificiDICOM.xsd"))
     * ; Unmarshaller u = datiSpecDicomCtx.createUnmarshaller(); u.setSchema(datispecDicomSchema);
     *
     * JAXBElement<DatiSpecificiType> elemento=(JAXBElement<DatiSpecificiType>)u.unmarshal(source); DatiSpecificiType
     * datiSpec = elemento.getValue(); System.out.println("asdas"+datiSpec);
     *
     * } catch (JAXBException | SAXException ex) { ex.printStackTrace(); }
     *
     * }
     */
}
