SELECT distinct CITY FROM STATION WHERE regexp_like (CITY, '^[aeiouAEIOU]') ORDER BY CITY asc;
