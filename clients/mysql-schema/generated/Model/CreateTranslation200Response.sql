--
-- OpenAI API.
-- Prepared SQL queries for 'createTranslation_200_response' definition.
--


--
-- SELECT template for table `createTranslation_200_response`
--
SELECT `text`, `language`, `duration`, `segments` FROM `createTranslation_200_response` WHERE 1;

--
-- INSERT template for table `createTranslation_200_response`
--
INSERT INTO `createTranslation_200_response`(`text`, `language`, `duration`, `segments`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `createTranslation_200_response`
--
UPDATE `createTranslation_200_response` SET `text` = ?, `language` = ?, `duration` = ?, `segments` = ? WHERE 1;

--
-- DELETE template for table `createTranslation_200_response`
--
DELETE FROM `createTranslation_200_response` WHERE 0;

