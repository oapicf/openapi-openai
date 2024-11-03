--
-- OpenAI API.
-- Prepared SQL queries for 'ListAssistantsResponse' definition.
--


--
-- SELECT template for table `ListAssistantsResponse`
--
SELECT `object`, `data`, `first_id`, `last_id`, `has_more` FROM `ListAssistantsResponse` WHERE 1;

--
-- INSERT template for table `ListAssistantsResponse`
--
INSERT INTO `ListAssistantsResponse`(`object`, `data`, `first_id`, `last_id`, `has_more`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ListAssistantsResponse`
--
UPDATE `ListAssistantsResponse` SET `object` = ?, `data` = ?, `first_id` = ?, `last_id` = ?, `has_more` = ? WHERE 1;

--
-- DELETE template for table `ListAssistantsResponse`
--
DELETE FROM `ListAssistantsResponse` WHERE 0;

