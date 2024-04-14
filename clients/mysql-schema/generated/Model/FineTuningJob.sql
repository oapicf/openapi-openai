--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuningJob' definition.
--


--
-- SELECT template for table `FineTuningJob`
--
SELECT `id`, `created_at`, `error`, `fine_tuned_model`, `finished_at`, `hyperparameters`, `model`, `object`, `organization_id`, `result_files`, `status`, `trained_tokens`, `training_file`, `validation_file`, `integrations`, `seed` FROM `FineTuningJob` WHERE 1;

--
-- INSERT template for table `FineTuningJob`
--
INSERT INTO `FineTuningJob`(`id`, `created_at`, `error`, `fine_tuned_model`, `finished_at`, `hyperparameters`, `model`, `object`, `organization_id`, `result_files`, `status`, `trained_tokens`, `training_file`, `validation_file`, `integrations`, `seed`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FineTuningJob`
--
UPDATE `FineTuningJob` SET `id` = ?, `created_at` = ?, `error` = ?, `fine_tuned_model` = ?, `finished_at` = ?, `hyperparameters` = ?, `model` = ?, `object` = ?, `organization_id` = ?, `result_files` = ?, `status` = ?, `trained_tokens` = ?, `training_file` = ?, `validation_file` = ?, `integrations` = ?, `seed` = ? WHERE 1;

--
-- DELETE template for table `FineTuningJob`
--
DELETE FROM `FineTuningJob` WHERE 0;

