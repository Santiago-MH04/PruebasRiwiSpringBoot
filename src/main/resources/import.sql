INSERT INTO roles (name) VALUES ('ROLE_ADMIN'),('ROLE_CARRIER');
INSERT INTO users (username, password, email) VALUES (Pepito Pérez','soy.pepo.perez*','pepito@perez.com'),('Anita La Huerfanita','quiereme&mimame','anita@sinhogar.com'),('Jesucristo García','TercerDia*Paz','jesucristo@garcia.com');
INSERT INTO users_roles (user_id, role_id) VALUES (1,1),(1,2),(2,2),(3,2);

INSERT INTO carriers (company) VALUES ('XPO Logistics'),('YRC'),('Servientrega'),('Coordinadora');
INSERT INTO carriers_users (carrier_id, user_id) VALUES (1,1),(2,2),(3,3);

INSERT INTO loads (height, width, length, weight, status, state, pallet_id, user_id) VALUES (100, 70, 70, 300, 'IN_TRANSIT', 'FINE', 1),(900, 80, 60, 550, 'DELIVERED', 'DAMAGED', 2);
INSERT INTO pallets (maximum_capacity, state, location, load_id) VALUES (300, 'IN_USE', 'CENTRE_END', 1),(750, 'AVAILABLE', 'WEST_END', 1),(1200, 'AVAILABLE', 'WEST_END', 2),(750, 'DAMAGED', 'EAST_END', 2),(800, 'AVAILABLE', 'EAST_END', 3)

INSERT INTO users_loads (user_id, load_id) VALUES (1,1),(3,2);
INSERT INTO carriers_loads (carrier_id, load_id) VALUES (1,1),(3,2);
