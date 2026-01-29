--
-- OpenAI API.
-- Prepared SQL queries for 'CreateFineTuningJobRequest' definition.
--


--
-- SELECT template for table `CreateFineTuningJobRequest`
--
SELECT `model`, `training_file`, `hyperparameters`, `suffix`, `validation_file`, `integrations`, `seed` FROM `CreateFineTuningJobRequest` WHERE 1;

--
-- INSERT template for table `CreateFineTuningJobRequest`
--
INSERT INTO `CreateFineTuningJobRequest`(`model`, `training_file`, `hyperparameters`, `suffix`, `validation_file`, `integrations`, `seed`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateFineTuningJobRequest`
--
UPDATE `CreateFineTuningJobRequest` SET `model` = ?, `training_file` = ?, `hyperparameters` = ?, `suffix` = ?, `validation_file` = ?, `integrations` = ?, `seed` = ? WHERE 1;

--
-- DELETE template for table `CreateFineTuningJobRequest`
--
DELETE FROM `CreateFineTuningJobRequest` WHERE 0;

