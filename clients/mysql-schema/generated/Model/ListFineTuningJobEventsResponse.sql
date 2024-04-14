--
-- OpenAI API.
-- Prepared SQL queries for 'ListFineTuningJobEventsResponse' definition.
--


--
-- SELECT template for table `ListFineTuningJobEventsResponse`
--
SELECT `data`, `object` FROM `ListFineTuningJobEventsResponse` WHERE 1;

--
-- INSERT template for table `ListFineTuningJobEventsResponse`
--
INSERT INTO `ListFineTuningJobEventsResponse`(`data`, `object`) VALUES (?, ?);

--
-- UPDATE template for table `ListFineTuningJobEventsResponse`
--
UPDATE `ListFineTuningJobEventsResponse` SET `data` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `ListFineTuningJobEventsResponse`
--
DELETE FROM `ListFineTuningJobEventsResponse` WHERE 0;

