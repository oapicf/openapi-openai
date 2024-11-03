--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuningJobEvent' definition.
--


--
-- SELECT template for table `FineTuningJobEvent`
--
SELECT `id`, `created_at`, `level`, `message`, `object` FROM `FineTuningJobEvent` WHERE 1;

--
-- INSERT template for table `FineTuningJobEvent`
--
INSERT INTO `FineTuningJobEvent`(`id`, `created_at`, `level`, `message`, `object`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `FineTuningJobEvent`
--
UPDATE `FineTuningJobEvent` SET `id` = ?, `created_at` = ?, `level` = ?, `message` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `FineTuningJobEvent`
--
DELETE FROM `FineTuningJobEvent` WHERE 0;

