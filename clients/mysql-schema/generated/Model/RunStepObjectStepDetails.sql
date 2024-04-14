--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepObject_step_details' definition.
--


--
-- SELECT template for table `RunStepObject_step_details`
--
SELECT `type`, `message_creation`, `tool_calls` FROM `RunStepObject_step_details` WHERE 1;

--
-- INSERT template for table `RunStepObject_step_details`
--
INSERT INTO `RunStepObject_step_details`(`type`, `message_creation`, `tool_calls`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepObject_step_details`
--
UPDATE `RunStepObject_step_details` SET `type` = ?, `message_creation` = ?, `tool_calls` = ? WHERE 1;

--
-- DELETE template for table `RunStepObject_step_details`
--
DELETE FROM `RunStepObject_step_details` WHERE 0;

