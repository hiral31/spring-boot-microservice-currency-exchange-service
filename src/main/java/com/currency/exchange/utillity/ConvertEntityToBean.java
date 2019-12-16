package com.currency.exchange.utillity;

import com.currency.exchange.bean.ExchangeValue;
import com.currency.exchange.model.ExchangeValueEntity;

public class ConvertEntityToBean {

	public ExchangeValue convertExchangeEntityToBean(ExchangeValueEntity exchangeValueEntity) {
		ExchangeValue exchangeValue=new ExchangeValue();
	
		exchangeValue.setId(exchangeValueEntity.getId());
		exchangeValue.setFrom(exchangeValueEntity.getFrom());
		exchangeValue.setTo(exchangeValueEntity.getTo());
		exchangeValue.setConversionMultiple(exchangeValueEntity.getConversionMultiple());
		exchangeValue.setPort(exchangeValueEntity.getPort());
		
		return exchangeValue;
	}
}
