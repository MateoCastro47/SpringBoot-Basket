-- ==========================================
-- LIGAS (Temporada 2025/2026)
-- ==========================================
INSERT INTO Liga (nombre, pais, temporadaActual, FechaInicio, FechaFin, nivelCompeticion) VALUES 
('Liga ACB', 'España', 2025, '2025-09-20', '2026-06-20', 'Primera División'),
('NBA', 'EEUU', 2025, '2025-10-22', '2026-06-20', 'Profesional');

-- ==========================================
-- ESTADIOS
-- ==========================================
-- ACB
INSERT INTO Estadio (Nombre, Ciudad, Capacidad) VALUES 
('WiZink Center', 'Madrid', 17453.0),          -- 1
('Palau Blaugrana', 'Barcelona', 7585.0),      -- 2
('Fernando Buesa Arena', 'Vitoria', 15716.0),  -- 3
('Martín Carpena', 'Málaga', 11300.0),         -- 4
('La Fonteta', 'Valencia', 8500.0),            -- 5
('Santiago Martín', 'Tenerife', 5100.0),       -- 6
('Gran Canaria Arena', 'Las Palmas', 9870.0),  -- 7
('Palacio de Deportes', 'Murcia', 7454.0),     -- 8
('Palau Olímpic', 'Badalona', 12760.0),        -- 9
('Nou Congost', 'Manresa', 5000.0),            -- 10
('Poliesportiu d''Andorra', 'Andorra', 5000.0),-- 11
('Bilbao Arena', 'Bilbao', 10014.0),           -- 12
('Príncipe Felipe', 'Zaragoza', 10744.0),      -- 13
('Fontajau', 'Girona', 5500.0),                -- 14
('Pazo dos Deportes', 'Lugo', 5310.0),         -- 15
('Palacio de Deportes', 'Granada', 9507.0),    -- 16
('Coliseum da Coruña', 'A Coruña', 9300.0),    -- 17
('Barris Nord', 'Lleida', 6100.0);             -- 18

-- NBA (Algunos ejemplos representativos y genéricos para completar los 30)
INSERT INTO Estadio (Nombre, Ciudad, Capacidad) VALUES 
('TD Garden', 'Boston', 19156.0),              -- 19
('Barclays Center', 'Brooklyn', 17732.0),      -- 20
('Madison Square Garden', 'New York', 19812.0),-- 21
('Wells Fargo Center', 'Philadelphia', 20478.0),-- 22
('Scotiabank Arena', 'Toronto', 19800.0),      -- 23
('United Center', 'Chicago', 20917.0),         -- 24
('Rocket Mortgage FieldHouse', 'Cleveland', 19432.0), -- 25
('Little Caesars Arena', 'Detroit', 20332.0),  -- 26
('Gainbridge Fieldhouse', 'Indianapolis', 17923.0), -- 27
('Fiserv Forum', 'Milwaukee', 17341.0),        -- 28
('State Farm Arena', 'Atlanta', 16600.0),      -- 29
('Spectrum Center', 'Charlotte', 19077.0),     -- 30
('Kaseya Center', 'Miami', 19600.0),           -- 31
('Kia Center', 'Orlando', 18846.0),            -- 32
('Capital One Arena', 'Washington', 20356.0),  -- 33
('Ball Arena', 'Denver', 19520.0),             -- 34
('Target Center', 'Minneapolis', 18798.0),     -- 35
('Paycom Center', 'Oklahoma City', 18203.0),   -- 36
('Moda Center', 'Portland', 19393.0),          -- 37
('Delta Center', 'Salt Lake City', 18306.0),   -- 38
('Chase Center', 'San Francisco', 18064.0),    -- 39
('Intuit Dome', 'Inglewood', 18000.0),         -- 40 (Clippers)
('Crypto.com Arena', 'Los Angeles', 19068.0),  -- 41 (Lakers)
('Footprint Center', 'Phoenix', 17071.0),      -- 42
('Golden 1 Center', 'Sacramento', 17608.0),    -- 43
('American Airlines Center', 'Dallas', 19200.0), -- 44
('Toyota Center', 'Houston', 18055.0),         -- 45
('FedExForum', 'Memphis', 18119.0),            -- 46
('Smoothie King Center', 'New Orleans', 16867.0), -- 47
('Frost Bank Center', 'San Antonio', 18418.0); -- 48

