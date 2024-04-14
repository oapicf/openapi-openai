--
-- OpenAI API.
-- Prepared SQL queries for 'ListRunStepsResponse' definition.
--


--
-- SELECT template for table `ListRunStepsResponse`
--
SELECT `object`, `data`, `first_id`, `last_id`, `has_more` FROM `ListRunStepsResponse` WHERE 1;

--
-- INSERT template for table `ListRunStepsResponse`
--
INSERT INTO `ListRunStepsResponse`(`object`, `data`, `first_id`, `last_id`, `has_more`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ListRunStepsResponse`
--
UPDATE `ListRunStepsResponse` SET `object` = ?, `data` = ?, `first_id` = ?, `last_id` = ?, `has_more` = ? WHERE 1;

--
-- DELETE template for table `ListRunStepsResponse`
--
DELETE FROM `ListRunStepsResponse` WHERE 0;

