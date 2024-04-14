--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionResponse_choices_inner' definition.
--


--
-- SELECT template for table `CreateCompletionResponse_choices_inner`
--
SELECT `finish_reason`, `index`, `logprobs`, `text` FROM `CreateCompletionResponse_choices_inner` WHERE 1;

--
-- INSERT template for table `CreateCompletionResponse_choices_inner`
--
INSERT INTO `CreateCompletionResponse_choices_inner`(`finish_reason`, `index`, `logprobs`, `text`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateCompletionResponse_choices_inner`
--
UPDATE `CreateCompletionResponse_choices_inner` SET `finish_reason` = ?, `index` = ?, `logprobs` = ?, `text` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionResponse_choices_inner`
--
DELETE FROM `CreateCompletionResponse_choices_inner` WHERE 0;

