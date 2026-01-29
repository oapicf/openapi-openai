--
-- OpenAI API.
-- Prepared SQL queries for 'RunCompletionUsage' definition.
--


--
-- SELECT template for table `RunCompletionUsage`
--
SELECT `completion_tokens`, `prompt_tokens`, `total_tokens` FROM `RunCompletionUsage` WHERE 1;

--
-- INSERT template for table `RunCompletionUsage`
--
INSERT INTO `RunCompletionUsage`(`completion_tokens`, `prompt_tokens`, `total_tokens`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunCompletionUsage`
--
UPDATE `RunCompletionUsage` SET `completion_tokens` = ?, `prompt_tokens` = ?, `total_tokens` = ? WHERE 1;

--
-- DELETE template for table `RunCompletionUsage`
--
DELETE FROM `RunCompletionUsage` WHERE 0;

