--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionRequest' definition.
--


--
-- SELECT template for table `CreateCompletionRequest`
--
SELECT `model`, `prompt`, `suffix`, `max_tokens`, `temperature`, `top_p`, `n`, `stream`, `logprobs`, `echo`, `stop`, `presence_penalty`, `frequency_penalty`, `best_of`, `logit_bias`, `user` FROM `CreateCompletionRequest` WHERE 1;

--
-- INSERT template for table `CreateCompletionRequest`
--
INSERT INTO `CreateCompletionRequest`(`model`, `prompt`, `suffix`, `max_tokens`, `temperature`, `top_p`, `n`, `stream`, `logprobs`, `echo`, `stop`, `presence_penalty`, `frequency_penalty`, `best_of`, `logit_bias`, `user`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateCompletionRequest`
--
UPDATE `CreateCompletionRequest` SET `model` = ?, `prompt` = ?, `suffix` = ?, `max_tokens` = ?, `temperature` = ?, `top_p` = ?, `n` = ?, `stream` = ?, `logprobs` = ?, `echo` = ?, `stop` = ?, `presence_penalty` = ?, `frequency_penalty` = ?, `best_of` = ?, `logit_bias` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionRequest`
--
DELETE FROM `CreateCompletionRequest` WHERE 0;

