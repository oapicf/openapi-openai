--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuningJobCheckpoint' definition.
--


--
-- SELECT template for table `FineTuningJobCheckpoint`
--
SELECT `id`, `created_at`, `fine_tuned_model_checkpoint`, `step_number`, `metrics`, `fine_tuning_job_id`, `object` FROM `FineTuningJobCheckpoint` WHERE 1;

--
-- INSERT template for table `FineTuningJobCheckpoint`
--
INSERT INTO `FineTuningJobCheckpoint`(`id`, `created_at`, `fine_tuned_model_checkpoint`, `step_number`, `metrics`, `fine_tuning_job_id`, `object`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FineTuningJobCheckpoint`
--
UPDATE `FineTuningJobCheckpoint` SET `id` = ?, `created_at` = ?, `fine_tuned_model_checkpoint` = ?, `step_number` = ?, `metrics` = ?, `fine_tuning_job_id` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `FineTuningJobCheckpoint`
--
DELETE FROM `FineTuningJobCheckpoint` WHERE 0;

