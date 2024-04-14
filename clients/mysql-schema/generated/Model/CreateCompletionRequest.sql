--
-- OpenAI API.
-- Prepared SQL queries for 'CreateCompletionRequest' definition.
--


--
-- SELECT template for table `CreateCompletionRequest`
--
SELECT `model`, `prompt`, `best_of`, `echo`, `frequency_penalty`, `logit_bias`, `logprobs`, `max_tokens`, `n`, `presence_penalty`, `seed`, `stop`, `stream`, `suffix`, `temperature`, `top_p`, `user` FROM `CreateCompletionRequest` WHERE 1;

--
-- INSERT template for table `CreateCompletionRequest`
--
INSERT INTO `CreateCompletionRequest`(`model`, `prompt`, `best_of`, `echo`, `frequency_penalty`, `logit_bias`, `logprobs`, `max_tokens`, `n`, `presence_penalty`, `seed`, `stop`, `stream`, `suffix`, `temperature`, `top_p`, `user`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateCompletionRequest`
--
UPDATE `CreateCompletionRequest` SET `model` = ?, `prompt` = ?, `best_of` = ?, `echo` = ?, `frequency_penalty` = ?, `logit_bias` = ?, `logprobs` = ?, `max_tokens` = ?, `n` = ?, `presence_penalty` = ?, `seed` = ?, `stop` = ?, `stream` = ?, `suffix` = ?, `temperature` = ?, `top_p` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CreateCompletionRequest`
--
DELETE FROM `CreateCompletionRequest` WHERE 0;

