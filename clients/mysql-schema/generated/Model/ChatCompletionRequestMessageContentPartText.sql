--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestMessageContentPartText' definition.
--


--
-- SELECT template for table `ChatCompletionRequestMessageContentPartText`
--
SELECT `type`, `text` FROM `ChatCompletionRequestMessageContentPartText` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestMessageContentPartText`
--
INSERT INTO `ChatCompletionRequestMessageContentPartText`(`type`, `text`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionRequestMessageContentPartText`
--
UPDATE `ChatCompletionRequestMessageContentPartText` SET `type` = ?, `text` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestMessageContentPartText`
--
DELETE FROM `ChatCompletionRequestMessageContentPartText` WHERE 0;

