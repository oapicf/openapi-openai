--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionResponseMessage' definition.
--


--
-- SELECT template for table `ChatCompletionResponseMessage`
--
SELECT `role`, `content`, `function_call` FROM `ChatCompletionResponseMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionResponseMessage`
--
INSERT INTO `ChatCompletionResponseMessage`(`role`, `content`, `function_call`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionResponseMessage`
--
UPDATE `ChatCompletionResponseMessage` SET `role` = ?, `content` = ?, `function_call` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionResponseMessage`
--
DELETE FROM `ChatCompletionResponseMessage` WHERE 0;

