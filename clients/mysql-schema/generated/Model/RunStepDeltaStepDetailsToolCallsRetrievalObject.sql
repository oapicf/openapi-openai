--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsToolCallsRetrievalObject' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsToolCallsRetrievalObject`
--
SELECT `index`, `id`, `type`, `retrieval` FROM `RunStepDeltaStepDetailsToolCallsRetrievalObject` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsToolCallsRetrievalObject`
--
INSERT INTO `RunStepDeltaStepDetailsToolCallsRetrievalObject`(`index`, `id`, `type`, `retrieval`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsToolCallsRetrievalObject`
--
UPDATE `RunStepDeltaStepDetailsToolCallsRetrievalObject` SET `index` = ?, `id` = ?, `type` = ?, `retrieval` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsToolCallsRetrievalObject`
--
DELETE FROM `RunStepDeltaStepDetailsToolCallsRetrievalObject` WHERE 0;

