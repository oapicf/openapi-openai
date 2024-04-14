--
-- OpenAI API.
-- Prepared SQL queries for 'CreateThreadAndRunRequest_tools_inner' definition.
--


--
-- SELECT template for table `CreateThreadAndRunRequest_tools_inner`
--
SELECT `type`, `function` FROM `CreateThreadAndRunRequest_tools_inner` WHERE 1;

--
-- INSERT template for table `CreateThreadAndRunRequest_tools_inner`
--
INSERT INTO `CreateThreadAndRunRequest_tools_inner`(`type`, `function`) VALUES (?, ?);

--
-- UPDATE template for table `CreateThreadAndRunRequest_tools_inner`
--
UPDATE `CreateThreadAndRunRequest_tools_inner` SET `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `CreateThreadAndRunRequest_tools_inner`
--
DELETE FROM `CreateThreadAndRunRequest_tools_inner` WHERE 0;

