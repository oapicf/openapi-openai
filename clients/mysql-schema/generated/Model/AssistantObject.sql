--
-- OpenAI API.
-- Prepared SQL queries for 'AssistantObject' definition.
--


--
-- SELECT template for table `AssistantObject`
--
SELECT `id`, `object`, `created_at`, `name`, `description`, `model`, `instructions`, `tools`, `file_ids`, `metadata` FROM `AssistantObject` WHERE 1;

--
-- INSERT template for table `AssistantObject`
--
INSERT INTO `AssistantObject`(`id`, `object`, `created_at`, `name`, `description`, `model`, `instructions`, `tools`, `file_ids`, `metadata`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AssistantObject`
--
UPDATE `AssistantObject` SET `id` = ?, `object` = ?, `created_at` = ?, `name` = ?, `description` = ?, `model` = ?, `instructions` = ?, `tools` = ?, `file_ids` = ?, `metadata` = ? WHERE 1;

--
-- DELETE template for table `AssistantObject`
--
DELETE FROM `AssistantObject` WHERE 0;

