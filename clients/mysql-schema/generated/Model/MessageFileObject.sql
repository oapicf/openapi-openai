--
-- OpenAI API.
-- Prepared SQL queries for 'MessageFileObject' definition.
--


--
-- SELECT template for table `MessageFileObject`
--
SELECT `id`, `object`, `created_at`, `message_id` FROM `MessageFileObject` WHERE 1;

--
-- INSERT template for table `MessageFileObject`
--
INSERT INTO `MessageFileObject`(`id`, `object`, `created_at`, `message_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MessageFileObject`
--
UPDATE `MessageFileObject` SET `id` = ?, `object` = ?, `created_at` = ?, `message_id` = ? WHERE 1;

--
-- DELETE template for table `MessageFileObject`
--
DELETE FROM `MessageFileObject` WHERE 0;

