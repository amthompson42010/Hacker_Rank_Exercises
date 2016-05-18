SELECT distinct CITY FROM STATION WHERE NOT regexp_like(CITY, '^[aeiouAEIOU].*[aeiouAEIOU]$') ORDER BY CITY asc;
