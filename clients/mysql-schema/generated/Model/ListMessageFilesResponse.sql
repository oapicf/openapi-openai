--
-- OpenAI API.
-- Prepared SQL queries for 'ListMessageFilesResponse' definition.
--


--
-- SELECT template for table `ListMessageFilesResponse`
--
SELECT `object`, `data`, `first_id`, `last_id`, `has_more` FROM `ListMessageFilesResponse` WHERE 1;

--
-- INSERT template for table `ListMessageFilesResponse`
--
INSERT INTO `ListMessageFilesResponse`(`object`, `data`, `first_id`, `last_id`, `has_more`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ListMessageFilesResponse`
--
UPDATE `ListMessageFilesResponse` SET `object` = ?, `data` = ?, `first_id` = ?, `last_id` = ?, `has_more` = ? WHERE 1;

--
-- DELETE template for table `ListMessageFilesResponse`
--
DELETE FROM `ListMessageFilesResponse` WHERE 0;

