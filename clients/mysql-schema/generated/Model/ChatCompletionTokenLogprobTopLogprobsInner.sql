--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionTokenLogprob_top_logprobs_inner' definition.
--


--
-- SELECT template for table `ChatCompletionTokenLogprob_top_logprobs_inner`
--
SELECT `token`, `logprob`, `bytes` FROM `ChatCompletionTokenLogprob_top_logprobs_inner` WHERE 1;

--
-- INSERT template for table `ChatCompletionTokenLogprob_top_logprobs_inner`
--
INSERT INTO `ChatCompletionTokenLogprob_top_logprobs_inner`(`token`, `logprob`, `bytes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionTokenLogprob_top_logprobs_inner`
--
UPDATE `ChatCompletionTokenLogprob_top_logprobs_inner` SET `token` = ?, `logprob` = ?, `bytes` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionTokenLogprob_top_logprobs_inner`
--
DELETE FROM `ChatCompletionTokenLogprob_top_logprobs_inner` WHERE 0;

