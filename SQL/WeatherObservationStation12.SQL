SELECT distinct CITY FROM STATION WHERE NOT regexp_like(CITY, '^aeiouAEIOU]') AND NOT regexp_like(CITY, '[aeiouAEIOU]$') ORDER BY CITY asc;
