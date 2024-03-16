--
-- OpenAI API.
-- Prepared SQL queries for 'CreateChatCompletionRequest' definition.
--


--
-- SELECT template for table `CreateChatCompletionRequest`
--
SELECT `model`, `messages`, `functions`, `function_call`, `temperature`, `top_p`, `n`, `stream`, `stop`, `max_tokens`, `presence_penalty`, `frequency_penalty`, `logit_bias`, `user` FROM `CreateChatCompletionRequest` WHERE 1;

--
-- INSERT template for table `CreateChatCompletionRequest`
--
INSERT INTO `CreateChatCompletionRequest`(`model`, `messages`, `functions`, `function_call`, `temperature`, `top_p`, `n`, `stream`, `stop`, `max_tokens`, `presence_penalty`, `frequency_penalty`, `logit_bias`, `user`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateChatCompletionRequest`
--
UPDATE `CreateChatCompletionRequest` SET `model` = ?, `messages` = ?, `functions` = ?, `function_call` = ?, `temperature` = ?, `top_p` = ?, `n` = ?, `stream` = ?, `stop` = ?, `max_tokens` = ?, `presence_penalty` = ?, `frequency_penalty` = ?, `logit_bias` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CreateChatCompletionRequest`
--
DELETE FROM `CreateChatCompletionRequest` WHERE 0;

