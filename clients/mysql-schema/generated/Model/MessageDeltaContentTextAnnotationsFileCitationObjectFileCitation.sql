--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaContentTextAnnotationsFileCitationObject_file_citation' definition.
--


--
-- SELECT template for table `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati`
--
SELECT `file_id`, `quote` FROM `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati` WHERE 1;

--
-- INSERT template for table `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati`
--
INSERT INTO `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati`(`file_id`, `quote`) VALUES (?, ?);

--
-- UPDATE template for table `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati`
--
UPDATE `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati` SET `file_id` = ?, `quote` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati`
--
DELETE FROM `MessageDeltaContentTextAnnotationsFileCitationObject_file_citati` WHERE 0;

