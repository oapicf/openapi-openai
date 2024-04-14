--
-- OpenAI API.
-- Prepared SQL queries for 'CreateFineTuningJobRequest_integrations_inner_wandb' definition.
--


--
-- SELECT template for table `CreateFineTuningJobRequest_integrations_inner_wandb`
--
SELECT `project`, `name`, `entity`, `tags` FROM `CreateFineTuningJobRequest_integrations_inner_wandb` WHERE 1;

--
-- INSERT template for table `CreateFineTuningJobRequest_integrations_inner_wandb`
--
INSERT INTO `CreateFineTuningJobRequest_integrations_inner_wandb`(`project`, `name`, `entity`, `tags`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateFineTuningJobRequest_integrations_inner_wandb`
--
UPDATE `CreateFineTuningJobRequest_integrations_inner_wandb` SET `project` = ?, `name` = ?, `entity` = ?, `tags` = ? WHERE 1;

--
-- DELETE template for table `CreateFineTuningJobRequest_integrations_inner_wandb`
--
DELETE FROM `CreateFineTuningJobRequest_integrations_inner_wandb` WHERE 0;

