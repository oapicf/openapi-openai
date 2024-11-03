--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuningJob_hyperparameters' definition.
--


--
-- SELECT template for table `FineTuningJob_hyperparameters`
--
SELECT `n_epochs` FROM `FineTuningJob_hyperparameters` WHERE 1;

--
-- INSERT template for table `FineTuningJob_hyperparameters`
--
INSERT INTO `FineTuningJob_hyperparameters`(`n_epochs`) VALUES (?);

--
-- UPDATE template for table `FineTuningJob_hyperparameters`
--
UPDATE `FineTuningJob_hyperparameters` SET `n_epochs` = ? WHERE 1;

--
-- DELETE template for table `FineTuningJob_hyperparameters`
--
DELETE FROM `FineTuningJob_hyperparameters` WHERE 0;

