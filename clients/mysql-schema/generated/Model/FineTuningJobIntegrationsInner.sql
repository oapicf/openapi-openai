--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuningJob_integrations_inner' definition.
--


--
-- SELECT template for table `FineTuningJob_integrations_inner`
--
SELECT `type`, `wandb` FROM `FineTuningJob_integrations_inner` WHERE 1;

--
-- INSERT template for table `FineTuningJob_integrations_inner`
--
INSERT INTO `FineTuningJob_integrations_inner`(`type`, `wandb`) VALUES (?, ?);

--
-- UPDATE template for table `FineTuningJob_integrations_inner`
--
UPDATE `FineTuningJob_integrations_inner` SET `type` = ?, `wandb` = ? WHERE 1;

--
-- DELETE template for table `FineTuningJob_integrations_inner`
--
DELETE FROM `FineTuningJob_integrations_inner` WHERE 0;