-- ==========================================
-- ENTRENADORES
-- ==========================================
-- ACB
INSERT INTO Entrenador (Nombre, Apellido, Fecha_Nacimiento, Sueldo) VALUES 
('Chus', 'Mateo', '1969-01-23', 600000.0),
('Joan', 'Peñarroya', '1969-04-20', 550000.0),
('Pablo', 'Laso', '1967-10-13', 700000.0),
('Ibon', 'Navarro', '1976-04-30', 450000.0),
('Pedro', 'Martínez', '1961-06-29', 500000.0),
('Txus', 'Vidorreta', '1966-06-20', 400000.0),
('Jaka', 'Lakovic', '1978-07-09', 420000.0),
('Sito', 'Alonso', '1975-12-04', 380000.0),
('Dani', 'Miret', '1985-06-25', 300000.0),
('Diego', 'Ocampo', '1976-01-09', 320000.0),
('Natxo', 'Lezkano', '1972-10-17', 280000.0),
('Jaume', 'Ponsarnau', '1971-04-28', 350000.0),
('Porfirio', 'Fisac', '1965-01-24', 360000.0),
('Fotis', 'Katsikaris', '1967-05-16', 340000.0),
('Veljko', 'Mrsic', '1971-04-13', 310000.0),
('Pablo', 'Pin', '1982-10-13', 250000.0),
('Diego', 'Epifanio', '1978-05-25', 260000.0),
('Gerard', 'Encuentra', '1990-01-01', 240000.0);

-- NBA (30 Entrenadores)
INSERT INTO Entrenador (Nombre, Apellido, Fecha_Nacimiento, Sueldo) VALUES 
('Joe', 'Mazzulla', '1988-06-30', 4000000.0), -- BOS
('Jordi', 'Fernandez', '1982-12-27', 3000000.0), -- BKN
('Tom', 'Thibodeau', '1958-01-17', 5000000.0), -- NYK
('Nick', 'Nurse', '1967-07-24', 6000000.0), -- PHI
('Darko', 'Rajakovic', '1979-02-22', 3000000.0), -- TOR
('Billy', 'Donovan', '1965-05-30', 4500000.0), -- CHI
('Kenny', 'Atkinson', '1967-06-02', 4000000.0), -- CLE
('J.B.', 'Bickerstaff', '1979-03-10', 3500000.0), -- DET
('Rick', 'Carlisle', '1959-10-27', 5500000.0), -- IND
('Doc', 'Rivers', '1961-10-13', 7000000.0), -- MIL
('Quin', 'Snyder', '1966-10-30', 6000000.0), -- ATL
('Charles', 'Lee', '1984-11-11', 3000000.0), -- CHA
('Erik', 'Spoelstra', '1970-11-01', 9000000.0), -- MIA
('Jamahl', 'Mosley', '1978-10-06', 3500000.0), -- ORL
('Brian', 'Keefe', '1976-01-01', 3000000.0), -- WAS
('Michael', 'Malone', '1971-09-15', 5000000.0), -- DEN
('Chris', 'Finch', '1969-11-06', 4000000.0), -- MIN
('Mark', 'Daigneault', '1985-02-23', 3500000.0), -- OKC
('Chauncey', 'Billups', '1976-09-25', 3000000.0), -- POR
('Will', 'Hardy', '1988-01-21', 3000000.0), -- UTA
('Steve', 'Kerr', '1965-09-27', 9500000.0), -- GSW
('Tyronn', 'Lue', '1977-05-03', 6500000.0), -- LAC
('JJ', 'Redick', '1984-06-24', 5000000.0), -- LAL
('Mike', 'Budenholzer', '1969-08-06', 6000000.0), -- PHX
('Mike', 'Brown', '1970-03-05', 5000000.0), -- SAC
('Jason', 'Kidd', '1973-03-23', 5000000.0), -- DAL
('Ime', 'Udoka', '1977-08-09', 6000000.0), -- HOU
('Taylor', 'Jenkins', '1984-09-12', 4000000.0), -- MEM
('Willie', 'Green', '1981-07-28', 3500000.0), -- NOP
('Gregg', 'Popovich', '1949-01-28', 12000000.0); -- SAS

