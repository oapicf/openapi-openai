--
-- OpenAI API.
-- Prepared SQL queries for 'AssistantsApiNamedToolChoice' definition.
--


--
-- SELECT template for table `AssistantsApiNamedToolChoice`
--
SELECT `type`, `function` FROM `AssistantsApiNamedToolChoice` WHERE 1;

--
-- INSERT template for table `AssistantsApiNamedToolChoice`
--
INSERT INTO `AssistantsApiNamedToolChoice`(`type`, `function`) VALUES (?, ?);

--
-- UPDATE template for table `AssistantsApiNamedToolChoice`
--
UPDATE `AssistantsApiNamedToolChoice` SET `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `AssistantsApiNamedToolChoice`
--
DELETE FROM `AssistantsApiNamedToolChoice` WHERE 0;

