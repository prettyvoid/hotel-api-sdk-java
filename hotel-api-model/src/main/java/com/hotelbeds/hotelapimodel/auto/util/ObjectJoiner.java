/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.util;

/*
 * #%L
 * HotelAPI Model
 * %%
 * Copyright (C) 2015 - 2018 HOTELBEDS GROUP, S.L.U.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */


import java.util.Collection;
import java.util.StringJoiner;


/**
 * The Class ObjectJoiner.
 *
 * @author 
 */
public class ObjectJoiner {

    private ObjectJoiner() {
    }

    /**
     * Join.
     *
     * @param separator the separator
     * @param arguments the arguments
     * @return the string
     */
    public static String join(CharSequence separator, Object... arguments) {
        StringJoiner st = new StringJoiner(separator);
        if (arguments != null) {
            for (Object object : arguments) {
                if (object != null) {
                    st.add(object.toString());
                } else {
                    st.add("");
                }
            }
        }
        return st.toString();
    }

    /**
     * Join.
     *
     * @param separator the separator
     * @param arguments the arguments
     * @return the string
     */
    public static String join(CharSequence separator, Collection<? extends Object> arguments) {
        StringJoiner st = new StringJoiner(separator);
        if (arguments != null) {
            for (Object object : arguments) {
                if (object != null) {
                    st.add(object.toString());
                } else {
                    st.add("");
                }
            }
        }
        return st.toString();
    }

    /**
     * Simply join.
     *
     * @param arguments the arguments
     * @return the string
     */
    public static String simplyJoin(Object... arguments) {
        return join("", arguments);
    }
}
