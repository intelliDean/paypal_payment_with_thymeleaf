package com.integration.paypal.payment;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

	private double price;
	private String currency;
	private String method;
	private String intent;
	private String description;

}
