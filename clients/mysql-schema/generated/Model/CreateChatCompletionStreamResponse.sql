--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionStreamResponse' definition.
--


--
-- SELECT template for table `CreateChatCompletionStreamResponse`
--
SELECT `id`, `object`, `created`, `model`, `choices` FROM `CreateChatCompletionStreamResponse` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionStreamResponse`
--
INSERT INTO `CreateChatCompletionStreamResponse`(`id`, `object`, `created`, `model`, `choices`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionStreamResponse`
--
UPDATE `CreateChatCompletionStreamResponse` SET `id` = ?, `object` = ?, `created` = ?, `model` = ?, `choices` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionStreamResponse`
--
DELETE FROM `CreateChatCompletionStreamResponse` WHERE 0;