-- ==========================================
-- EQUIPOS
-- ==========================================
-- ACB (Liga ID 1)
INSERT INTO Equipo (Nombre, Fundación, Ciudad, Presupuesto, entrenador_id, estadio_id, liga_id) VALUES 
('Real Madrid', '1931-03-08', 'Madrid', 45000000.0, 1, 1, 1),
('FC Barcelona', '1926-08-24', 'Barcelona', 42000000.0, 2, 2, 1),
('Baskonia', '1959-12-01', 'Vitoria', 16000000.0, 3, 3, 1),
('Unicaja', '1977-08-29', 'Málaga', 14000000.0, 4, 4, 1),
('Valencia Basket', '1986-09-27', 'Valencia', 20000000.0, 5, 5, 1),
('Lenovo Tenerife', '1939-01-01', 'Tenerife', 9000000.0, 6, 6, 1),
('Dreamland Gran Canaria', '1963-01-01', 'Las Palmas', 10000000.0, 7, 7, 1),
('UCAM Murcia', '1985-01-01', 'Murcia', 8000000.0, 8, 8, 1),
('Joventut Badalona', '1930-03-30', 'Badalona', 9500000.0, 9, 9, 1),
('BAXI Manresa', '1931-01-01', 'Manresa', 5000000.0, 10, 10, 1),
('MoraBanc Andorra', '1970-01-01', 'Andorra', 6000000.0, 11, 11, 1),
('Surne Bilbao Basket', '2000-01-01', 'Bilbao', 5500000.0, 12, 12, 1),
('Casademont Zaragoza', '2002-01-01', 'Zaragoza', 6500000.0, 13, 13, 1),
('Bàsquet Girona', '2014-01-01', 'Girona', 4500000.0, 14, 14, 1),
('Río Breogán', '1966-01-01', 'Lugo', 4000000.0, 15, 15, 1),
('Covirán Granada', '2012-01-01', 'Granada', 3800000.0, 16, 16, 1),
('Leyma Coruña', '1996-01-01', 'A Coruña', 4200000.0, 17, 17, 1),
('Hiopos Lleida', '2012-01-01', 'Lleida', 3500000.0, 18, 18, 1);

-- NBA (Liga ID 2) - IDs de Entrenador 19-48, Estadios 19-48
INSERT INTO Equipo (Nombre, Fundación, Ciudad, Presupuesto, entrenador_id, estadio_id, liga_id) VALUES 
('Boston Celtics', '1946-06-06', 'Boston', 180000000.0, 19, 19, 2),
('Brooklyn Nets', '1967-01-01', 'Brooklyn', 160000000.0, 20, 20, 2),
('New York Knicks', '1946-01-01', 'New York', 190000000.0, 21, 21, 2),
('Philadelphia 76ers', '1946-01-01', 'Philadelphia', 175000000.0, 22, 22, 2),
('Toronto Raptors', '1995-01-01', 'Toronto', 165000000.0, 23, 23, 2),
('Chicago Bulls', '1966-01-01', 'Chicago', 155000000.0, 24, 24, 2),
('Cleveland Cavaliers', '1970-01-01', 'Cleveland', 160000000.0, 25, 25, 2),
('Detroit Pistons', '1941-01-01', 'Detroit', 140000000.0, 26, 26, 2),
('Indiana Pacers', '1967-01-01', 'Indiana', 145000000.0, 27, 27, 2),
('Milwaukee Bucks', '1968-01-01', 'Milwaukee', 185000000.0, 28, 28, 2),
('Atlanta Hawks', '1946-01-01', 'Atlanta', 150000000.0, 29, 29, 2),
('Charlotte Hornets', '1988-01-01', 'Charlotte', 135000000.0, 30, 30, 2),
('Miami Heat', '1988-01-01', 'Miami', 170000000.0, 31, 31, 2),
('Orlando Magic', '1989-01-01', 'Orlando', 140000000.0, 32, 32, 2),
('Washington Wizards', '1961-01-01', 'Washington', 145000000.0, 33, 33, 2),
('Denver Nuggets', '1967-01-01', 'Denver', 175000000.0, 34, 34, 2),
('Minnesota Timberwolves', '1989-01-01', 'Minnesota', 160000000.0, 35, 35, 2),
('Oklahoma City Thunder', '1967-01-01', 'Oklahoma City', 150000000.0, 36, 36, 2),
('Portland Trail Blazers', '1970-01-01', 'Portland', 145000000.0, 37, 37, 2),
('Utah Jazz', '1974-01-01', 'Salt Lake City', 140000000.0, 38, 38, 2),
('Golden State Warriors', '1946-01-01', 'San Francisco', 200000000.0, 39, 39, 2),
('Los Angeles Clippers', '1970-01-01', 'Los Angeles', 195000000.0, 40, 40, 2),
('Los Angeles Lakers', '1947-01-01', 'Los Angeles', 190000000.0, 41, 41, 2),
('Phoenix Suns', '1968-01-01', 'Phoenix', 185000000.0, 42, 42, 2),
('Sacramento Kings', '1923-01-01', 'Sacramento', 155000000.0, 43, 43, 2),
('Dallas Mavericks', '1980-01-01', 'Dallas', 170000000.0, 44, 44, 2),
('Houston Rockets', '1967-01-01', 'Houston', 150000000.0, 45, 45, 2),
('Memphis Grizzlies', '1995-01-01', 'Memphis', 145000000.0, 46, 46, 2),
('New Orleans Pelicans', '2002-01-01', 'New Orleans', 150000000.0, 47, 47, 2),
('San Antonio Spurs', '1967-01-01', 'San Antonio', 140000000.0, 48, 48, 2);

-- ==========================================
-- JUGADORES (5 por equipo)
-- ==========================================

