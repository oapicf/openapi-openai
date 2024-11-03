--
-- OpenAI API.
-- Prepared SQL queries for 'FineTuningJob_error' definition.
--


--
-- SELECT template for table `FineTuningJob_error`
--
SELECT `code`, `message`, `param` FROM `FineTuningJob_error` WHERE 1;

--
-- INSERT template for table `FineTuningJob_error`
--
INSERT INTO `FineTuningJob_error`(`code`, `message`, `param`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FineTuningJob_error`
--
UPDATE `FineTuningJob_error` SET `code` = ?, `message` = ?, `param` = ? WHERE 1;

--
-- DELETE template for table `FineTuningJob_error`
--
DELETE FROM `FineTuningJob_error` WHERE 0;

