--
-- OpenAI API.
-- Prepared SQL queries for 'AssistantFileObject' definition.
--


--
-- SELECT template for table `AssistantFileObject`
--
SELECT `id`, `object`, `created_at`, `assistant_id` FROM `AssistantFileObject` WHERE 1;

--
-- INSERT template for table `AssistantFileObject`
--
INSERT INTO `AssistantFileObject`(`id`, `object`, `created_at`, `assistant_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AssistantFileObject`
--
UPDATE `AssistantFileObject` SET `id` = ?, `object` = ?, `created_at` = ?, `assistant_id` = ? WHERE 1;

--
-- DELETE template for table `AssistantFileObject`
--
DELETE FROM `AssistantFileObject` WHERE 0;

