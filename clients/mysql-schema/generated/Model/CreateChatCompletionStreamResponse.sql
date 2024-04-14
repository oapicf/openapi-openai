--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionStreamResponse' definition.
--


--
-- SELECT template for table `CreateChatCompletionStreamResponse`
--
SELECT `id`, `choices`, `created`, `model`, `system_fingerprint`, `object` FROM `CreateChatCompletionStreamResponse` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionStreamResponse`
--
INSERT INTO `CreateChatCompletionStreamResponse`(`id`, `choices`, `created`, `model`, `system_fingerprint`, `object`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionStreamResponse`
--
UPDATE `CreateChatCompletionStreamResponse` SET `id` = ?, `choices` = ?, `created` = ?, `model` = ?, `system_fingerprint` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionStreamResponse`
--
DELETE FROM `CreateChatCompletionStreamResponse` WHERE 0;

