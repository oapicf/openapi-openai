--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsToolCallsObject' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsToolCallsObject`
--
SELECT `type`, `tool_calls` FROM `RunStepDeltaStepDetailsToolCallsObject` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsToolCallsObject`
--
INSERT INTO `RunStepDeltaStepDetailsToolCallsObject`(`type`, `tool_calls`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsToolCallsObject`
--
UPDATE `RunStepDeltaStepDetailsToolCallsObject` SET `type` = ?, `tool_calls` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsToolCallsObject`
--
DELETE FROM `RunStepDeltaStepDetailsToolCallsObject` WHERE 0;

