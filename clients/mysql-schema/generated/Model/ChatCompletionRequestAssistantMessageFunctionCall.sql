--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestAssistantMessage_function_call' definition.
--


--
-- SELECT template for table `ChatCompletionRequestAssistantMessage_function_call`
--
SELECT `arguments`, `name` FROM `ChatCompletionRequestAssistantMessage_function_call` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestAssistantMessage_function_call`
--
INSERT INTO `ChatCompletionRequestAssistantMessage_function_call`(`arguments`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionRequestAssistantMessage_function_call`
--
UPDATE `ChatCompletionRequestAssistantMessage_function_call` SET `arguments` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestAssistantMessage_function_call`
--
DELETE FROM `ChatCompletionRequestAssistantMessage_function_call` WHERE 0;

