--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionStreamResponse_choices_inner' definition.
--


--
-- SELECT template for table `CreateChatCompletionStreamResponse_choices_inner`
--
SELECT `index`, `delta`, `finish_reason` FROM `CreateChatCompletionStreamResponse_choices_inner` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionStreamResponse_choices_inner`
--
INSERT INTO `CreateChatCompletionStreamResponse_choices_inner`(`index`, `delta`, `finish_reason`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionStreamResponse_choices_inner`
--
UPDATE `CreateChatCompletionStreamResponse_choices_inner` SET `index` = ?, `delta` = ?, `finish_reason` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionStreamResponse_choices_inner`
--
DELETE FROM `CreateChatCompletionStreamResponse_choices_inner` WHERE 0;

