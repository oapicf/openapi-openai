--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestAssistantMessage' definition.
--


--
-- SELECT template for table `ChatCompletionRequestAssistantMessage`
--
SELECT `content`, `role`, `name`, `tool_calls`, `function_call` FROM `ChatCompletionRequestAssistantMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestAssistantMessage`
--
INSERT INTO `ChatCompletionRequestAssistantMessage`(`content`, `role`, `name`, `tool_calls`, `function_call`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ChatCompletionRequestAssistantMessage`
--
UPDATE `ChatCompletionRequestAssistantMessage` SET `content` = ?, `role` = ?, `name` = ?, `tool_calls` = ?, `function_call` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestAssistantMessage`
--
DELETE FROM `ChatCompletionRequestAssistantMessage` WHERE 0;

