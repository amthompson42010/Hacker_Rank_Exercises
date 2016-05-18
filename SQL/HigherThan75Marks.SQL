SELECT name FROM
(
	SELECT name, substr(name, length(name) - 2) AS sub_name
	FROM Students
	WHERE marks > 75 ORDER BY sub_name, id asc
);
