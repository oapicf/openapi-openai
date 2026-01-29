--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestFunctionMessage' definition.
--


--
-- SELECT template for table `ChatCompletionRequestFunctionMessage`
--
SELECT `role`, `content`, `name` FROM `ChatCompletionRequestFunctionMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestFunctionMessage`
--
INSERT INTO `ChatCompletionRequestFunctionMessage`(`role`, `content`, `name`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionRequestFunctionMessage`
--
UPDATE `ChatCompletionRequestFunctionMessage` SET `role` = ?, `content` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestFunctionMessage`
--
DELETE FROM `ChatCompletionRequestFunctionMessage` WHERE 0;

