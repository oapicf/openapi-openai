--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionFunctionResponse_choices_inner' definition.
--


--
-- SELECT template for table `CreateChatCompletionFunctionResponse_choices_inner`
--
SELECT `finish_reason`, `index`, `message` FROM `CreateChatCompletionFunctionResponse_choices_inner` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionFunctionResponse_choices_inner`
--
INSERT INTO `CreateChatCompletionFunctionResponse_choices_inner`(`finish_reason`, `index`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionFunctionResponse_choices_inner`
--
UPDATE `CreateChatCompletionFunctionResponse_choices_inner` SET `finish_reason` = ?, `index` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionFunctionResponse_choices_inner`
--
DELETE FROM `CreateChatCompletionFunctionResponse_choices_inner` WHERE 0;

