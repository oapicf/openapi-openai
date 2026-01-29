--
-- OpenAI API.
-- Prepared SQL queries for 'CreateFineTuningJobRequest_integrations_inner' definition.
--


--
-- SELECT template for table `CreateFineTuningJobRequest_integrations_inner`
--
SELECT `type`, `wandb` FROM `CreateFineTuningJobRequest_integrations_inner` WHERE 1;

--
-- INSERT template for table `CreateFineTuningJobRequest_integrations_inner`
--
INSERT INTO `CreateFineTuningJobRequest_integrations_inner`(`type`, `wandb`) VALUES (?, ?);

--
-- UPDATE template for table `CreateFineTuningJobRequest_integrations_inner`
--
UPDATE `CreateFineTuningJobRequest_integrations_inner` SET `type` = ?, `wandb` = ? WHERE 1;

--
-- DELETE template for table `CreateFineTuningJobRequest_integrations_inner`
--
DELETE FROM `CreateFineTuningJobRequest_integrations_inner` WHERE 0;

