--
-- OpenAI API.
-- Prepared SQL queries for 'MessageObject' definition.
--


--
-- SELECT template for table `MessageObject`
--
SELECT `id`, `object`, `created_at`, `thread_id`, `status`, `incomplete_details`, `completed_at`, `incomplete_at`, `role`, `content`, `assistant_id`, `run_id`, `file_ids`, `metadata` FROM `MessageObject` WHERE 1;

--
-- INSERT template for table `MessageObject`
--
INSERT INTO `MessageObject`(`id`, `object`, `created_at`, `thread_id`, `status`, `incomplete_details`, `completed_at`, `incomplete_at`, `role`, `content`, `assistant_id`, `run_id`, `file_ids`, `metadata`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MessageObject`
--
UPDATE `MessageObject` SET `id` = ?, `object` = ?, `created_at` = ?, `thread_id` = ?, `status` = ?, `incomplete_details` = ?, `completed_at` = ?, `incomplete_at` = ?, `role` = ?, `content` = ?, `assistant_id` = ?, `run_id` = ?, `file_ids` = ?, `metadata` = ? WHERE 1;

--
-- DELETE template for table `MessageObject`
--
DELETE FROM `MessageObject` WHERE 0;

