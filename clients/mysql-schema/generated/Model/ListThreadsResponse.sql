--
-- OpenAI API.
-- Prepared SQL queries for 'ListThreadsResponse' definition.
--


--
-- SELECT template for table `ListThreadsResponse`
--
SELECT `object`, `data`, `first_id`, `last_id`, `has_more` FROM `ListThreadsResponse` WHERE 1;

--
-- INSERT template for table `ListThreadsResponse`
--
INSERT INTO `ListThreadsResponse`(`object`, `data`, `first_id`, `last_id`, `has_more`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ListThreadsResponse`
--
UPDATE `ListThreadsResponse` SET `object` = ?, `data` = ?, `first_id` = ?, `last_id` = ?, `has_more` = ? WHERE 1;

--
-- DELETE template for table `ListThreadsResponse`
--
DELETE FROM `ListThreadsResponse` WHERE 0;

