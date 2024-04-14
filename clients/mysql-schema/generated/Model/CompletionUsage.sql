--
-- OpenAI API.
-- Prepared SQL queries for 'CompletionUsage' definition.
--


--
-- SELECT template for table `CompletionUsage`
--
SELECT `completion_tokens`, `prompt_tokens`, `total_tokens` FROM `CompletionUsage` WHERE 1;

--
-- INSERT template for table `CompletionUsage`
--
INSERT INTO `CompletionUsage`(`completion_tokens`, `prompt_tokens`, `total_tokens`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CompletionUsage`
--
UPDATE `CompletionUsage` SET `completion_tokens` = ?, `prompt_tokens` = ?, `total_tokens` = ? WHERE 1;

--
-- DELETE template for table `CompletionUsage`
--
DELETE FROM `CompletionUsage` WHERE 0;

