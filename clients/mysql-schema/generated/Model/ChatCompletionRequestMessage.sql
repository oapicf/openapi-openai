--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestMessage' definition.
--


--
-- SELECT template for table `ChatCompletionRequestMessage`
--
SELECT `content`, `role`, `name`, `tool_calls`, `function_call`, `tool_call_id` FROM `ChatCompletionRequestMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestMessage`
--
INSERT INTO `ChatCompletionRequestMessage`(`content`, `role`, `name`, `tool_calls`, `function_call`, `tool_call_id`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ChatCompletionRequestMessage`
--
UPDATE `ChatCompletionRequestMessage` SET `content` = ?, `role` = ?, `name` = ?, `tool_calls` = ?, `function_call` = ?, `tool_call_id` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestMessage`
--
DELETE FROM `ChatCompletionRequestMessage` WHERE 0;

