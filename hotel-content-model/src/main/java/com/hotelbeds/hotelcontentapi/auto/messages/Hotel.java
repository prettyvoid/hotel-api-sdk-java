/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelcontentapi.auto.messages;

/*
 * #%L
 * Hotel Content Model
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


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hotelbeds.hotelcontentapi.auto.messages.Accommodation;
import com.hotelbeds.hotelcontentapi.auto.messages.Board;
import com.hotelbeds.hotelcontentapi.auto.messages.Category;
import com.hotelbeds.hotelcontentapi.auto.messages.Chain;
import com.hotelbeds.hotelcontentapi.auto.messages.Content;
import com.hotelbeds.hotelcontentapi.auto.messages.Country;
import com.hotelbeds.hotelcontentapi.auto.messages.Destination;
import com.hotelbeds.hotelcontentapi.auto.messages.GeoLocation;
import com.hotelbeds.hotelcontentapi.auto.messages.GroupCategory;
import com.hotelbeds.hotelcontentapi.auto.messages.HotelFacility;
import com.hotelbeds.hotelcontentapi.auto.messages.HotelIssue;
import com.hotelbeds.hotelcontentapi.auto.messages.HotelPhone;
import com.hotelbeds.hotelcontentapi.auto.messages.HotelPointOfInterest;
import com.hotelbeds.hotelcontentapi.auto.messages.HotelRoom;
import com.hotelbeds.hotelcontentapi.auto.messages.HotelTerminal;
import com.hotelbeds.hotelcontentapi.auto.messages.Image;
import com.hotelbeds.hotelcontentapi.auto.messages.Segment;
import com.hotelbeds.hotelcontentapi.auto.messages.WildCard;
import com.hotelbeds.hotelcontentapi.auto.messages.Zone;
import java.lang.Short;
import java.util.List;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
public class Hotel {

    private Integer code;
    private Content name;
    private Content description;
    private String countryCode;
    private Country country;
    private String destinationCode;
    private Short zoneCode;
    private Destination destination;
    private Zone zone;
    private GeoLocation coordinates;
    private String categoryCode;
    private Category category;
    private String categoryGroupCode;
    private GroupCategory categoryGroup;
    private String chainCode;
    private Chain chain;
    private String accommodationTypeCode;
    private Accommodation accommodationType;
    private List<String> boardCodes;
    private List<Board> boards;
    private List<Integer> segmentCodes;
    private List<Segment> segments;
    private Content address;
    private String postalCode;
    private Content city;
    private String email;
    private String license;
    private Integer giataCode;
    private List<HotelPhone> phones;
    private List<HotelRoom> rooms;
    private List<HotelFacility> facilities;
    private List<HotelTerminal> terminals;
    private List<HotelIssue> issues;
    private List<HotelPointOfInterest> interestPoints;
    private List<Image> images;
    private List<WildCard> wildcards;
    private String web;
    @JsonProperty("S2C")
    private String sureToCare;
    private Integer exclusiveDeal;

}
