--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionFunctions' definition.
--


--
-- SELECT template for table `ChatCompletionFunctions`
--
SELECT `name`, `description`, `parameters` FROM `ChatCompletionFunctions` WHERE 1;

--
-- INSERT template for table `ChatCompletionFunctions`
--
INSERT INTO `ChatCompletionFunctions`(`name`, `description`, `parameters`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionFunctions`
--
UPDATE `ChatCompletionFunctions` SET `name` = ?, `description` = ?, `parameters` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionFunctions`
--
DELETE FROM `ChatCompletionFunctions` WHERE 0;

