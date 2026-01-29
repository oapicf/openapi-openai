--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsRetrievalObject' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsRetrievalObject`
--
SELECT `id`, `type`, `retrieval` FROM `RunStepDetailsToolCallsRetrievalObject` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsRetrievalObject`
--
INSERT INTO `RunStepDetailsToolCallsRetrievalObject`(`id`, `type`, `retrieval`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsRetrievalObject`
--
UPDATE `RunStepDetailsToolCallsRetrievalObject` SET `id` = ?, `type` = ?, `retrieval` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsRetrievalObject`
--
DELETE FROM `RunStepDetailsToolCallsRetrievalObject` WHERE 0;

