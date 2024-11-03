--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsFunctionObject_function' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsFunctionObject_function`
--
SELECT `name`, `arguments`, `output` FROM `RunStepDetailsToolCallsFunctionObject_function` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsFunctionObject_function`
--
INSERT INTO `RunStepDetailsToolCallsFunctionObject_function`(`name`, `arguments`, `output`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsFunctionObject_function`
--
UPDATE `RunStepDetailsToolCallsFunctionObject_function` SET `name` = ?, `arguments` = ?, `output` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsFunctionObject_function`
--
DELETE FROM `RunStepDetailsToolCallsFunctionObject_function` WHERE 0;

