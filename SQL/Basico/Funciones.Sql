SELECT
    format (
        SQRT(
            SQUARE ((Abs((MIN(LAT_N) - MAX(LAT_N))))) + SQUARE ((Abs((MIN(LONG_W) - MAX(LONG_W)))))
        ),
        '#####.####'
    )
FROM
    STATION;

-- fromat le da formato a la consulta
-- abs le saca el valor absoluto a la resta para que en caso de ser negativa la pasa a positiva
-- sqr le saca la raiz cuadrada 
-- square eleva al cuadrado el resultado de la diferencia entre las latitudes y entre las longitudes.