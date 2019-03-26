package com.saifiahmada.vaadin.belajarvaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@SuppressWarnings("serial")
@Route
public class MyFormLayout extends FormLayout {
	
	private TextField txtNama;
	
	private TextField txtAlamat;
	
	private TextField txtKota;
	
	private TextField txtNoHP;
	
	private HorizontalLayout tombols;
	
	public MyFormLayout() {
		txtNama = new TextField();
		txtNama.setLabel("Nama");
		txtNama.setPlaceholder("Masukkan nama anda");
		
		txtAlamat = new TextField();
		txtAlamat.setLabel("Alamat");
		txtAlamat.setPlaceholder("Masukkan alamat anda");
		
		txtNoHP = new TextField();
		txtNoHP.setLabel("No HP");
		txtNoHP.setPlaceholder("Masukkan No HP anda");
		
		txtKota = new TextField();
		txtKota.setLabel("Kota");
		txtKota.setPlaceholder("Masukkan kota tempat tinggal anda");
		
		Button btnSave = new Button("Simpan");
		
		Button btnCancel = new Button("Cancel");
		
		tombols = new HorizontalLayout();
		
		tombols.add(btnSave, btnCancel); 
		
		add(txtNama, txtAlamat, txtKota, txtNoHP , tombols ); 
	}

}
