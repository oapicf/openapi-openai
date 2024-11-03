--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsCodeOutputLogsObject' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsCodeOutputLogsObject`
--
SELECT `type`, `logs` FROM `RunStepDetailsToolCallsCodeOutputLogsObject` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsCodeOutputLogsObject`
--
INSERT INTO `RunStepDetailsToolCallsCodeOutputLogsObject`(`type`, `logs`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsCodeOutputLogsObject`
--
UPDATE `RunStepDetailsToolCallsCodeOutputLogsObject` SET `type` = ?, `logs` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsCodeOutputLogsObject`
--
DELETE FROM `RunStepDetailsToolCallsCodeOutputLogsObject` WHERE 0;

