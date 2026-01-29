--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionTool' definition.
--


--
-- SELECT template for table `ChatCompletionTool`
--
SELECT `type`, `function` FROM `ChatCompletionTool` WHERE 1;

--
-- INSERT template for table `ChatCompletionTool`
--
INSERT INTO `ChatCompletionTool`(`type`, `function`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionTool`
--
UPDATE `ChatCompletionTool` SET `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionTool`
--
DELETE FROM `ChatCompletionTool` WHERE 0;

