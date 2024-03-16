--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestMessage' definition.
--


--
-- SELECT template for table `ChatCompletionRequestMessage`
--
SELECT `role`, `content`, `name`, `function_call` FROM `ChatCompletionRequestMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestMessage`
--
INSERT INTO `ChatCompletionRequestMessage`(`role`, `content`, `name`, `function_call`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ChatCompletionRequestMessage`
--
UPDATE `ChatCompletionRequestMessage` SET `role` = ?, `content` = ?, `name` = ?, `function_call` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestMessage`
--
DELETE FROM `ChatCompletionRequestMessage` WHERE 0;

