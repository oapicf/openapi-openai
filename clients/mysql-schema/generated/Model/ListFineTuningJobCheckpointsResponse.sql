--
-- OpenAI API.
-- Prepared SQL queries for 'ListFineTuningJobCheckpointsResponse' definition.
--


--
-- SELECT template for table `ListFineTuningJobCheckpointsResponse`
--
SELECT `data`, `object`, `first_id`, `last_id`, `has_more` FROM `ListFineTuningJobCheckpointsResponse` WHERE 1;

--
-- INSERT template for table `ListFineTuningJobCheckpointsResponse`
--
INSERT INTO `ListFineTuningJobCheckpointsResponse`(`data`, `object`, `first_id`, `last_id`, `has_more`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ListFineTuningJobCheckpointsResponse`
--
UPDATE `ListFineTuningJobCheckpointsResponse` SET `data` = ?, `object` = ?, `first_id` = ?, `last_id` = ?, `has_more` = ? WHERE 1;

--
-- DELETE template for table `ListFineTuningJobCheckpointsResponse`
--
DELETE FROM `ListFineTuningJobCheckpointsResponse` WHERE 0;

