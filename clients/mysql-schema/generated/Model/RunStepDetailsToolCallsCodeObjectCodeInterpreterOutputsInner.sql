--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner`
--
SELECT `type`, `logs`, `image` FROM `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner`
--
INSERT INTO `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner`(`type`, `logs`, `image`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner`
--
UPDATE `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` SET `type` = ?, `logs` = ?, `image` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner`
--
DELETE FROM `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner` WHERE 0;

