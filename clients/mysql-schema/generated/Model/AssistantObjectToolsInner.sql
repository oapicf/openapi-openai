--
-- OpenAI API.
-- Prepared SQL queries for 'AssistantObject_tools_inner' definition.
--


--
-- SELECT template for table `AssistantObject_tools_inner`
--
SELECT `type`, `function` FROM `AssistantObject_tools_inner` WHERE 1;

--
-- INSERT template for table `AssistantObject_tools_inner`
--
INSERT INTO `AssistantObject_tools_inner`(`type`, `function`) VALUES (?, ?);

--
-- UPDATE template for table `AssistantObject_tools_inner`
--
UPDATE `AssistantObject_tools_inner` SET `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `AssistantObject_tools_inner`
--
DELETE FROM `AssistantObject_tools_inner` WHERE 0;