-- 1. Real Madrid
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Facundo', 'Campazzo', 33, 7, 'BASE', 1),
('Dzanan', 'Musa', 25, 31, 'ALERO', 1),
('Walter', 'Tavares', 32, 22, 'PIVOT', 1),
('Mario', 'Hezonja', 29, 11, 'ALERO', 1),
('Gabriel', 'Deck', 29, 14, 'ALAPIVOT', 1);

-- 2. FC Barcelona
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Tomas', 'Satoransky', 33, 13, 'BASE', 2),
('Kevin', 'Punter', 31, 0, 'ESCOLTA', 2),
('Jabari', 'Parker', 29, 22, 'ALAPIVOT', 2),
('Willy', 'Hernangomez', 30, 14, 'PIVOT', 2),
('Alex', 'Abrines', 31, 21, 'ALERO', 2);

-- 3. Baskonia
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Markus', 'Howard', 25, 0, 'ESCOLTA', 3),
('Chima', 'Moneke', 29, 95, 'ALAPIVOT', 3),
('Tadas', 'Sedekerskis', 26, 8, 'ALERO', 3),
('Codi', 'Miller-McIntyre', 30, 10, 'BASE', 3),
('Khalifa', 'Diop', 22, 18, 'PIVOT', 3);

-- 4. Unicaja
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Kendrick', 'Perry', 32, 55, 'BASE', 4),
('Dylan', 'Osetkowski', 28, 4, 'ALAPIVOT', 4),
('Tyson', 'Carter', 26, 11, 'ESCOLTA', 4),
('David', 'Kravish', 32, 45, 'PIVOT', 4),
('Alberto', 'Diaz', 30, 9, 'BASE', 4);

-- 5. Valencia Basket
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Chris', 'Jones', 31, 7, 'BASE', 5),
('Semi', 'Ojeleye', 30, 37, 'ALERO', 5),
('Brandon', 'Davies', 33, 0, 'PIVOT', 5),
('Xabi', 'Lopez-Arostegui', 27, 6, 'ALERO', 5),
('Jaime', 'Pradilla', 23, 4, 'ALAPIVOT', 5);

-- 6. Lenovo Tenerife
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Marcelinho', 'Huertas', 41, 9, 'BASE', 6),
('Giorgi', 'Shermadini', 35, 19, 'PIVOT', 6),
('Bruno', 'Fitipaldo', 33, 6, 'BASE', 6),
('Aaron', 'Doornekamp', 39, 42, 'ALAPIVOT', 6),
('Joan', 'Sastre', 33, 15, 'ALERO', 6);

-- 7. Dreamland Gran Canaria
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Andrew', 'Albicy', 34, 6, 'BASE', 7),
('Nico', 'Brussino', 31, 9, 'ALERO', 7),
('John', 'Shurna', 34, 14, 'ALAPIVOT', 7),
('Ethan', 'Happ', 28, 22, 'PIVOT', 7),
('AJ', 'Slaughter', 37, 8, 'ESCOLTA', 7);

-- 8. UCAM Murcia
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Dylan', 'Ennis', 33, 31, 'ESCOLTA', 8),
('Simon', 'Birgander', 27, 22, 'PIVOT', 8),
('Ludvig', 'Hakanson', 28, 11, 'BASE', 8),
('Rodions', 'Kurucs', 26, 0, 'ALERO', 8),
('Nemanja', 'Radovic', 33, 14, 'ALAPIVOT', 8);

-- 9. Joventut Badalona
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Ante', 'Tomic', 37, 44, 'PIVOT', 9),
('Andres', 'Feliz', 27, 10, 'BASE', 9),
('Pau', 'Ribas', 37, 4, 'ESCOLTA', 9),
('Guillem', 'Vives', 31, 16, 'BASE', 9),
('Vladimir', 'Brodziansky', 30, 12, 'ALAPIVOT', 9);

-- 10. BAXI Manresa
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Devin', 'Robinson', 29, 0, 'ALAPIVOT', 10),
('Dani', 'Perez', 34, 55, 'BASE', 10),
('Brancou', 'Badio', 25, 2, 'ESCOLTA', 10),
('Marcis', 'Steinbergs', 23, 12, 'ALAPIVOT', 10),
('Musa', 'Sagnia', 21, 8, 'ALERO', 10);

-- 11. MoraBanc Andorra
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Jerrick', 'Harding', 26, 4, 'ESCOLTA', 11),
('Jean', 'Montero', 21, 3, 'BASE', 11),
('Tyson', 'Perez', 28, 11, 'ALAPIVOT', 11),
('Marin', 'Maric', 30, 9, 'PIVOT', 11),
('Stan', 'Okoye', 33, 20, 'ALERO', 11);

