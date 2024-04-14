--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestUserMessage' definition.
--


--
-- SELECT template for table `ChatCompletionRequestUserMessage`
--
SELECT `content`, `role`, `name` FROM `ChatCompletionRequestUserMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestUserMessage`
--
INSERT INTO `ChatCompletionRequestUserMessage`(`content`, `role`, `name`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionRequestUserMessage`
--
UPDATE `ChatCompletionRequestUserMessage` SET `content` = ?, `role` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestUserMessage`
--
DELETE FROM `ChatCompletionRequestUserMessage` WHERE 0;

