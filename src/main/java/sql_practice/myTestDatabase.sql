CREATE DATABASE IF NOT EXISTS myTestDatabase;

USE myTestDatabase;

CREATE TABLE IF NOT EXISTS vehicles (
  vehicleId INT NOT NULL AUTO_INCREMENT,
  year INT NOT NULL,
  make VARCHAR(255) NOT NULL,
  PRIMARY KEY(vehicleId)
);

