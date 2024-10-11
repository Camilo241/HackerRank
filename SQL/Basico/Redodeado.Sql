SELECT CAST(AVG(POPULATION) AS INT) 
FROM CITY;
-- as int que lo pasa a int 

SELECT ROUND(AVG(POPULATION), 0) 
FROM CITY;

-- Round que lo redondea y los decimales los manda a 0

SELECT 
    CAST(ROUND(SUM(Lat_N), 2) AS DECIMAL(10, 2)) AS lat, 
    CAST(ROUND(SUM(Long_W), 2) AS DECIMAL(10, 2)) AS lon 
FROM Station;

--Cast para darle formato con 10 int y 2 decimales 