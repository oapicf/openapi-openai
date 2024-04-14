--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestToolMessage' definition.
--


--
-- SELECT template for table `ChatCompletionRequestToolMessage`
--
SELECT `role`, `content`, `tool_call_id` FROM `ChatCompletionRequestToolMessage` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestToolMessage`
--
INSERT INTO `ChatCompletionRequestToolMessage`(`role`, `content`, `tool_call_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionRequestToolMessage`
--
UPDATE `ChatCompletionRequestToolMessage` SET `role` = ?, `content` = ?, `tool_call_id` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestToolMessage`
--
DELETE FROM `ChatCompletionRequestToolMessage` WHERE 0;

