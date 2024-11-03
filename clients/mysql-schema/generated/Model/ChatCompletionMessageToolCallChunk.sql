--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionMessageToolCallChunk' definition.
--


--
-- SELECT template for table `ChatCompletionMessageToolCallChunk`
--
SELECT `index`, `id`, `type`, `function` FROM `ChatCompletionMessageToolCallChunk` WHERE 1;

--
-- INSERT template for table `ChatCompletionMessageToolCallChunk`
--
INSERT INTO `ChatCompletionMessageToolCallChunk`(`index`, `id`, `type`, `function`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ChatCompletionMessageToolCallChunk`
--
UPDATE `ChatCompletionMessageToolCallChunk` SET `index` = ?, `id` = ?, `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionMessageToolCallChunk`
--
DELETE FROM `ChatCompletionMessageToolCallChunk` WHERE 0;