-- 12. Surne Bilbao Basket
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Adam', 'Smith', 32, 4, 'ESCOLTA', 12),
('Sacha', 'Killeya-Jones', 26, 23, 'PIVOT', 12),
('Alex', 'Renfroe', 38, 32, 'BASE', 12),
('Melwin', 'Pantzar', 24, 6, 'BASE', 12),
('Xavi', 'Rabaseda', 35, 22, 'ALERO', 12);

-- 13. Casademont Zaragoza
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Trae', 'Bell-Haynes', 29, 0, 'BASE', 13),
('Santi', 'Yusta', 27, 4, 'ALERO', 13),
('Mitchell', 'Watt', 35, 2, 'PIVOT', 13),
('Mark', 'Smith', 25, 11, 'ESCOLTA', 13),
('Emir', 'Sulejmanovic', 29, 19, 'ALAPIVOT', 13);

-- 14. Bàsquet Girona
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Ike', 'Iroegbu', 29, 1, 'BASE', 14),
('Juani', 'Marcos', 24, 5, 'BASE', 14),
('Yves', 'Pons', 25, 2, 'ALERO', 14),
('Sergi', 'Martinez', 25, 23, 'ALERO', 14),
('Gyorgy', 'Goloman', 28, 14, 'PIVOT', 14);

-- 15. Río Breogán
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Sergi', 'Garcia', 27, 4, 'BASE', 15),
('Stefan', 'Momirov', 25, 11, 'ESCOLTA', 15),
('Toni', 'Nakic', 25, 99, 'ALERO', 15),
('Martynas', 'Sajus', 28, 21, 'PIVOT', 15),
('Juan', 'Fernandez', 22, 13, 'ALAPIVOT', 15);

-- 16. Covirán Granada
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Lluis', 'Costa', 31, 15, 'BASE', 16),
('Cristiano', 'Felicio', 32, 6, 'PIVOT', 16),
('Kwan', 'Cheatham', 29, 3, 'ALAPIVOT', 16),
('David', 'Kramer', 27, 44, 'ESCOLTA', 16),
('Pere', 'Tomas', 35, 19, 'ALERO', 16);

-- 17. Leyma Coruña
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Yunio', 'Barrueta', 31, 1, 'ALERO', 17),
('Goran', 'Huskic', 32, 23, 'PIVOT', 17),
('Ingus', 'Jakovics', 31, 3, 'BASE', 17),
('Aleix', 'Font', 26, 5, 'ESCOLTA', 17),
('Beka', 'Burjanadze', 30, 7, 'ALAPIVOT', 17);

-- 18. Hiopos Lleida
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Kenny', 'Hasbrouck', 38, 4, 'ESCOLTA', 18),
('Kur', 'Kuath', 26, 35, 'PIVOT', 18),
('Rafa', 'Villar', 20, 9, 'BASE', 18),
('Cameron', 'Krutwig', 26, 15, 'PIVOT', 18),
('Ignacio', 'Rosa', 25, 12, 'ALAPIVOT', 18);

-- NBA
-- 19. Boston Celtics
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Jayson', 'Tatum', 26, 0, 'ALERO', 19),
('Jaylen', 'Brown', 27, 7, 'ESCOLTA', 19),
('Jrue', 'Holiday', 34, 4, 'BASE', 19),
('Derrick', 'White', 30, 9, 'ESCOLTA', 19),
('Kristaps', 'Porzingis', 29, 8, 'PIVOT', 19);

-- 20. Brooklyn Nets
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Mikal', 'Bridges', 28, 1, 'ALERO', 20),
('Cam', 'Thomas', 23, 24, 'ESCOLTA', 20),
('Nic', 'Claxton', 25, 33, 'PIVOT', 20),
('Ben', 'Simmons', 28, 10, 'BASE', 20),
('Cameron', 'Johnson', 28, 2, 'ALERO', 20);

-- 21. New York Knicks
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Jalen', 'Brunson', 28, 11, 'BASE', 21),
('Julius', 'Randle', 30, 30, 'ALAPIVOT', 21),
('OG', 'Anunoby', 27, 8, 'ALERO', 21),
('Josh', 'Hart', 29, 3, 'ESCOLTA', 21),
('Mitchell', 'Robinson', 26, 23, 'PIVOT', 21);

-- 22. Philadelphia 76ers
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Joel', 'Embiid', 30, 21, 'PIVOT', 22),
('Tyrese', 'Maxey', 24, 0, 'BASE', 22),
('Tobias', 'Harris', 32, 12, 'ALAPIVOT', 22),
('Kelly', 'Oubre', 29, 9, 'ALERO', 22),
('Paul', 'Reed', 25, 44, 'PIVOT', 22);

-- 23. Toronto Raptors
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Scottie', 'Barnes', 23, 4, 'ALERO', 23),
('RJ', 'Barrett', 24, 9, 'ESCOLTA', 23),
('Immanuel', 'Quickley', 25, 5, 'BASE', 23),
('Jakob', 'Poeltl', 29, 19, 'PIVOT', 23),
('Gradey', 'Dick', 21, 1, 'ESCOLTA', 23);

