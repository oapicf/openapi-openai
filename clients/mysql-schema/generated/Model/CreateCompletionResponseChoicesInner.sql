--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionResponse_choices_inner' definition.
--


--
-- SELECT template for table `CreateCompletionResponse_choices_inner`
--
SELECT `text`, `index`, `logprobs`, `finish_reason` FROM `CreateCompletionResponse_choices_inner` WHERE 1;

--
-- INSERT template for table `CreateCompletionResponse_choices_inner`
--
INSERT INTO `CreateCompletionResponse_choices_inner`(`text`, `index`, `logprobs`, `finish_reason`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateCompletionResponse_choices_inner`
--
UPDATE `CreateCompletionResponse_choices_inner` SET `text` = ?, `index` = ?, `logprobs` = ?, `finish_reason` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionResponse_choices_inner`
--
DELETE FROM `CreateCompletionResponse_choices_inner` WHERE 0;

