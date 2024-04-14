--
-- OpenAI API.
-- Prepared SQL queries for 'CreateMessageRequest' definition.
--


--
-- SELECT template for table `CreateMessageRequest`
--
SELECT `role`, `content`, `file_ids`, `metadata` FROM `CreateMessageRequest` WHERE 1;

--
-- INSERT template for table `CreateMessageRequest`
--
INSERT INTO `CreateMessageRequest`(`role`, `content`, `file_ids`, `metadata`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateMessageRequest`
--
UPDATE `CreateMessageRequest` SET `role` = ?, `content` = ?, `file_ids` = ?, `metadata` = ? WHERE 1;

--
-- DELETE template for table `CreateMessageRequest`
--
DELETE FROM `CreateMessageRequest` WHERE 0;

