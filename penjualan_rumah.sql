CREATE DATABASE penjualan_rumah;

USE penjualan_rumah;

CREATE TABLE tb_penjualan (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama_pemesan VARCHAR(100),
    area VARCHAR(50),
    tipe_rumah VARCHAR(10),
    luas_tanah INT,
    harga DOUBLE,
    lama_cicilan INT,
    cicilan_per_bulan DOUBLE
);


