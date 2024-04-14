--
-- OpenAI API.
-- Prepared SQL queries for 'SubmitToolOutputsRunRequest' definition.
--


--
-- SELECT template for table `SubmitToolOutputsRunRequest`
--
SELECT `tool_outputs`, `stream` FROM `SubmitToolOutputsRunRequest` WHERE 1;

--
-- INSERT template for table `SubmitToolOutputsRunRequest`
--
INSERT INTO `SubmitToolOutputsRunRequest`(`tool_outputs`, `stream`) VALUES (?, ?);

--
-- UPDATE template for table `SubmitToolOutputsRunRequest`
--
UPDATE `SubmitToolOutputsRunRequest` SET `tool_outputs` = ?, `stream` = ? WHERE 1;

--
-- DELETE template for table `SubmitToolOutputsRunRequest`
--
DELETE FROM `SubmitToolOutputsRunRequest` WHERE 0;

