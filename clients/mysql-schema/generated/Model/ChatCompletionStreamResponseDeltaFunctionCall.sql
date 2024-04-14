--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionStreamResponseDelta_function_call' definition.
--


--
-- SELECT template for table `ChatCompletionStreamResponseDelta_function_call`
--
SELECT `arguments`, `name` FROM `ChatCompletionStreamResponseDelta_function_call` WHERE 1;

--
-- INSERT template for table `ChatCompletionStreamResponseDelta_function_call`
--
INSERT INTO `ChatCompletionStreamResponseDelta_function_call`(`arguments`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionStreamResponseDelta_function_call`
--
UPDATE `ChatCompletionStreamResponseDelta_function_call` SET `arguments` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionStreamResponseDelta_function_call`
--
DELETE FROM `ChatCompletionStreamResponseDelta_function_call` WHERE 0;

