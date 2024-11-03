--
-- OpenAI API.
-- Prepared SQL queries for 'CreateTranslationResponseVerboseJson' definition.
--


--
-- SELECT template for table `CreateTranslationResponseVerboseJson`
--
SELECT `language`, `duration`, `text`, `segments` FROM `CreateTranslationResponseVerboseJson` WHERE 1;

--
-- INSERT template for table `CreateTranslationResponseVerboseJson`
--
INSERT INTO `CreateTranslationResponseVerboseJson`(`language`, `duration`, `text`, `segments`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateTranslationResponseVerboseJson`
--
UPDATE `CreateTranslationResponseVerboseJson` SET `language` = ?, `duration` = ?, `text` = ?, `segments` = ? WHERE 1;

--
-- DELETE template for table `CreateTranslationResponseVerboseJson`
--
DELETE FROM `CreateTranslationResponseVerboseJson` WHERE 0;

