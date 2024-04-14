--
-- OpenAI API.
-- Prepared SQL queries for 'ChatCompletionRequestMessageContentPartImage_image_url' definition.
--


--
-- SELECT template for table `ChatCompletionRequestMessageContentPartImage_image_url`
--
SELECT `url`, `detail` FROM `ChatCompletionRequestMessageContentPartImage_image_url` WHERE 1;

--
-- INSERT template for table `ChatCompletionRequestMessageContentPartImage_image_url`
--
INSERT INTO `ChatCompletionRequestMessageContentPartImage_image_url`(`url`, `detail`) VALUES (?, ?);

--
-- UPDATE template for table `ChatCompletionRequestMessageContentPartImage_image_url`
--
UPDATE `ChatCompletionRequestMessageContentPartImage_image_url` SET `url` = ?, `detail` = ? WHERE 1;

--
-- DELETE template for table `ChatCompletionRequestMessageContentPartImage_image_url`
--
DELETE FROM `ChatCompletionRequestMessageContentPartImage_image_url` WHERE 0;

