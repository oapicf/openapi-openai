--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionStreamResponseDelta' definition.
--


--
-- SELECT template for table `ChatCompletionStreamResponseDelta`
--
SELECT `role`, `content`, `function_call` FROM `ChatCompletionStreamResponseDelta` WHERE 1;

--
-- INSERT template for table `ChatCompletionStreamResponseDelta`
--
INSERT INTO `ChatCompletionStreamResponseDelta`(`role`, `content`, `function_call`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionStreamResponseDelta`
--
UPDATE `ChatCompletionStreamResponseDelta` SET `role` = ?, `content` = ?, `function_call` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionStreamResponseDelta`
--
DELETE FROM `ChatCompletionStreamResponseDelta` WHERE 0;

