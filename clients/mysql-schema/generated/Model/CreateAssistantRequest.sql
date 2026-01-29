--
-- OpenAI API.
-- Prepared SQL queries for 'CreateAssistantRequest' definition.
--


--
-- SELECT template for table `CreateAssistantRequest`
--
SELECT `model`, `name`, `description`, `instructions`, `tools`, `file_ids`, `metadata` FROM `CreateAssistantRequest` WHERE 1;

--
-- INSERT template for table `CreateAssistantRequest`
--
INSERT INTO `CreateAssistantRequest`(`model`, `name`, `description`, `instructions`, `tools`, `file_ids`, `metadata`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateAssistantRequest`
--
UPDATE `CreateAssistantRequest` SET `model` = ?, `name` = ?, `description` = ?, `instructions` = ?, `tools` = ?, `file_ids` = ?, `metadata` = ? WHERE 1;

--
-- DELETE template for table `CreateAssistantRequest`
--
DELETE FROM `CreateAssistantRequest` WHERE 0;

