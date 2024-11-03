--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionMessageToolCallChunk_function' definition.
--


--
-- SELECT template for table `ChatCompletionMessageToolCallChunk_function`
--
SELECT `name`, `arguments` FROM `ChatCompletionMessageToolCallChunk_function` WHERE 1;

--
-- INSERT template for table `ChatCompletionMessageToolCallChunk_function`
--
INSERT INTO `ChatCompletionMessageToolCallChunk_function`(`name`, `arguments`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionMessageToolCallChunk_function`
--
UPDATE `ChatCompletionMessageToolCallChunk_function` SET `name` = ?, `arguments` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionMessageToolCallChunk_function`
--
DELETE FROM `ChatCompletionMessageToolCallChunk_function` WHERE 0;

