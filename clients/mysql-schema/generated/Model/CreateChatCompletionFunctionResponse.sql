--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionFunctionResponse' definition.
--


--
-- SELECT template for table `CreateChatCompletionFunctionResponse`
--
SELECT `id`, `choices`, `created`, `model`, `system_fingerprint`, `object`, `usage` FROM `CreateChatCompletionFunctionResponse` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionFunctionResponse`
--
INSERT INTO `CreateChatCompletionFunctionResponse`(`id`, `choices`, `created`, `model`, `system_fingerprint`, `object`, `usage`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionFunctionResponse`
--
UPDATE `CreateChatCompletionFunctionResponse` SET `id` = ?, `choices` = ?, `created` = ?, `model` = ?, `system_fingerprint` = ?, `object` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionFunctionResponse`
--
DELETE FROM `CreateChatCompletionFunctionResponse` WHERE 0;

