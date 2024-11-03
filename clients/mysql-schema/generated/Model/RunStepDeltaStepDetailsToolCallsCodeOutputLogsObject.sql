--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`
--
SELECT `index`, `type`, `logs` FROM `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`
--
INSERT INTO `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`(`index`, `type`, `logs`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`
--
UPDATE `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject` SET `index` = ?, `type` = ?, `logs` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`
--
DELETE FROM `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject` WHERE 0;

