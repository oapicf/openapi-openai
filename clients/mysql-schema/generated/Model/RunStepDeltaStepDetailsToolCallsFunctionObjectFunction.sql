--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsToolCallsFunctionObject_function' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsToolCallsFunctionObject_function`
--
SELECT `name`, `arguments`, `output` FROM `RunStepDeltaStepDetailsToolCallsFunctionObject_function` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsToolCallsFunctionObject_function`
--
INSERT INTO `RunStepDeltaStepDetailsToolCallsFunctionObject_function`(`name`, `arguments`, `output`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsToolCallsFunctionObject_function`
--
UPDATE `RunStepDeltaStepDetailsToolCallsFunctionObject_function` SET `name` = ?, `arguments` = ?, `output` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsToolCallsFunctionObject_function`
--
DELETE FROM `RunStepDeltaStepDetailsToolCallsFunctionObject_function` WHERE 0;

