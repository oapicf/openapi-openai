--
-- OpenAI API.
-- Prepared SQL queries for 'CreateSpeechRequest' definition.
--


--
-- SELECT template for table `CreateSpeechRequest`
--
SELECT `model`, `input`, `voice`, `response_format`, `speed` FROM `CreateSpeechRequest` WHERE 1;

--
-- INSERT template for table `CreateSpeechRequest`
--
INSERT INTO `CreateSpeechRequest`(`model`, `input`, `voice`, `response_format`, `speed`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateSpeechRequest`
--
UPDATE `CreateSpeechRequest` SET `model` = ?, `input` = ?, `voice` = ?, `response_format` = ?, `speed` = ? WHERE 1;

--
-- DELETE template for table `CreateSpeechRequest`
--
DELETE FROM `CreateSpeechRequest` WHERE 0;

