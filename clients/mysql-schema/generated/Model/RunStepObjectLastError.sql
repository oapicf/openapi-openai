--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepObject_last_error' definition.
--


--
-- SELECT template for table `RunStepObject_last_error`
--
SELECT `code`, `message` FROM `RunStepObject_last_error` WHERE 1;

--
-- INSERT template for table `RunStepObject_last_error`
--
INSERT INTO `RunStepObject_last_error`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepObject_last_error`
--
UPDATE `RunStepObject_last_error` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `RunStepObject_last_error`
--
DELETE FROM `RunStepObject_last_error` WHERE 0;

