--
-- OpenAI API.
-- Prepared SQL queries for 'MessageContentTextAnnotationsFileCitationObject' definition.
--


--
-- SELECT template for table `MessageContentTextAnnotationsFileCitationObject`
--
SELECT `type`, `text`, `file_citation`, `start_index`, `end_index` FROM `MessageContentTextAnnotationsFileCitationObject` WHERE 1;

--
-- INSERT template for table `MessageContentTextAnnotationsFileCitationObject`
--
INSERT INTO `MessageContentTextAnnotationsFileCitationObject`(`type`, `text`, `file_citation`, `start_index`, `end_index`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `MessageContentTextAnnotationsFileCitationObject`
--
UPDATE `MessageContentTextAnnotationsFileCitationObject` SET `type` = ?, `text` = ?, `file_citation` = ?, `start_index` = ?, `end_index` = ? WHERE 1;

--
-- DELETE template for table `MessageContentTextAnnotationsFileCitationObject`
--
DELETE FROM `MessageContentTextAnnotationsFileCitationObject` WHERE 0;

