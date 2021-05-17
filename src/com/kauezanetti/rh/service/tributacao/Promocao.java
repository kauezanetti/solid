package com.kauezanetti.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel{
	
	BigDecimal valor;
	LocalDate data;
	
	@Override
	public BigDecimal valor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public LocalDate data() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BigDecimal valorImposto() {
		// TODO Auto-generated method stub
		return valor.multiply(new BigDecimal("0.1"));
	}
}
