package com.saifiahmada.vaadin.belajarvaadin;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route
public class MyGrid extends VerticalLayout {
	
	public MyGrid() {
		
		Grid<Mahasiswa> grid = new Grid<Mahasiswa>(Mahasiswa.class);
		grid.setItems(getList());
		grid.setColumns("nim","nama","alamat");
		add(grid); 
		
	}
	
	private List<Mahasiswa> getList(){
		
		List<Mahasiswa> list = new ArrayList<Mahasiswa>();
		list.add(new Mahasiswa("001", "Arfani", "Jln Semangka 10"));
		list.add(new Mahasiswa("002", "Ari Wahyudi", "Jln Mangga 100"));
		list.add(new Mahasiswa("003", "Mirham Ashafa", "Jln Nangka 12"));
		list.add(new Mahasiswa("004", "Ahmada Habibi", "Jln Semangka 14"));
		list.add(new Mahasiswa("005", "Ahmada", "Jln Durian 12"));
		list.add(new Mahasiswa("006", "Ali", "Jln Rambutan 10"));
		
		return list;
	}
	

}
