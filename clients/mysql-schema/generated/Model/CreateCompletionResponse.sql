--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionResponse' definition.
--


--
-- SELECT template for table `CreateCompletionResponse`
--
SELECT `id`, `choices`, `created`, `model`, `system_fingerprint`, `object`, `usage` FROM `CreateCompletionResponse` WHERE 1;

--
-- INSERT template for table `CreateCompletionResponse`
--
INSERT INTO `CreateCompletionResponse`(`id`, `choices`, `created`, `model`, `system_fingerprint`, `object`, `usage`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateCompletionResponse`
--
UPDATE `CreateCompletionResponse` SET `id` = ?, `choices` = ?, `created` = ?, `model` = ?, `system_fingerprint` = ?, `object` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionResponse`
--
DELETE FROM `CreateCompletionResponse` WHERE 0;

