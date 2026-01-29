--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionMessageToolCall' definition.
--


--
-- SELECT template for table `ChatCompletionMessageToolCall`
--
SELECT `id`, `type`, `function` FROM `ChatCompletionMessageToolCall` WHERE 1;

--
-- INSERT template for table `ChatCompletionMessageToolCall`
--
INSERT INTO `ChatCompletionMessageToolCall`(`id`, `type`, `function`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionMessageToolCall`
--
UPDATE `ChatCompletionMessageToolCall` SET `id` = ?, `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionMessageToolCall`
--
DELETE FROM `ChatCompletionMessageToolCall` WHERE 0;

