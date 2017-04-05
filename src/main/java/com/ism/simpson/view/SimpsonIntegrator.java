package com.ism.simpson.view;

import com.ism.simpson.model.SimpsonIntegrationPart;

public class SimpsonIntegrator {

	private double E;
	private Float x;
	private int duff;
	
	public SimpsonIntegrator(Float x, int duff){
		this.x = x;
		this.duff = duff;
		E = 0.00001;
	}
	public Double calcularSimpson(){
		double error = 0;
		int num_seg = 0;
		double resultPrev = 0;
		do {
			num_seg += 10;
			SimpsonIntegrationPart iterator = new SimpsonIntegrationPart(x, duff, num_seg);
			iterator.calcularXi();
			iterator.calcularParte1();
			iterator.calcularParte2();
			iterator.calcularParte3();
			iterator.calcularFX();
			iterator.calcularMultiplier();
			iterator.calcularTerms();
			error = iterator.calcularResult() - resultPrev;
			resultPrev = iterator.calcularResult();
		} while (Math.abs(error) > E);
		num_seg = 0;
		return resultPrev;
	}
}
