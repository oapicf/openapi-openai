--
-- OpenAI API.
-- Prepared SQL queries for 'AssistantStreamEvent' definition.
--


--
-- SELECT template for table `AssistantStreamEvent`
--
SELECT `event`, `data` FROM `AssistantStreamEvent` WHERE 1;

--
-- INSERT template for table `AssistantStreamEvent`
--
INSERT INTO `AssistantStreamEvent`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `AssistantStreamEvent`
--
UPDATE `AssistantStreamEvent` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `AssistantStreamEvent`
--
DELETE FROM `AssistantStreamEvent` WHERE 0;

