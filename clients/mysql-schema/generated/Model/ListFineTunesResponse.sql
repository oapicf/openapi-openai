--
-- OpenAI API.
-- Prepared SQL queries for 'ListFineTunesResponse' definition.
--


--
-- SELECT template for table `ListFineTunesResponse`
--
SELECT `object`, `data` FROM `ListFineTunesResponse` WHERE 1;

--
-- INSERT template for table `ListFineTunesResponse`
--
INSERT INTO `ListFineTunesResponse`(`object`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `ListFineTunesResponse`
--
UPDATE `ListFineTunesResponse` SET `object` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `ListFineTunesResponse`
--
DELETE FROM `ListFineTunesResponse` WHERE 0;

