--
-- OpenAI API.
-- Prepared SQL queries for 'SubmitToolOutputsRunRequest_tool_outputs_inner' definition.
--


--
-- SELECT template for table `SubmitToolOutputsRunRequest_tool_outputs_inner`
--
SELECT `tool_call_id`, `output` FROM `SubmitToolOutputsRunRequest_tool_outputs_inner` WHERE 1;

--
-- INSERT template for table `SubmitToolOutputsRunRequest_tool_outputs_inner`
--
INSERT INTO `SubmitToolOutputsRunRequest_tool_outputs_inner`(`tool_call_id`, `output`) VALUES (?, ?);

--
-- UPDATE template for table `SubmitToolOutputsRunRequest_tool_outputs_inner`
--
UPDATE `SubmitToolOutputsRunRequest_tool_outputs_inner` SET `tool_call_id` = ?, `output` = ? WHERE 1;

--
-- DELETE template for table `SubmitToolOutputsRunRequest_tool_outputs_inner`
--
DELETE FROM `SubmitToolOutputsRunRequest_tool_outputs_inner` WHERE 0;

