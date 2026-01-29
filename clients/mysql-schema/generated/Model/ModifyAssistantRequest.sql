--
-- OpenAI API.
-- Prepared SQL queries for 'ModifyAssistantRequest' definition.
--


--
-- SELECT template for table `ModifyAssistantRequest`
--
SELECT `model`, `name`, `description`, `instructions`, `tools`, `file_ids`, `metadata` FROM `ModifyAssistantRequest` WHERE 1;

--
-- INSERT template for table `ModifyAssistantRequest`
--
INSERT INTO `ModifyAssistantRequest`(`model`, `name`, `description`, `instructions`, `tools`, `file_ids`, `metadata`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ModifyAssistantRequest`
--
UPDATE `ModifyAssistantRequest` SET `model` = ?, `name` = ?, `description` = ?, `instructions` = ?, `tools` = ?, `file_ids` = ?, `metadata` = ? WHERE 1;

--
-- DELETE template for table `ModifyAssistantRequest`
--
DELETE FROM `ModifyAssistantRequest` WHERE 0;

