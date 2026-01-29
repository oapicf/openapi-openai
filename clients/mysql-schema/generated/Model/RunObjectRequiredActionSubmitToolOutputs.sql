--
-- OpenAI API.
-- Prepared SQL queries for 'RunObject_required_action_submit_tool_outputs' definition.
--


--
-- SELECT template for table `RunObject_required_action_submit_tool_outputs`
--
SELECT `tool_calls` FROM `RunObject_required_action_submit_tool_outputs` WHERE 1;

--
-- INSERT template for table `RunObject_required_action_submit_tool_outputs`
--
INSERT INTO `RunObject_required_action_submit_tool_outputs`(`tool_calls`) VALUES (?);

--
-- UPDATE template for table `RunObject_required_action_submit_tool_outputs`
--
UPDATE `RunObject_required_action_submit_tool_outputs` SET `tool_calls` = ? WHERE 1;

--
-- DELETE template for table `RunObject_required_action_submit_tool_outputs`
--
DELETE FROM `RunObject_required_action_submit_tool_outputs` WHERE 0;

