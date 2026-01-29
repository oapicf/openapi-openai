--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepCompletionUsage' definition.
--


--
-- SELECT template for table `RunStepCompletionUsage`
--
SELECT `completion_tokens`, `prompt_tokens`, `total_tokens` FROM `RunStepCompletionUsage` WHERE 1;

--
-- INSERT template for table `RunStepCompletionUsage`
--
INSERT INTO `RunStepCompletionUsage`(`completion_tokens`, `prompt_tokens`, `total_tokens`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepCompletionUsage`
--
UPDATE `RunStepCompletionUsage` SET `completion_tokens` = ?, `prompt_tokens` = ?, `total_tokens` = ? WHERE 1;

--
-- DELETE template for table `RunStepCompletionUsage`
--
DELETE FROM `RunStepCompletionUsage` WHERE 0;

