--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaContentTextAnnotationsFilePathObject' definition.
--


--
-- SELECT template for table `MessageDeltaContentTextAnnotationsFilePathObject`
--
SELECT `index`, `type`, `text`, `file_path`, `start_index`, `end_index` FROM `MessageDeltaContentTextAnnotationsFilePathObject` WHERE 1;

--
-- INSERT template for table `MessageDeltaContentTextAnnotationsFilePathObject`
--
INSERT INTO `MessageDeltaContentTextAnnotationsFilePathObject`(`index`, `type`, `text`, `file_path`, `start_index`, `end_index`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MessageDeltaContentTextAnnotationsFilePathObject`
--
UPDATE `MessageDeltaContentTextAnnotationsFilePathObject` SET `index` = ?, `type` = ?, `text` = ?, `file_path` = ?, `start_index` = ?, `end_index` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaContentTextAnnotationsFilePathObject`
--
DELETE FROM `MessageDeltaContentTextAnnotationsFilePathObject` WHERE 0;

