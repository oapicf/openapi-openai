--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionNamedToolChoice' definition.
--


--
-- SELECT template for table `ChatCompletionNamedToolChoice`
--
SELECT `type`, `function` FROM `ChatCompletionNamedToolChoice` WHERE 1;

--
-- INSERT template for table `ChatCompletionNamedToolChoice`
--
INSERT INTO `ChatCompletionNamedToolChoice`(`type`, `function`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionNamedToolChoice`
--
UPDATE `ChatCompletionNamedToolChoice` SET `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionNamedToolChoice`
--
DELETE FROM `ChatCompletionNamedToolChoice` WHERE 0;

