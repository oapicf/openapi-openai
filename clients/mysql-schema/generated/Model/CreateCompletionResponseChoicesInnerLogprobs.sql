--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionResponse_choices_inner_logprobs' definition.
--


--
-- SELECT template for table `CreateCompletionResponse_choices_inner_logprobs`
--
SELECT `text_offset`, `token_logprobs`, `tokens`, `top_logprobs` FROM `CreateCompletionResponse_choices_inner_logprobs` WHERE 1;

--
-- INSERT template for table `CreateCompletionResponse_choices_inner_logprobs`
--
INSERT INTO `CreateCompletionResponse_choices_inner_logprobs`(`text_offset`, `token_logprobs`, `tokens`, `top_logprobs`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateCompletionResponse_choices_inner_logprobs`
--
UPDATE `CreateCompletionResponse_choices_inner_logprobs` SET `text_offset` = ?, `token_logprobs` = ?, `tokens` = ?, `top_logprobs` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionResponse_choices_inner_logprobs`
--
DELETE FROM `CreateCompletionResponse_choices_inner_logprobs` WHERE 0;

