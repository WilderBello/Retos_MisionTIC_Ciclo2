--
-- File generated with SQLiteStudio v3.3.3 on Sat Jun 18 19:43:51 2022
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Datos
CREATE TABLE Datos (id INTEGER PRIMARY KEY AUTOINCREMENT, Nombre STRING (30) NOT NULL, Cedula STRING (30) NOT NULL, Edad INTEGER NOT NULL, Ciudad STRING (30) NOT NULL, EPS STRING (30) NOT NULL, Enfermedad STRING (30) NOT NULL);
INSERT INTO Datos (id, Nombre, Cedula, Edad, Ciudad, EPS, Enfermedad) VALUES (8, 'Jose', 123456, 45, 'Bogota', 2, 2);
INSERT INTO Datos (id, Nombre, Cedula, Edad, Ciudad, EPS, Enfermedad) VALUES (10, 'Ana', 12345, 70, 'Tame', 1, 1);
INSERT INTO Datos (id, Nombre, Cedula, Edad, Ciudad, EPS, Enfermedad) VALUES (11, 'Carlos', 123, 30, 'Tame', '.', '..');
INSERT INTO Datos (id, Nombre, Cedula, Edad, Ciudad, EPS, Enfermedad) VALUES (12, 'Andres', 12345678, 65, 'Bogota', '.', '.');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
