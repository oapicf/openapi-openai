--
-- OpenAI API.
-- Prepared SQL queries for 'CreateFineTuneRequest' definition.
--


--
-- SELECT template for table `CreateFineTuneRequest`
--
SELECT `training_file`, `validation_file`, `model`, `n_epochs`, `batch_size`, `learning_rate_multiplier`, `prompt_loss_weight`, `compute_classification_metrics`, `classification_n_classes`, `classification_positive_class`, `classification_betas`, `suffix` FROM `CreateFineTuneRequest` WHERE 1;

--
-- INSERT template for table `CreateFineTuneRequest`
--
INSERT INTO `CreateFineTuneRequest`(`training_file`, `validation_file`, `model`, `n_epochs`, `batch_size`, `learning_rate_multiplier`, `prompt_loss_weight`, `compute_classification_metrics`, `classification_n_classes`, `classification_positive_class`, `classification_betas`, `suffix`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateFineTuneRequest`
--
UPDATE `CreateFineTuneRequest` SET `training_file` = ?, `validation_file` = ?, `model` = ?, `n_epochs` = ?, `batch_size` = ?, `learning_rate_multiplier` = ?, `prompt_loss_weight` = ?, `compute_classification_metrics` = ?, `classification_n_classes` = ?, `classification_positive_class` = ?, `classification_betas` = ?, `suffix` = ? WHERE 1;

--
-- DELETE template for table `CreateFineTuneRequest`
--
DELETE FROM `CreateFineTuneRequest` WHERE 0;

