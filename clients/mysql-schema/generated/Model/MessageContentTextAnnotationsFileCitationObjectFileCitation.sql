--
-- OpenAI API.
-- Prepared SQL queries for 'MessageContentTextAnnotationsFileCitationObject_file_citation' definition.
--


--
-- SELECT template for table `MessageContentTextAnnotationsFileCitationObject_file_citation`
--
SELECT `file_id`, `quote` FROM `MessageContentTextAnnotationsFileCitationObject_file_citation` WHERE 1;

--
-- INSERT template for table `MessageContentTextAnnotationsFileCitationObject_file_citation`
--
INSERT INTO `MessageContentTextAnnotationsFileCitationObject_file_citation`(`file_id`, `quote`) VALUES (?, ?);

--
-- UPDATE template for table `MessageContentTextAnnotationsFileCitationObject_file_citation`
--
UPDATE `MessageContentTextAnnotationsFileCitationObject_file_citation` SET `file_id` = ?, `quote` = ? WHERE 1;

--
-- DELETE template for table `MessageContentTextAnnotationsFileCitationObject_file_citation`
--
DELETE FROM `MessageContentTextAnnotationsFileCitationObject_file_citation` WHERE 0;

