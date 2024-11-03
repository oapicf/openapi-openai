--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionResponse_choices_inner' definition.
--


--
-- SELECT template for table `CreateChatCompletionResponse_choices_inner`
--
SELECT `finish_reason`, `index`, `message`, `logprobs` FROM `CreateChatCompletionResponse_choices_inner` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionResponse_choices_inner`
--
INSERT INTO `CreateChatCompletionResponse_choices_inner`(`finish_reason`, `index`, `message`, `logprobs`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionResponse_choices_inner`
--
UPDATE `CreateChatCompletionResponse_choices_inner` SET `finish_reason` = ?, `index` = ?, `message` = ?, `logprobs` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionResponse_choices_inner`
--
DELETE FROM `CreateChatCompletionResponse_choices_inner` WHERE 0;

