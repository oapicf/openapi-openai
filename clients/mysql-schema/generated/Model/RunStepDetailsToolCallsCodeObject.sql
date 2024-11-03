--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsCodeObject' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsCodeObject`
--
SELECT `id`, `type`, `code_interpreter` FROM `RunStepDetailsToolCallsCodeObject` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsCodeObject`
--
INSERT INTO `RunStepDetailsToolCallsCodeObject`(`id`, `type`, `code_interpreter`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsCodeObject`
--
UPDATE `RunStepDetailsToolCallsCodeObject` SET `id` = ?, `type` = ?, `code_interpreter` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsCodeObject`
--
DELETE FROM `RunStepDetailsToolCallsCodeObject` WHERE 0;

