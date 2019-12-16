package com.currency.exchange.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.currency.exchange.bean.ExchangeValue;
import com.currency.exchange.model.ExchangeValueEntity;
import com.currency.exchange.repository.ExchangeValueRepository;
import com.currency.exchange.utillity.ConvertEntityToBean;



@Service
public class ExchangeValueService {
	
	@Autowired
	ExchangeValueRepository exchangeValueRepository;
	
	@Autowired
	Environment environment;
	
	ConvertEntityToBean convertEntityToBean=new ConvertEntityToBean();
	
	public ExchangeValue findByFromAndTo(String from,String to) {
		ExchangeValueEntity exchangeValueEntity = 
				exchangeValueRepository.findByFromAndTo(from, to);
		    
		exchangeValueEntity.setPort(
		        Integer.parseInt(environment.getProperty("local.server.port")));
		    
		    return convertEntityToBean.convertExchangeEntityToBean(exchangeValueEntity);   
	}

}
 