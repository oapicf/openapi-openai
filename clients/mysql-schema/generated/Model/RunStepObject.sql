--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepObject' definition.
--


--
-- SELECT template for table `RunStepObject`
--
SELECT `id`, `object`, `created_at`, `assistant_id`, `thread_id`, `run_id`, `type`, `status`, `step_details`, `last_error`, `expired_at`, `cancelled_at`, `failed_at`, `completed_at`, `metadata`, `usage` FROM `RunStepObject` WHERE 1;

--
-- INSERT template for table `RunStepObject`
--
INSERT INTO `RunStepObject`(`id`, `object`, `created_at`, `assistant_id`, `thread_id`, `run_id`, `type`, `status`, `step_details`, `last_error`, `expired_at`, `cancelled_at`, `failed_at`, `completed_at`, `metadata`, `usage`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `RunStepObject`
--
UPDATE `RunStepObject` SET `id` = ?, `object` = ?, `created_at` = ?, `assistant_id` = ?, `thread_id` = ?, `run_id` = ?, `type` = ?, `status` = ?, `step_details` = ?, `last_error` = ?, `expired_at` = ?, `cancelled_at` = ?, `failed_at` = ?, `completed_at` = ?, `metadata` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `RunStepObject`
--
DELETE FROM `RunStepObject` WHERE 0;

