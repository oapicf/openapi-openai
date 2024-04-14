--
-- OpenAI API.
-- Prepared SQL queries for 'DeleteAssistantFileResponse' definition.
--


--
-- SELECT template for table `DeleteAssistantFileResponse`
--
SELECT `id`, `deleted`, `object` FROM `DeleteAssistantFileResponse` WHERE 1;

--
-- INSERT template for table `DeleteAssistantFileResponse`
--
INSERT INTO `DeleteAssistantFileResponse`(`id`, `deleted`, `object`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeleteAssistantFileResponse`
--
UPDATE `DeleteAssistantFileResponse` SET `id` = ?, `deleted` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `DeleteAssistantFileResponse`
--
DELETE FROM `DeleteAssistantFileResponse` WHERE 0;

