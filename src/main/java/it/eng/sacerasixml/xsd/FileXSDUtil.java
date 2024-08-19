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

import java.net.URL;

/**
 * Classe che restituisce i nomi dei file XSD
 *
 * In questo modo gli utilizzatori della libreria non devono conoscere i path dei file
 *
 * @author Moretti_Lum, Iacolucci_Ma
 */
public class FileXSDUtil {

    private URL getResource(String fileName) {
        URL result = null;
        ClassLoader classLoader = getClass().getClassLoader();
        result = classLoader.getResource(fileName);
        return result;
    }

    public static URL getURLFileXSD(FileXSD file) {
        URL result = null;

        if (file != null) {
            result = new FileXSDUtil().getResource(file.getFilename());
        }

        return result;
    }
}
