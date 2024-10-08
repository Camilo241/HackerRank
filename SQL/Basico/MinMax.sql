SELECT TOP 1 city, LEN(city) 
FROM station
WHERE LEN(city) = (SELECT MIN(LEN(city)) FROM station)
ORDER BY city;