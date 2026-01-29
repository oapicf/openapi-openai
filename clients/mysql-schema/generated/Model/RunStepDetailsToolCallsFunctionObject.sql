--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsFunctionObject' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsFunctionObject`
--
SELECT `id`, `type`, `function` FROM `RunStepDetailsToolCallsFunctionObject` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsFunctionObject`
--
INSERT INTO `RunStepDetailsToolCallsFunctionObject`(`id`, `type`, `function`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsFunctionObject`
--
UPDATE `RunStepDetailsToolCallsFunctionObject` SET `id` = ?, `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsFunctionObject`
--
DELETE FROM `RunStepDetailsToolCallsFunctionObject` WHERE 0;

