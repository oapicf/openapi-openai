--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaObject_delta_step_details' definition.
--


--
-- SELECT template for table `RunStepDeltaObject_delta_step_details`
--
SELECT `type`, `message_creation`, `tool_calls` FROM `RunStepDeltaObject_delta_step_details` WHERE 1;

--
-- INSERT template for table `RunStepDeltaObject_delta_step_details`
--
INSERT INTO `RunStepDeltaObject_delta_step_details`(`type`, `message_creation`, `tool_calls`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaObject_delta_step_details`
--
UPDATE `RunStepDeltaObject_delta_step_details` SET `type` = ?, `message_creation` = ?, `tool_calls` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaObject_delta_step_details`
--
DELETE FROM `RunStepDeltaObject_delta_step_details` WHERE 0;

