--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestMessage_function_call' definition.
--


--
-- SELECT template for table `ChatCompletionRequestMessage_function_call`
--
SELECT `name`, `arguments` FROM `ChatCompletionRequestMessage_function_call` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestMessage_function_call`
--
INSERT INTO `ChatCompletionRequestMessage_function_call`(`name`, `arguments`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionRequestMessage_function_call`
--
UPDATE `ChatCompletionRequestMessage_function_call` SET `name` = ?, `arguments` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestMessage_function_call`
--
DELETE FROM `ChatCompletionRequestMessage_function_call` WHERE 0;

