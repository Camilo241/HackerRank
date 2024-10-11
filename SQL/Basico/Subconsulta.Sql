SELECT 
    CAST(ROUND(Long_W, 4) AS DECIMAL(10, 4)) AS lat
FROM Station
    where LAT_N = (select max(LAT_N) from STATION where LAT_N<137.2345);