--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsToolCallsFunctionObject' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsToolCallsFunctionObject`
--
SELECT `index`, `id`, `type`, `function` FROM `RunStepDeltaStepDetailsToolCallsFunctionObject` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsToolCallsFunctionObject`
--
INSERT INTO `RunStepDeltaStepDetailsToolCallsFunctionObject`(`index`, `id`, `type`, `function`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsToolCallsFunctionObject`
--
UPDATE `RunStepDeltaStepDetailsToolCallsFunctionObject` SET `index` = ?, `id` = ?, `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsToolCallsFunctionObject`
--
DELETE FROM `RunStepDeltaStepDetailsToolCallsFunctionObject` WHERE 0;

