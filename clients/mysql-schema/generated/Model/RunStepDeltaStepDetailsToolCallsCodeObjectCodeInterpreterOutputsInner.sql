--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp`
--
SELECT `index`, `type`, `logs`, `image` FROM `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp`
--
INSERT INTO `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp`(`index`, `type`, `logs`, `image`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp`
--
UPDATE `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp` SET `index` = ?, `type` = ?, `logs` = ?, `image` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp`
--
DELETE FROM `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outp` WHERE 0;

