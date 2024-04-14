--
-- OpenAI API.
-- Prepared SQL queries for 'MessageObject_content_inner' definition.
--


--
-- SELECT template for table `MessageObject_content_inner`
--
SELECT `type`, `image_file`, `text` FROM `MessageObject_content_inner` WHERE 1;

--
-- INSERT template for table `MessageObject_content_inner`
--
INSERT INTO `MessageObject_content_inner`(`type`, `image_file`, `text`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MessageObject_content_inner`
--
UPDATE `MessageObject_content_inner` SET `type` = ?, `image_file` = ?, `text` = ? WHERE 1;

--
-- DELETE template for table `MessageObject_content_inner`
--
DELETE FROM `MessageObject_content_inner` WHERE 0;

