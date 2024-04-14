--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionStreamResponseDelta' definition.
--


--
-- SELECT template for table `ChatCompletionStreamResponseDelta`
--
SELECT `content`, `function_call`, `tool_calls`, `role` FROM `ChatCompletionStreamResponseDelta` WHERE 1;

--
-- INSERT template for table `ChatCompletionStreamResponseDelta`
--
INSERT INTO `ChatCompletionStreamResponseDelta`(`content`, `function_call`, `tool_calls`, `role`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ChatCompletionStreamResponseDelta`
--
UPDATE `ChatCompletionStreamResponseDelta` SET `content` = ?, `function_call` = ?, `tool_calls` = ?, `role` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionStreamResponseDelta`
--
DELETE FROM `ChatCompletionStreamResponseDelta` WHERE 0;

