-- java_crud.barang definition

CREATE TABLE `barang` (
  `kodebarang` varchar(100) NOT NULL,
  `namabarang` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`kodebarang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- java_crud.wisata definition

CREATE TABLE `wisata` (
  `kodewisata` varchar(100) NOT NULL,
  `namawisata` varchar(100) DEFAULT NULL,
  `kota` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`kodewisata`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- java_crud.mahasiswa definition

CREATE TABLE `mahasiswa` (
  `nimmhs` varchar(100) NOT NULL,
  `namamhs` varchar(100) DEFAULT NULL,
  `alamatmhs` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`nimmhs`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;