SELECT Name 
FROM Students 
WHERE Marks > 75
ORDER BY SUBSTRING(Name, LEN(Name) - 2, 3), ID;