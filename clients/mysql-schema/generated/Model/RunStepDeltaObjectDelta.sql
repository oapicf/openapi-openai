--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaObject_delta' definition.
--


--
-- SELECT template for table `RunStepDeltaObject_delta`
--
SELECT `step_details` FROM `RunStepDeltaObject_delta` WHERE 1;

--
-- INSERT template for table `RunStepDeltaObject_delta`
--
INSERT INTO `RunStepDeltaObject_delta`(`step_details`) VALUES (?);

--
-- UPDATE template for table `RunStepDeltaObject_delta`
--
UPDATE `RunStepDeltaObject_delta` SET `step_details` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaObject_delta`
--
DELETE FROM `RunStepDeltaObject_delta` WHERE 0;

