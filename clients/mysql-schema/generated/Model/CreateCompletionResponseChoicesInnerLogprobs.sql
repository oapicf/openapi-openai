--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionResponse_choices_inner_logprobs' definition.
--


--
-- SELECT template for table `CreateCompletionResponse_choices_inner_logprobs`
--
SELECT `tokens`, `token_logprobs`, `top_logprobs`, `text_offset` FROM `CreateCompletionResponse_choices_inner_logprobs` WHERE 1;

--
-- INSERT template for table `CreateCompletionResponse_choices_inner_logprobs`
--
INSERT INTO `CreateCompletionResponse_choices_inner_logprobs`(`tokens`, `token_logprobs`, `top_logprobs`, `text_offset`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateCompletionResponse_choices_inner_logprobs`
--
UPDATE `CreateCompletionResponse_choices_inner_logprobs` SET `tokens` = ?, `token_logprobs` = ?, `top_logprobs` = ?, `text_offset` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionResponse_choices_inner_logprobs`
--
DELETE FROM `CreateCompletionResponse_choices_inner_logprobs` WHERE 0;

