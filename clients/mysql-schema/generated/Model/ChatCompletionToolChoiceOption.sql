--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionToolChoiceOption' definition.
--


--
-- SELECT template for table `ChatCompletionToolChoiceOption`
--
SELECT `type`, `function` FROM `ChatCompletionToolChoiceOption` WHERE 1;

--
-- INSERT template for table `ChatCompletionToolChoiceOption`
--
INSERT INTO `ChatCompletionToolChoiceOption`(`type`, `function`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionToolChoiceOption`
--
UPDATE `ChatCompletionToolChoiceOption` SET `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionToolChoiceOption`
--
DELETE FROM `ChatCompletionToolChoiceOption` WHERE 0;

