--
-- OpenAI API.
-- Prepared SQL queries for 'DeleteAssistantResponse' definition.
--


--
-- SELECT template for table `DeleteAssistantResponse`
--
SELECT `id`, `deleted`, `object` FROM `DeleteAssistantResponse` WHERE 1;

--
-- INSERT template for table `DeleteAssistantResponse`
--
INSERT INTO `DeleteAssistantResponse`(`id`, `deleted`, `object`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeleteAssistantResponse`
--
UPDATE `DeleteAssistantResponse` SET `id` = ?, `deleted` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `DeleteAssistantResponse`
--
DELETE FROM `DeleteAssistantResponse` WHERE 0;

