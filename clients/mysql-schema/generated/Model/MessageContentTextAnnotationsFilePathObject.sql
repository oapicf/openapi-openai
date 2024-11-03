--
-- OpenAI API.
-- Prepared SQL queries for 'MessageContentTextAnnotationsFilePathObject' definition.
--


--
-- SELECT template for table `MessageContentTextAnnotationsFilePathObject`
--
SELECT `type`, `text`, `file_path`, `start_index`, `end_index` FROM `MessageContentTextAnnotationsFilePathObject` WHERE 1;

--
-- INSERT template for table `MessageContentTextAnnotationsFilePathObject`
--
INSERT INTO `MessageContentTextAnnotationsFilePathObject`(`type`, `text`, `file_path`, `start_index`, `end_index`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `MessageContentTextAnnotationsFilePathObject`
--
UPDATE `MessageContentTextAnnotationsFilePathObject` SET `type` = ?, `text` = ?, `file_path` = ?, `start_index` = ?, `end_index` = ? WHERE 1;

--
-- DELETE template for table `MessageContentTextAnnotationsFilePathObject`
--
DELETE FROM `MessageContentTextAnnotationsFilePathObject` WHERE 0;

