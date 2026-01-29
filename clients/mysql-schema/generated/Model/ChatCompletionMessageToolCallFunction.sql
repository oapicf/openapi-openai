--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionMessageToolCall_function' definition.
--


--
-- SELECT template for table `ChatCompletionMessageToolCall_function`
--
SELECT `name`, `arguments` FROM `ChatCompletionMessageToolCall_function` WHERE 1;

--
-- INSERT template for table `ChatCompletionMessageToolCall_function`
--
INSERT INTO `ChatCompletionMessageToolCall_function`(`name`, `arguments`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionMessageToolCall_function`
--
UPDATE `ChatCompletionMessageToolCall_function` SET `name` = ?, `arguments` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionMessageToolCall_function`
--
DELETE FROM `ChatCompletionMessageToolCall_function` WHERE 0;

