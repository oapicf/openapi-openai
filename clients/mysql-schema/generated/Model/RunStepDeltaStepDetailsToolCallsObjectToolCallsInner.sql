--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner`
--
SELECT `index`, `id`, `type`, `code_interpreter`, `retrieval`, `function` FROM `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner`
--
INSERT INTO `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner`(`index`, `id`, `type`, `code_interpreter`, `retrieval`, `function`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner`
--
UPDATE `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner` SET `index` = ?, `id` = ?, `type` = ?, `code_interpreter` = ?, `retrieval` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner`
--
DELETE FROM `RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner` WHERE 0;

