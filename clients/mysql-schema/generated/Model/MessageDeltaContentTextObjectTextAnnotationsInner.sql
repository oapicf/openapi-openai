--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaContentTextObject_text_annotations_inner' definition.
--


--
-- SELECT template for table `MessageDeltaContentTextObject_text_annotations_inner`
--
SELECT `index`, `type`, `text`, `file_citation`, `start_index`, `end_index`, `file_path` FROM `MessageDeltaContentTextObject_text_annotations_inner` WHERE 1;

--
-- INSERT template for table `MessageDeltaContentTextObject_text_annotations_inner`
--
INSERT INTO `MessageDeltaContentTextObject_text_annotations_inner`(`index`, `type`, `text`, `file_citation`, `start_index`, `end_index`, `file_path`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MessageDeltaContentTextObject_text_annotations_inner`
--
UPDATE `MessageDeltaContentTextObject_text_annotations_inner` SET `index` = ?, `type` = ?, `text` = ?, `file_citation` = ?, `start_index` = ?, `end_index` = ?, `file_path` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaContentTextObject_text_annotations_inner`
--
DELETE FROM `MessageDeltaContentTextObject_text_annotations_inner` WHERE 0;

