--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestSystemMessage' definition.
--


--
-- SELECT template for table `ChatCompletionRequestSystemMessage`
--
SELECT `content`, `role`, `name` FROM `ChatCompletionRequestSystemMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestSystemMessage`
--
INSERT INTO `ChatCompletionRequestSystemMessage`(`content`, `role`, `name`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionRequestSystemMessage`
--
UPDATE `ChatCompletionRequestSystemMessage` SET `content` = ?, `role` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestSystemMessage`
--
DELETE FROM `ChatCompletionRequestSystemMessage` WHERE 0;

