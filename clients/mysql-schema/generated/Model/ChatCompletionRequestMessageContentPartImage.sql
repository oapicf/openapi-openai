--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestMessageContentPartImage' definition.
--


--
-- SELECT template for table `ChatCompletionRequestMessageContentPartImage`
--
SELECT `type`, `image_url` FROM `ChatCompletionRequestMessageContentPartImage` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestMessageContentPartImage`
--
INSERT INTO `ChatCompletionRequestMessageContentPartImage`(`type`, `image_url`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionRequestMessageContentPartImage`
--
UPDATE `ChatCompletionRequestMessageContentPartImage` SET `type` = ?, `image_url` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestMessageContentPartImage`
--
DELETE FROM `ChatCompletionRequestMessageContentPartImage` WHERE 0;

