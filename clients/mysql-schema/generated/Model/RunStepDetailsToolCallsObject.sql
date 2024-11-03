--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsObject' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsObject`
--
SELECT `type`, `tool_calls` FROM `RunStepDetailsToolCallsObject` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsObject`
--
INSERT INTO `RunStepDetailsToolCallsObject`(`type`, `tool_calls`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsObject`
--
UPDATE `RunStepDetailsToolCallsObject` SET `type` = ?, `tool_calls` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsObject`
--
DELETE FROM `RunStepDetailsToolCallsObject` WHERE 0;

