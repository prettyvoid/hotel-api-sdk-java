/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
@AllArgsConstructor
public class VoucherEmail {

	@XmlAttribute
	private String to;
	@XmlAttribute
	private String from;
	@XmlAttribute
	private String title;
	@XmlAttribute
	private String body;


}