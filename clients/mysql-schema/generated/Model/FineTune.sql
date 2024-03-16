--
-- OpenAI API.
-- Prepared SQL queries for 'FineTune' definition.
--


--
-- SELECT template for table `FineTune`
--
SELECT `id`, `object`, `created_at`, `updated_at`, `model`, `fine_tuned_model`, `organization_id`, `status`, `hyperparams`, `training_files`, `validation_files`, `result_files`, `events` FROM `FineTune` WHERE 1;

--
-- INSERT template for table `FineTune`
--
INSERT INTO `FineTune`(`id`, `object`, `created_at`, `updated_at`, `model`, `fine_tuned_model`, `organization_id`, `status`, `hyperparams`, `training_files`, `validation_files`, `result_files`, `events`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FineTune`
--
UPDATE `FineTune` SET `id` = ?, `object` = ?, `created_at` = ?, `updated_at` = ?, `model` = ?, `fine_tuned_model` = ?, `organization_id` = ?, `status` = ?, `hyperparams` = ?, `training_files` = ?, `validation_files` = ?, `result_files` = ?, `events` = ? WHERE 1;

--
-- DELETE template for table `FineTune`
--
DELETE FROM `FineTune` WHERE 0;