-- 24. Chicago Bulls
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('DeMar', 'DeRozan', 35, 11, 'ALERO', 24),
('Zach', 'LaVine', 29, 8, 'ESCOLTA', 24),
('Nikola', 'Vucevic', 34, 9, 'PIVOT', 24),
('Coby', 'White', 24, 0, 'BASE', 24),
('Alex', 'Caruso', 30, 6, 'ESCOLTA', 24);

-- 25. Cleveland Cavaliers
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Donovan', 'Mitchell', 28, 45, 'ESCOLTA', 25),
('Darius', 'Garland', 25, 10, 'BASE', 25),
('Evan', 'Mobley', 23, 4, 'ALAPIVOT', 25),
('Jarrett', 'Allen', 26, 31, 'PIVOT', 25),
('Max', 'Strus', 28, 1, 'ALERO', 25);

-- 26. Detroit Pistons
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Cade', 'Cunningham', 23, 2, 'BASE', 26),
('Jaden', 'Ivey', 22, 23, 'ESCOLTA', 26),
('Jalen', 'Duren', 21, 0, 'PIVOT', 26),
('Ausar', 'Thompson', 21, 9, 'ALERO', 26),
('Isaiah', 'Stewart', 23, 28, 'PIVOT', 26);

-- 27. Indiana Pacers
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Tyrese', 'Haliburton', 24, 0, 'BASE', 27),
('Pascal', 'Siakam', 30, 43, 'ALAPIVOT', 27),
('Myles', 'Turner', 28, 33, 'PIVOT', 27),
('Bennedict', 'Mathurin', 22, 0, 'ESCOLTA', 27),
('Aaron', 'Nesmith', 25, 23, 'ALERO', 27);

-- 28. Milwaukee Bucks
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Giannis', 'Antetokounmpo', 30, 34, 'ALAPIVOT', 28),
('Damian', 'Lillard', 34, 0, 'BASE', 28),
('Khris', 'Middleton', 33, 22, 'ALERO', 28),
('Brook', 'Lopez', 36, 11, 'PIVOT', 28),
('Bobby', 'Portis', 29, 9, 'ALAPIVOT', 28);

-- 29. Atlanta Hawks
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Trae', 'Young', 26, 11, 'BASE', 29),
('Dejounte', 'Murray', 28, 5, 'ESCOLTA', 29),
('Jalen', 'Johnson', 23, 1, 'ALAPIVOT', 29),
('Clint', 'Capela', 30, 15, 'PIVOT', 29),
('Bogdan', 'Bogdanovic', 32, 13, 'ESCOLTA', 29);

-- 30. Charlotte Hornets
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('LaMelo', 'Ball', 23, 1, 'BASE', 30),
('Brandon', 'Miller', 22, 24, 'ALERO', 30),
('Miles', 'Bridges', 26, 0, 'ALAPIVOT', 30),
('Mark', 'Williams', 23, 5, 'PIVOT', 30),
('Grant', 'Williams', 26, 2, 'ALAPIVOT', 30);

-- 31. Miami Heat
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Jimmy', 'Butler', 35, 22, 'ALERO', 31),
('Bam', 'Adebayo', 27, 13, 'PIVOT', 31),
('Tyler', 'Herro', 25, 14, 'ESCOLTA', 31),
('Terry', 'Rozier', 30, 2, 'BASE', 31),
('Jaime', 'Jaquez', 23, 11, 'ALERO', 31);

-- 32. Orlando Magic
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Paolo', 'Banchero', 22, 5, 'ALAPIVOT', 32),
('Franz', 'Wagner', 23, 22, 'ALERO', 32),
('Jalen', 'Suggs', 23, 4, 'ESCOLTA', 32),
('Wendell', 'Carter', 25, 34, 'PIVOT', 32),
('Cole', 'Anthony', 24, 50, 'BASE', 32);

-- 33. Washington Wizards
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Kyle', 'Kuzma', 29, 33, 'ALAPIVOT', 33),
('Jordan', 'Poole', 25, 13, 'ESCOLTA', 33),
('Deni', 'Avdija', 24, 8, 'ALERO', 33),
('Tyus', 'Jones', 28, 5, 'BASE', 33),
('Bilal', 'Coulibaly', 20, 0, 'ALERO', 33);

-- 34. Denver Nuggets
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Nikola', 'Jokic', 30, 15, 'PIVOT', 34),
('Jamal', 'Murray', 27, 27, 'BASE', 34),
('Michael', 'Porter', 26, 1, 'ALERO', 34),
('Aaron', 'Gordon', 29, 50, 'ALAPIVOT', 34),
('Kentavious', 'Caldwell-Pope', 31, 5, 'ESCOLTA', 34);

