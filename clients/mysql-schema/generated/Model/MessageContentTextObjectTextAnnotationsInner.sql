--
-- OpenAI API.
-- Prepared SQL queries for 'MessageContentTextObject_text_annotations_inner' definition.
--


--
-- SELECT template for table `MessageContentTextObject_text_annotations_inner`
--
SELECT `type`, `text`, `file_citation`, `start_index`, `end_index`, `file_path` FROM `MessageContentTextObject_text_annotations_inner` WHERE 1;

--
-- INSERT template for table `MessageContentTextObject_text_annotations_inner`
--
INSERT INTO `MessageContentTextObject_text_annotations_inner`(`type`, `text`, `file_citation`, `start_index`, `end_index`, `file_path`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MessageContentTextObject_text_annotations_inner`
--
UPDATE `MessageContentTextObject_text_annotations_inner` SET `type` = ?, `text` = ?, `file_citation` = ?, `start_index` = ?, `end_index` = ?, `file_path` = ? WHERE 1;

--
-- DELETE template for table `MessageContentTextObject_text_annotations_inner`
--
DELETE FROM `MessageContentTextObject_text_annotations_inner` WHERE 0;

