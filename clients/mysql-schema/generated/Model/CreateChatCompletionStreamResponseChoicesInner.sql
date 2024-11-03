--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionStreamResponse_choices_inner' definition.
--


--
-- SELECT template for table `CreateChatCompletionStreamResponse_choices_inner`
--
SELECT `delta`, `logprobs`, `finish_reason`, `index` FROM `CreateChatCompletionStreamResponse_choices_inner` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionStreamResponse_choices_inner`
--
INSERT INTO `CreateChatCompletionStreamResponse_choices_inner`(`delta`, `logprobs`, `finish_reason`, `index`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionStreamResponse_choices_inner`
--
UPDATE `CreateChatCompletionStreamResponse_choices_inner` SET `delta` = ?, `logprobs` = ?, `finish_reason` = ?, `index` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionStreamResponse_choices_inner`
--
DELETE FROM `CreateChatCompletionStreamResponse_choices_inner` WHERE 0;

