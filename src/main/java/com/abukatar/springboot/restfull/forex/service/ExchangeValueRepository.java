package com.abukatar.springboot.restfull.forex.service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends
        JpaRepository<com.abukatar.springboot.restfull.forex.service.ExchangeValue, Long>
{
  com.abukatar.springboot.restfull.forex.service.ExchangeValue findByFromAndTo(String from, String to);
}