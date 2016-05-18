SELECT distinct CITY FROM STATION WHERE NOT regexp_like(CITY, '[aeiouAEIOU]$') ORDER BY CITY asc;
