INSERT INTO `mayo23`.`pasajeros` (`dni`, `nombre`) VALUES ('111', 'Pilar');
INSERT INTO `mayo23`.`pasajeros` (`dni`, `nombre`) VALUES ('222', 'Aurora');

INSERT INTO `mayo23`.`vuelos` (`fecha`, `horallegada`, `horasalida`, `descripcion`, `identificador`) VALUES ('2023-05-23', '17:00', '15:00', 'OVD-MAD', 'FOVMD-1');
INSERT INTO `mayo23`.`vuelos` (`fecha`, `horallegada`, `horasalida`, `descripcion`, `identificador`) VALUES ('2023-05-10', '16:00', '12:00', 'OVD-BARC', 'FOVBAR-1');

INSERT INTO `mayo23`.`vuelopasajero` (`embarqueprioritario`, `idpasajero`, `idvuelo`, `maleta10`, `maleta20`, `tarjetaembarque`) VALUES ('1', '2', '1', '2', '0', '9f');
INSERT INTO `mayo23`.`vuelopasajero` (`embarqueprioritario`, `idpasajero`, `idvuelo`, `maleta10`, `maleta20`, `tarjetaembarque`) VALUES ('0', '2', '2', '0', '1', '14A');

