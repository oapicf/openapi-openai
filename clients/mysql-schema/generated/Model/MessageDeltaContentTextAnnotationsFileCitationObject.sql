--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaContentTextAnnotationsFileCitationObject' definition.
--


--
-- SELECT template for table `MessageDeltaContentTextAnnotationsFileCitationObject`
--
SELECT `index`, `type`, `text`, `file_citation`, `start_index`, `end_index` FROM `MessageDeltaContentTextAnnotationsFileCitationObject` WHERE 1;

--
-- INSERT template for table `MessageDeltaContentTextAnnotationsFileCitationObject`
--
INSERT INTO `MessageDeltaContentTextAnnotationsFileCitationObject`(`index`, `type`, `text`, `file_citation`, `start_index`, `end_index`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MessageDeltaContentTextAnnotationsFileCitationObject`
--
UPDATE `MessageDeltaContentTextAnnotationsFileCitationObject` SET `index` = ?, `type` = ?, `text` = ?, `file_citation` = ?, `start_index` = ?, `end_index` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaContentTextAnnotationsFileCitationObject`
--
DELETE FROM `MessageDeltaContentTextAnnotationsFileCitationObject` WHERE 0;

