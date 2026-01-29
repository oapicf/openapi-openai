--
-- OpenAI API.
-- Prepared SQL queries for 'ListAssistantFilesResponse' definition.
--


--
-- SELECT template for table `ListAssistantFilesResponse`
--
SELECT `object`, `data`, `first_id`, `last_id`, `has_more` FROM `ListAssistantFilesResponse` WHERE 1;

--
-- INSERT template for table `ListAssistantFilesResponse`
--
INSERT INTO `ListAssistantFilesResponse`(`object`, `data`, `first_id`, `last_id`, `has_more`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ListAssistantFilesResponse`
--
UPDATE `ListAssistantFilesResponse` SET `object` = ?, `data` = ?, `first_id` = ?, `last_id` = ?, `has_more` = ? WHERE 1;

--
-- DELETE template for table `ListAssistantFilesResponse`
--
DELETE FROM `ListAssistantFilesResponse` WHERE 0;

