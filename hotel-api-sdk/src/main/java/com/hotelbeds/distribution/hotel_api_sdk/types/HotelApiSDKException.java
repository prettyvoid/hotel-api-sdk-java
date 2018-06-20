package com.hotelbeds.distribution.hotel_api_sdk.types;

/*
 * #%L
 * hotel-api-sdk
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


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class HotelApiSDKException extends Exception {

    public static final long serialVersionUID = 1L;

    private final HotelbedsError error;
    private String rawHttpResponse;

    public HotelApiSDKException(com.hotelbeds.hotelapimodel.auto.messages.HotelbedsError error, String rawHttpResponse) {
        this(new HotelbedsError(error.getCode(), error.getMessage()), rawHttpResponse);
    }

    public HotelApiSDKException(com.hotelbeds.hotelcontentapi.auto.messages.HotelbedsError error, String rawHttpResponse) {
        this(new HotelbedsError(error.getCode(), error.getMessage()), rawHttpResponse);
    }

    public HotelApiSDKException(HotelbedsError error, String rawHttpResponse) {
        this(error, null, rawHttpResponse);
    }

    public HotelApiSDKException(HotelbedsError error) {
        this(error, null, null);
    }

    public HotelApiSDKException(HotelbedsError error, Throwable throwable, String rawHttpResponse) {
        super("HotelSDKException (Error " + error.getCode() + " while performing operation", throwable);
        this.error = error;
        this.rawHttpResponse = rawHttpResponse;
    }

    public HotelApiSDKException(HotelbedsError error, Throwable throwable) {
        super("HotelSDKException (Error " + error.getCode() + " while performing operation", throwable);
        this.error = error;
    }
}
