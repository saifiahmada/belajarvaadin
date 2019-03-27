package com.saifiahmada.vaadin.belajarvaadin;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route
public class MyCheckBox extends FormLayout {
	
	private Checkbox cb;
	
	private Button btn;
	
	public MyCheckBox() {
		
		btn = new Button("Simpan" , new Icon(VaadinIcon.PAPERPLANE));
		
		btn.addClickListener(this::actionButton);
		
		cb = new Checkbox();
		cb.setLabel("Makan"); 
		add(cb , btn); 
		
	
	}
	
	public void actionButton(ClickEvent<Button> event) {
		
		Notification notif = new Notification(cb.getLabel() , 3000 , Position.MIDDLE );
		notif.open();
	}

}
