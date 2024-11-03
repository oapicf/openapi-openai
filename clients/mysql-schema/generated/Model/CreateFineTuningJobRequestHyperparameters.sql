--
-- OpenAI API.
-- Prepared SQL queries for 'CreateFineTuningJobRequest_hyperparameters' definition.
--


--
-- SELECT template for table `CreateFineTuningJobRequest_hyperparameters`
--
SELECT `batch_size`, `learning_rate_multiplier`, `n_epochs` FROM `CreateFineTuningJobRequest_hyperparameters` WHERE 1;

--
-- INSERT template for table `CreateFineTuningJobRequest_hyperparameters`
--
INSERT INTO `CreateFineTuningJobRequest_hyperparameters`(`batch_size`, `learning_rate_multiplier`, `n_epochs`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateFineTuningJobRequest_hyperparameters`
--
UPDATE `CreateFineTuningJobRequest_hyperparameters` SET `batch_size` = ?, `learning_rate_multiplier` = ?, `n_epochs` = ? WHERE 1;

--
-- DELETE template for table `CreateFineTuningJobRequest_hyperparameters`
--
DELETE FROM `CreateFineTuningJobRequest_hyperparameters` WHERE 0;

