--
-- OpenAI API.
-- Prepared SQL queries for 'AssistantsApiToolChoiceOption' definition.
--


--
-- SELECT template for table `AssistantsApiToolChoiceOption`
--
SELECT `type`, `function` FROM `AssistantsApiToolChoiceOption` WHERE 1;

--
-- INSERT template for table `AssistantsApiToolChoiceOption`
--
INSERT INTO `AssistantsApiToolChoiceOption`(`type`, `function`) VALUES (?, ?);

--
-- UPDATE template for table `AssistantsApiToolChoiceOption`
--
UPDATE `AssistantsApiToolChoiceOption` SET `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `AssistantsApiToolChoiceOption`
--
DELETE FROM `AssistantsApiToolChoiceOption` WHERE 0;

