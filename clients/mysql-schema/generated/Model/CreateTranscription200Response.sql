--
-- OpenAI API.
-- Prepared SQL queries for 'createTranscription_200_response' definition.
--


--
-- SELECT template for table `createTranscription_200_response`
--
SELECT `text`, `language`, `duration`, `words`, `segments` FROM `createTranscription_200_response` WHERE 1;

--
-- INSERT template for table `createTranscription_200_response`
--
INSERT INTO `createTranscription_200_response`(`text`, `language`, `duration`, `words`, `segments`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `createTranscription_200_response`
--
UPDATE `createTranscription_200_response` SET `text` = ?, `language` = ?, `duration` = ?, `words` = ?, `segments` = ? WHERE 1;

--
-- DELETE template for table `createTranscription_200_response`
--
DELETE FROM `createTranscription_200_response` WHERE 0;

