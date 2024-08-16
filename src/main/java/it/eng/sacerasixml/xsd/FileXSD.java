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

package it.eng.sacerasixml.xsd;

/**
 *
 * @author Moretti_Lu, Iacolucci_Ma
 */
public enum FileXSD {
    INVIO_ASYNC_XSD("/xsd/it/eng/sacerasi/ws/xml/invioAsync/WSInvioAsync.xsd"),
    DATI_SPEC_DICOM_XSD("/xsd/it/eng/sacerasi/ws/xml/datiSpecDicom/WSMetadatiSpecificiDICOM.xsd"),
    DATI_SPEC_RESULT_XSD("/xsd/it/eng/sacerasi/ws/xml/datiSpecResult/WSDatiSpecificiDiarioResult.xsd"),
    DATI_SPEC_OUT_XSD("/xsd/it/eng/sacerasi/ws/xml/datiSpecOut/WSDatiSpecificiDiarioOut.xsd"),
    DATI_SPEC_ORDER_XSD("/xsd/it/eng/sacerasi/ws/xml/datiSpecOrder/WSDatiSpecificiDiarioOrder.xsd"),
    DATI_SPEC_FILTRI_XSD("/xsd/it/eng/sacerasi/ws/xml/datiSpecFiltri/WSDatiSpecificiDiarioFiltri.xsd"),
    INVIO_DA_TRASF_XSD("/xsd/it/eng/sacerasi/ws/xml/invioDaTrasf/WSInvioDaTrasf.xsd"),
    INVIO_SU_XSD("/xsd/it/eng/sacerasi/su/xml/invioSU/InvioSU.xsd"),
    INVIO_SISMA_XSD("/xsd/it/eng/sacerasi/sisma/xml/invioSisma/InvioSisma.xsd"),
    UNITA_DOCUMENTARIA_XSD("/xsd/it/eng/sacerasi/xml/unitaDocumentaria/UnitaDocumentaria.xsd");

    private final String filename;

    FileXSD(String filename) {
        this.filename = filename;
    }

    String getFilename() {
        return filename;
    }
}
