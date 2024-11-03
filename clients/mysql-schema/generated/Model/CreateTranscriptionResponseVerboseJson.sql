--
-- OpenAI API.
-- Prepared SQL queries for 'CreateTranscriptionResponseVerboseJson' definition.
--


--
-- SELECT template for table `CreateTranscriptionResponseVerboseJson`
--
SELECT `language`, `duration`, `text`, `words`, `segments` FROM `CreateTranscriptionResponseVerboseJson` WHERE 1;

--
-- INSERT template for table `CreateTranscriptionResponseVerboseJson`
--
INSERT INTO `CreateTranscriptionResponseVerboseJson`(`language`, `duration`, `text`, `words`, `segments`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateTranscriptionResponseVerboseJson`
--
UPDATE `CreateTranscriptionResponseVerboseJson` SET `language` = ?, `duration` = ?, `text` = ?, `words` = ?, `segments` = ? WHERE 1;

--
-- DELETE template for table `CreateTranscriptionResponseVerboseJson`
--
DELETE FROM `CreateTranscriptionResponseVerboseJson` WHERE 0;

