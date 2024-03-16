--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuneEvent' definition.
--


--
-- SELECT template for table `FineTuneEvent`
--
SELECT `object`, `created_at`, `level`, `message` FROM `FineTuneEvent` WHERE 1;

--
-- INSERT template for table `FineTuneEvent`
--
INSERT INTO `FineTuneEvent`(`object`, `created_at`, `level`, `message`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `FineTuneEvent`
--
UPDATE `FineTuneEvent` SET `object` = ?, `created_at` = ?, `level` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `FineTuneEvent`
--
DELETE FROM `FineTuneEvent` WHERE 0;

