package com.kauezanetti.rh.service.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste{
	BigDecimal valorImposto();
}