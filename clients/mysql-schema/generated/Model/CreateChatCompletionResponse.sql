--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionResponse' definition.
--


--
-- SELECT template for table `CreateChatCompletionResponse`
--
SELECT `id`, `object`, `created`, `model`, `choices`, `usage` FROM `CreateChatCompletionResponse` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionResponse`
--
INSERT INTO `CreateChatCompletionResponse`(`id`, `object`, `created`, `model`, `choices`, `usage`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionResponse`
--
UPDATE `CreateChatCompletionResponse` SET `id` = ?, `object` = ?, `created` = ?, `model` = ?, `choices` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionResponse`
--
DELETE FROM `CreateChatCompletionResponse` WHERE 0;

