--
-- OpenAI API.
-- Prepared SQL queries for 'ThreadObject' definition.
--


--
-- SELECT template for table `ThreadObject`
--
SELECT `id`, `object`, `created_at`, `metadata` FROM `ThreadObject` WHERE 1;

--
-- INSERT template for table `ThreadObject`
--
INSERT INTO `ThreadObject`(`id`, `object`, `created_at`, `metadata`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ThreadObject`
--
UPDATE `ThreadObject` SET `id` = ?, `object` = ?, `created_at` = ?, `metadata` = ? WHERE 1;

--
-- DELETE template for table `ThreadObject`
--
DELETE FROM `ThreadObject` WHERE 0;

