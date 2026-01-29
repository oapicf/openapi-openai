--
-- OpenAI API.
-- Prepared SQL queries for 'ListRunsResponse' definition.
--


--
-- SELECT template for table `ListRunsResponse`
--
SELECT `object`, `data`, `first_id`, `last_id`, `has_more` FROM `ListRunsResponse` WHERE 1;

--
-- INSERT template for table `ListRunsResponse`
--
INSERT INTO `ListRunsResponse`(`object`, `data`, `first_id`, `last_id`, `has_more`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ListRunsResponse`
--
UPDATE `ListRunsResponse` SET `object` = ?, `data` = ?, `first_id` = ?, `last_id` = ?, `has_more` = ? WHERE 1;

--
-- DELETE template for table `ListRunsResponse`
--
DELETE FROM `ListRunsResponse` WHERE 0;

