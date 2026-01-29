--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestMessageContentPart' definition.
--


--
-- SELECT template for table `ChatCompletionRequestMessageContentPart`
--
SELECT `type`, `text`, `image_url` FROM `ChatCompletionRequestMessageContentPart` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestMessageContentPart`
--
INSERT INTO `ChatCompletionRequestMessageContentPart`(`type`, `text`, `image_url`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ChatCompletionRequestMessageContentPart`
--
UPDATE `ChatCompletionRequestMessageContentPart` SET `type` = ?, `text` = ?, `image_url` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestMessageContentPart`
--
DELETE FROM `ChatCompletionRequestMessageContentPart` WHERE 0;

