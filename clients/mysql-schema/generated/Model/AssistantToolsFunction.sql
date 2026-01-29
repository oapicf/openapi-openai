--
-- OpenAI API.
-- Prepared SQL queries for 'AssistantToolsFunction' definition.
--


--
-- SELECT template for table `AssistantToolsFunction`
--
SELECT `type`, `function` FROM `AssistantToolsFunction` WHERE 1;

--
-- INSERT template for table `AssistantToolsFunction`
--
INSERT INTO `AssistantToolsFunction`(`type`, `function`) VALUES (?, ?);

--
-- UPDATE template for table `AssistantToolsFunction`
--
UPDATE `AssistantToolsFunction` SET `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `AssistantToolsFunction`
--
DELETE FROM `AssistantToolsFunction` WHERE 0;

