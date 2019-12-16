package com.currency.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.currency.exchange.model.ExchangeValueEntity;



@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValueEntity, Long> {

	/*@Query("select t from ExchangeValueEntity t where t.from=?1 and t.to=?2")*/
	ExchangeValueEntity findByFromAndTo(String from,String to);
}
