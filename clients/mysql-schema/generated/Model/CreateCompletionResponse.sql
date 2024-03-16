--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionResponse' definition.
--


--
-- SELECT template for table `CreateCompletionResponse`
--
SELECT `id`, `object`, `created`, `model`, `choices`, `usage` FROM `CreateCompletionResponse` WHERE 1;

--
-- INSERT template for table `CreateCompletionResponse`
--
INSERT INTO `CreateCompletionResponse`(`id`, `object`, `created`, `model`, `choices`, `usage`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateCompletionResponse`
--
UPDATE `CreateCompletionResponse` SET `id` = ?, `object` = ?, `created` = ?, `model` = ?, `choices` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionResponse`
--
DELETE FROM `CreateCompletionResponse` WHERE 0;

