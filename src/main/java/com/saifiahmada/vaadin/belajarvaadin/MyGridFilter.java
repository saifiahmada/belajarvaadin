package com.saifiahmada.vaadin.belajarvaadin;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route
public class MyGridFilter extends VerticalLayout {

	public MyGridFilter() {

		Grid<Mahasiswa> grid = new Grid<>();

		ListDataProvider<Mahasiswa> provider = new ListDataProvider<>(getList());
		grid.setDataProvider(provider);

		Grid.Column<Mahasiswa> nimKolom = grid.addColumn(Mahasiswa::getNim).setHeader("nim");

		Grid.Column<Mahasiswa> namaKolom = grid.addColumn(Mahasiswa::getNama).setHeader("nama");

		Grid.Column<Mahasiswa> alamatKolom = grid.addColumn(Mahasiswa::getAlamat).setHeader("alamat");

		HeaderRow filterRow = grid.appendHeaderRow();

		// awal filter NIM
		TextField filterNim = new TextField();
		filterNim.addValueChangeListener(
				event -> provider.addFilter(mhs -> StringUtils.containsIgnoreCase(mhs.getNim(), filterNim.getValue())));

		filterNim.setValueChangeMode(ValueChangeMode.EAGER);
		filterNim.setSizeFull();
		filterNim.setPlaceholder("Cari nim");

		filterRow.getCell(nimKolom).setComponent(filterNim);
		// akhir filter NIM

		// awal filter Nama
		TextField filterNama = new TextField();
		filterNama.addValueChangeListener(event -> provider
				.addFilter(mhs -> StringUtils.containsIgnoreCase(mhs.getNama(), filterNama.getValue())));

		filterNama.setValueChangeMode(ValueChangeMode.EAGER);
		filterNama.setSizeFull();
		filterNama.setPlaceholder("Cari nama");

		filterRow.getCell(namaKolom).setComponent(filterNama);
		// akhir filter Nama
		
		// awal filter Alamat
				TextField filterAlamat = new TextField();
				filterAlamat.addValueChangeListener(event -> provider
						.addFilter(mhs -> StringUtils.containsIgnoreCase(mhs.getAlamat(), filterAlamat.getValue())));

				filterAlamat.setValueChangeMode(ValueChangeMode.EAGER);
				filterAlamat.setSizeFull();
				filterAlamat.setPlaceholder("Cari alamat");

				filterRow.getCell(alamatKolom).setComponent(filterAlamat);
				// akhir filter NIM

		add(grid);

	}

	private List<Mahasiswa> getList() {

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
