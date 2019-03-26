package com.saifiahmada.vaadin.belajarvaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route
public class Tombol extends VerticalLayout {
	
	private Button btn;
	
	private Button btn2;
	
	private HorizontalLayout hLayout;
	
	public Tombol() {
		btn = new Button("Simpan");
		btn2 = new Button("Close");
		
		hLayout = new HorizontalLayout();
		
		hLayout.add(btn , btn2);
		
		add(hLayout); 
		
	}
	
	

}
