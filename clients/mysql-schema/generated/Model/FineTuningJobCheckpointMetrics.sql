--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuningJobCheckpoint_metrics' definition.
--


--
-- SELECT template for table `FineTuningJobCheckpoint_metrics`
--
SELECT `step`, `train_loss`, `train_mean_token_accuracy`, `valid_loss`, `valid_mean_token_accuracy`, `full_valid_loss`, `full_valid_mean_token_accuracy` FROM `FineTuningJobCheckpoint_metrics` WHERE 1;

--
-- INSERT template for table `FineTuningJobCheckpoint_metrics`
--
INSERT INTO `FineTuningJobCheckpoint_metrics`(`step`, `train_loss`, `train_mean_token_accuracy`, `valid_loss`, `valid_mean_token_accuracy`, `full_valid_loss`, `full_valid_mean_token_accuracy`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `FineTuningJobCheckpoint_metrics`
--
UPDATE `FineTuningJobCheckpoint_metrics` SET `step` = ?, `train_loss` = ?, `train_mean_token_accuracy` = ?, `valid_loss` = ?, `valid_mean_token_accuracy` = ?, `full_valid_loss` = ?, `full_valid_mean_token_accuracy` = ? WHERE 1;

--
-- DELETE template for table `FineTuningJobCheckpoint_metrics`
--
DELETE FROM `FineTuningJobCheckpoint_metrics` WHERE 0;

