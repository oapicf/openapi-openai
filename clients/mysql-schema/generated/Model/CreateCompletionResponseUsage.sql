--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionResponse_usage' definition.
--


--
-- SELECT template for table `CreateCompletionResponse_usage`
--
SELECT `prompt_tokens`, `completion_tokens`, `total_tokens` FROM `CreateCompletionResponse_usage` WHERE 1;

--
-- INSERT template for table `CreateCompletionResponse_usage`
--
INSERT INTO `CreateCompletionResponse_usage`(`prompt_tokens`, `completion_tokens`, `total_tokens`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateCompletionResponse_usage`
--
UPDATE `CreateCompletionResponse_usage` SET `prompt_tokens` = ?, `completion_tokens` = ?, `total_tokens` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionResponse_usage`
--
DELETE FROM `CreateCompletionResponse_usage` WHERE 0;

