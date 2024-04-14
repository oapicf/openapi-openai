--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionResponse' definition.
--


--
-- SELECT template for table `CreateChatCompletionResponse`
--
SELECT `id`, `choices`, `created`, `model`, `system_fingerprint`, `object`, `usage` FROM `CreateChatCompletionResponse` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionResponse`
--
INSERT INTO `CreateChatCompletionResponse`(`id`, `choices`, `created`, `model`, `system_fingerprint`, `object`, `usage`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionResponse`
--
UPDATE `CreateChatCompletionResponse` SET `id` = ?, `choices` = ?, `created` = ?, `model` = ?, `system_fingerprint` = ?, `object` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionResponse`
--
DELETE FROM `CreateChatCompletionResponse` WHERE 0;

