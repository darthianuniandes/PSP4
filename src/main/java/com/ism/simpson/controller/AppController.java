package com.ism.simpson.controller;

import com.ism.simpson.view.MainView;

public class AppController {
	
	private static MainView mainView;
	
    public static void main( String[] args ) {
        mainView = new MainView();
        mainView.leerArchivo(args);
        mainView.obtenerValoresArchivo();
        mainView.integrarSimpsons();
        mainView.imprimirResultados();
    }
}
