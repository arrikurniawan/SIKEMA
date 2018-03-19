package com.example.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MhsModel {
	private String npm;
	private String nama;
	private String tempatLahir;
	private Date tanggalLahir;
	private int jenisKelamin; 
	private String agama;
	private String golDarah;
	private String status;
	private String tahunMasuk;
	private String jalurMasuk;
	private String namaProdi;
	private String namaFakultas;
	private String namaUniv;
}