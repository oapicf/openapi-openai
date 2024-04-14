--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionResponseMessage' definition.
--


--
-- SELECT template for table `ChatCompletionResponseMessage`
--
SELECT `content`, `tool_calls`, `role`, `function_call` FROM `ChatCompletionResponseMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionResponseMessage`
--
INSERT INTO `ChatCompletionResponseMessage`(`content`, `tool_calls`, `role`, `function_call`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ChatCompletionResponseMessage`
--
UPDATE `ChatCompletionResponseMessage` SET `content` = ?, `tool_calls` = ?, `role` = ?, `function_call` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionResponseMessage`
--
DELETE FROM `ChatCompletionResponseMessage` WHERE 0;

