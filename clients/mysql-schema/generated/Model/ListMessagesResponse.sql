--
-- OpenAI API.
-- Prepared SQL queries for 'ListMessagesResponse' definition.
--


--
-- SELECT template for table `ListMessagesResponse`
--
SELECT `object`, `data`, `first_id`, `last_id`, `has_more` FROM `ListMessagesResponse` WHERE 1;

--
-- INSERT template for table `ListMessagesResponse`
--
INSERT INTO `ListMessagesResponse`(`object`, `data`, `first_id`, `last_id`, `has_more`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ListMessagesResponse`
--
UPDATE `ListMessagesResponse` SET `object` = ?, `data` = ?, `first_id` = ?, `last_id` = ?, `has_more` = ? WHERE 1;

--
-- DELETE template for table `ListMessagesResponse`
--
DELETE FROM `ListMessagesResponse` WHERE 0;

