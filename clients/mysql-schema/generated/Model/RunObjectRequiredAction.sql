--
-- OpenAI API.
-- Prepared SQL queries for 'RunObject_required_action' definition.
--


--
-- SELECT template for table `RunObject_required_action`
--
SELECT `type`, `submit_tool_outputs` FROM `RunObject_required_action` WHERE 1;

--
-- INSERT template for table `RunObject_required_action`
--
INSERT INTO `RunObject_required_action`(`type`, `submit_tool_outputs`) VALUES (?, ?);

--
-- UPDATE template for table `RunObject_required_action`
--
UPDATE `RunObject_required_action` SET `type` = ?, `submit_tool_outputs` = ? WHERE 1;

--
-- DELETE template for table `RunObject_required_action`
--
DELETE FROM `RunObject_required_action` WHERE 0;

