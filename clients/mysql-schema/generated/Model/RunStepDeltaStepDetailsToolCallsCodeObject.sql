--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsToolCallsCodeObject' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsToolCallsCodeObject`
--
SELECT `index`, `id`, `type`, `code_interpreter` FROM `RunStepDeltaStepDetailsToolCallsCodeObject` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsToolCallsCodeObject`
--
INSERT INTO `RunStepDeltaStepDetailsToolCallsCodeObject`(`index`, `id`, `type`, `code_interpreter`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsToolCallsCodeObject`
--
UPDATE `RunStepDeltaStepDetailsToolCallsCodeObject` SET `index` = ?, `id` = ?, `type` = ?, `code_interpreter` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsToolCallsCodeObject`
--
DELETE FROM `RunStepDeltaStepDetailsToolCallsCodeObject` WHERE 0;

