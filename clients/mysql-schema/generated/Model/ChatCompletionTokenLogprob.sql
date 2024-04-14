--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionTokenLogprob' definition.
--


--
-- SELECT template for table `ChatCompletionTokenLogprob`
--
SELECT `token`, `logprob`, `bytes`, `top_logprobs` FROM `ChatCompletionTokenLogprob` WHERE 1;

--
-- INSERT template for table `ChatCompletionTokenLogprob`
--
INSERT INTO `ChatCompletionTokenLogprob`(`token`, `logprob`, `bytes`, `top_logprobs`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ChatCompletionTokenLogprob`
--
UPDATE `ChatCompletionTokenLogprob` SET `token` = ?, `logprob` = ?, `bytes` = ?, `top_logprobs` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionTokenLogprob`
--
DELETE FROM `ChatCompletionTokenLogprob` WHERE 0;

