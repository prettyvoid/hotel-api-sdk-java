package com.hotelbeds.distribution.hotel_api_sdk.types;

/*
 * #%L
 * HotelAPI SDK
 * %%
 * Copyright (C) 2015 - 2016 HOTELBEDS TECHNOLOGY, S.L.U.
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


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Data
@AllArgsConstructor
public class HotelbedsError {

    private String code;
    private String message;
    private String raw;

    public HotelbedsError(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