-- 35. Minnesota Timberwolves
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Anthony', 'Edwards', 23, 5, 'ESCOLTA', 35),
('Karl-Anthony', 'Towns', 29, 32, 'ALAPIVOT', 35),
('Rudy', 'Gobert', 32, 27, 'PIVOT', 35),
('Mike', 'Conley', 37, 10, 'BASE', 35),
('Jaden', 'McDaniels', 24, 3, 'ALERO', 35);

-- 36. Oklahoma City Thunder
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Shai', 'Gilgeous-Alexander', 26, 2, 'BASE', 36),
('Chet', 'Holmgren', 22, 7, 'PIVOT', 36),
('Jalen', 'Williams', 23, 8, 'ALERO', 36),
('Josh', 'Giddey', 22, 3, 'BASE', 36),
('Luguentz', 'Dort', 25, 5, 'ESCOLTA', 36);

-- 37. Portland Trail Blazers
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Anfernee', 'Simons', 25, 1, 'ESCOLTA', 37),
('Jerami', 'Grant', 30, 9, 'ALAPIVOT', 37),
('Deandre', 'Ayton', 26, 2, 'PIVOT', 37),
('Scoot', 'Henderson', 20, 0, 'BASE', 37),
('Shaedon', 'Sharpe', 21, 17, 'ESCOLTA', 37);

-- 38. Utah Jazz
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Lauri', 'Markkanen', 27, 23, 'ALAPIVOT', 38),
('Collin', 'Sexton', 26, 2, 'ESCOLTA', 38),
('Jordan', 'Clarkson', 32, 0, 'ESCOLTA', 38),
('John', 'Collins', 27, 20, 'ALAPIVOT', 38),
('Walker', 'Kessler', 23, 24, 'PIVOT', 38);

-- 39. Golden State Warriors
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Stephen', 'Curry', 36, 30, 'BASE', 39),
('Klay', 'Thompson', 35, 11, 'ESCOLTA', 39),
('Draymond', 'Green', 35, 23, 'ALAPIVOT', 39),
('Andrew', 'Wiggins', 30, 22, 'ALERO', 39),
('Jonathan', 'Kuminga', 22, 0, 'ALERO', 39);

-- 40. Los Angeles Clippers
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Kawhi', 'Leonard', 33, 2, 'ALERO', 40),
('Paul', 'George', 34, 13, 'ALERO', 40),
('James', 'Harden', 35, 1, 'BASE', 40),
('Russell', 'Westbrook', 36, 0, 'BASE', 40),
('Ivica', 'Zubac', 27, 40, 'PIVOT', 40);

-- 41. Los Angeles Lakers
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('LeBron', 'James', 40, 23, 'ALERO', 41),
('Anthony', 'Davis', 32, 3, 'PIVOT', 41),
('Austin', 'Reaves', 26, 15, 'ESCOLTA', 41),
('D''Angelo', 'Russell', 29, 1, 'BASE', 41),
('Rui', 'Hachimura', 27, 28, 'ALAPIVOT', 41);

-- 42. Phoenix Suns
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Kevin', 'Durant', 36, 35, 'ALAPIVOT', 42),
('Devin', 'Booker', 28, 1, 'ESCOLTA', 42),
('Bradley', 'Beal', 31, 3, 'ESCOLTA', 42),
('Jusuf', 'Nurkic', 30, 20, 'PIVOT', 42),
('Grayson', 'Allen', 29, 8, 'ESCOLTA', 42);

-- 43. Sacramento Kings
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('De''Aaron', 'Fox', 27, 5, 'BASE', 43),
('Domantas', 'Sabonis', 28, 10, 'PIVOT', 43),
('Keegan', 'Murray', 24, 13, 'ALERO', 43),
('Malik', 'Monk', 27, 0, 'ESCOLTA', 43),
('Harrison', 'Barnes', 32, 40, 'ALERO', 43);

-- 44. Dallas Mavericks
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Luka', 'Doncic', 26, 77, 'BASE', 44),
('Kyrie', 'Irving', 32, 11, 'ESCOLTA', 44),
('P.J.', 'Washington', 26, 25, 'ALAPIVOT', 44),
('Daniel', 'Gafford', 26, 21, 'PIVOT', 44),
('Dereck', 'Lively', 21, 2, 'PIVOT', 44);

-- 45. Houston Rockets
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Alperen', 'Sengun', 22, 28, 'PIVOT', 45),
('Jalen', 'Green', 23, 4, 'ESCOLTA', 45),
('Fred', 'VanVleet', 31, 5, 'BASE', 45),
('Jabari', 'Smith', 21, 10, 'ALAPIVOT', 45),
('Dillon', 'Brooks', 29, 9, 'ALERO', 45);

