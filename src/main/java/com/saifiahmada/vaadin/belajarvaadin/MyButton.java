package com.saifiahmada.vaadin.belajarvaadin;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route
public class MyButton extends FormLayout {
	
	private Button btnDefault;
	
	private Button btnCancel;
	
	private HorizontalLayout layout;
	
	private VerticalLayout vertical;
	
	public MyButton() {
		
		vertical = new VerticalLayout();
		
		layout = new HorizontalLayout();
		
		btnDefault = new Button("Simpan");
		
		Notification notif = new Notification("Notif dari tombol Cancel", 5000, Position.MIDDLE);
		
		
		btnCancel = new Button("Cancel");
		
		btnCancel.addClickListener(event -> notif.open());
		
		btnDefault.addClickListener(this::action);
		
		layout.add(btnDefault, btnCancel);
		
		Button btnIcon = new Button("Btn Icon" , new Icon(VaadinIcon.BELL) );
		
		btnIcon.addClickListener(this::actionIcon);
		
		vertical.add(btnIcon);
		
		add(layout, vertical); 
	}
	
	public void action(ClickEvent<Button> event  ) {
		Notification.show("Testing");
	}
	
	public void actionIcon(ClickEvent<Button> event  ) {
		//Notification.show("Notif dari Button Icon");
		Notification notif = new Notification("Notif dari Button Icon", 5000, Position.MIDDLE);
		notif.open();
	}

}
