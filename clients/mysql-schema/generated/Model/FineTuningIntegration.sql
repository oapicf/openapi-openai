--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuningIntegration' definition.
--


--
-- SELECT template for table `FineTuningIntegration`
--
SELECT `type`, `wandb` FROM `FineTuningIntegration` WHERE 1;

--
-- INSERT template for table `FineTuningIntegration`
--
INSERT INTO `FineTuningIntegration`(`type`, `wandb`) VALUES (?, ?);

--
-- UPDATE template for table `FineTuningIntegration`
--
UPDATE `FineTuningIntegration` SET `type` = ?, `wandb` = ? WHERE 1;

--
-- DELETE template for table `FineTuningIntegration`
--
DELETE FROM `FineTuningIntegration` WHERE 0;