-- 46. Memphis Grizzlies
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Ja', 'Morant', 25, 12, 'BASE', 46),
('Jaren', 'Jackson', 25, 13, 'PIVOT', 46),
('Desmond', 'Bane', 26, 22, 'ESCOLTA', 46),
('Marcus', 'Smart', 31, 36, 'BASE', 46),
('GG', 'Jackson', 20, 45, 'ALERO', 46);

-- 47. New Orleans Pelicans
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Zion', 'Williamson', 24, 1, 'ALAPIVOT', 47),
('Brandon', 'Ingram', 27, 14, 'ALERO', 47),
('CJ', 'McCollum', 33, 3, 'ESCOLTA', 47),
('Herb', 'Jones', 26, 5, 'ALERO', 47),
('Jonas', 'Valanciunas', 32, 17, 'PIVOT', 47);

-- 48. San Antonio Spurs
INSERT INTO Jugador (Nombre, Apellido, Edad, Dorsal, Posicion, equipo_id) VALUES 
('Victor', 'Wembanyama', 21, 1, 'PIVOT', 48),
('Devin', 'Vassell', 24, 24, 'ESCOLTA', 48),
('Jeremy', 'Sochan', 21, 10, 'ALAPIVOT', 48),
('Keldon', 'Johnson', 25, 3, 'ALERO', 48),
('Tre', 'Jones', 25, 33, 'BASE', 48);

-- ==========================================
-- PARTIDOS (Temporada 25/26)
-- ==========================================
-- Madrid vs Barça
INSERT INTO Partidos (FechaPartido, equipo_local_id, equipo_visitante_id, estadio_id) VALUES 
('2025-10-05', 1, 2, 1),
('2026-03-15', 2, 1, 2);

-- Lakers vs Warriors
INSERT INTO Partidos (FechaPartido, equipo_local_id, equipo_visitante_id, estadio_id) VALUES 
('2025-12-25', 41, 39, 41);

-- ==========================================
-- ESTADISTICAS (Partido Madrid vs Barça ID 1)
-- ==========================================
-- Campazzo
INSERT INTO EstadisticasJugador (jugador_id, partido_id, Puntos, Asistencias, Rebotes, Minutos) VALUES 
(1, 1, 20, 12, 3, 30);
-- Tavares
INSERT INTO EstadisticasJugador (jugador_id, partido_id, Puntos, Asistencias, Rebotes, Minutos) VALUES 
(3, 1, 14, 2, 11, 28);

-- ==========================================
-- FICHAJES (Temporada 25/26)
-- ==========================================
-- 1. Facundo Campazzo (Real Madrid) - Renovación
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(1, 1, 2500000.00, 'EUR', '2025/2026', 'TRASPASO', '2025-07-01', '2028-06-30');

-- 2. LeBron James (Lakers) - Extension
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(201, 41, 50000000.00, 'USD', '2025/2026', 'TRASPASO', '2025-10-01', '2026-06-30');

-- 3. Markus Howard (Baskonia)
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(11, 3, 1500000.00, 'EUR', '2025/2026', 'TRASPASO', '2025-07-01', '2026-06-30');

-- 4. Kevin Punter (Barça)
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(7, 2, 2000000.00, 'EUR', '2025/2026', 'TRASPASO', '2025-07-01', '2026-06-30');

-- 5. Jayson Tatum (Celtics) - Supermax
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(91, 19, 60000000.00, 'USD', '2025/2026', 'TRASPASO', '2025-10-01', '2030-06-30');

-- 6. Luka Doncic (Mavericks)
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(216, 44, 55000000.00, 'USD', '2025/2026', 'TRASPASO', '2025-10-01', '2029-06-30');

-- 7. Nikola Jokic (Nuggets)
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(166, 34, 58000000.00, 'USD', '2025/2026', 'TRASPASO', '2025-10-01', '2028-06-30');

-- 8. Stephen Curry (Warriors)
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(191, 39, 62000000.00, 'USD', '2025/2026', 'TRASPASO', '2025-10-01', '2027-06-30');

-- 9. Victor Wembanyama (Spurs) - Rookie
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(236, 48, 12000000.00, 'USD', '2025/2026', 'TRASPASO', '2025-10-01', '2027-06-30');

-- 10. Rafa Villar (Hiopos Lleida) - Cesión
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(88, 18, 100000.00, 'EUR', '2025/2026', 'CESION', '2025-07-01', '2026-06-30');

-- 11. Mario Hezonja (Real Madrid) - Libre
INSERT INTO Fichajes (jugador_id, equipo_id, Cantidad, Moneda, Temporada, TipoContrato, fecha_inicio, fecha_fin) VALUES 
(4, 1, 2200000.00, 'EUR', '2025/2026', 'LIBRE', '2025-07-01', '2029-06-30');
