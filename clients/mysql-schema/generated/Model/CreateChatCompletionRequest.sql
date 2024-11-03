--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionRequest' definition.
--


--
-- SELECT template for table `CreateChatCompletionRequest`
--
SELECT `messages`, `model`, `frequency_penalty`, `logit_bias`, `logprobs`, `top_logprobs`, `max_tokens`, `n`, `presence_penalty`, `response_format`, `seed`, `stop`, `stream`, `temperature`, `top_p`, `tools`, `tool_choice`, `user`, `function_call`, `functions` FROM `CreateChatCompletionRequest` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionRequest`
--
INSERT INTO `CreateChatCompletionRequest`(`messages`, `model`, `frequency_penalty`, `logit_bias`, `logprobs`, `top_logprobs`, `max_tokens`, `n`, `presence_penalty`, `response_format`, `seed`, `stop`, `stream`, `temperature`, `top_p`, `tools`, `tool_choice`, `user`, `function_call`, `functions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionRequest`
--
UPDATE `CreateChatCompletionRequest` SET `messages` = ?, `model` = ?, `frequency_penalty` = ?, `logit_bias` = ?, `logprobs` = ?, `top_logprobs` = ?, `max_tokens` = ?, `n` = ?, `presence_penalty` = ?, `response_format` = ?, `seed` = ?, `stop` = ?, `stream` = ?, `temperature` = ?, `top_p` = ?, `tools` = ?, `tool_choice` = ?, `user` = ?, `function_call` = ?, `functions` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionRequest`
--
DELETE FROM `CreateChatCompletionRequest` WHERE 0;

