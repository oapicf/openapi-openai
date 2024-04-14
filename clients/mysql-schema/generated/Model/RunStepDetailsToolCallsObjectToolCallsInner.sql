--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsObject_tool_calls_inner' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsObject_tool_calls_inner`
--
SELECT `id`, `type`, `code_interpreter`, `retrieval`, `function` FROM `RunStepDetailsToolCallsObject_tool_calls_inner` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsObject_tool_calls_inner`
--
INSERT INTO `RunStepDetailsToolCallsObject_tool_calls_inner`(`id`, `type`, `code_interpreter`, `retrieval`, `function`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsObject_tool_calls_inner`
--
UPDATE `RunStepDetailsToolCallsObject_tool_calls_inner` SET `id` = ?, `type` = ?, `code_interpreter` = ?, `retrieval` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsObject_tool_calls_inner`
--
DELETE FROM `RunStepDetailsToolCallsObject_tool_calls_inner` WHERE 0;

