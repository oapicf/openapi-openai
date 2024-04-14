--
-- OpenAI API.
-- Prepared SQL queries for 'TranscriptionWord' definition.
--


--
-- SELECT template for table `TranscriptionWord`
--
SELECT `word`, `start`, `end` FROM `TranscriptionWord` WHERE 1;

--
-- INSERT template for table `TranscriptionWord`
--
INSERT INTO `TranscriptionWord`(`word`, `start`, `end`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TranscriptionWord`
--
UPDATE `TranscriptionWord` SET `word` = ?, `start` = ?, `end` = ? WHERE 1;

--
-- DELETE template for table `TranscriptionWord`
--
DELETE FROM `TranscriptionWord` WHERE 0;

