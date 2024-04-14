--
-- OpenAI API.
-- Prepared SQL queries for 'MessageContentTextObject_text' definition.
--


--
-- SELECT template for table `MessageContentTextObject_text`
--
SELECT `value`, `annotations` FROM `MessageContentTextObject_text` WHERE 1;

--
-- INSERT template for table `MessageContentTextObject_text`
--
INSERT INTO `MessageContentTextObject_text`(`value`, `annotations`) VALUES (?, ?);

--
-- UPDATE template for table `MessageContentTextObject_text`
--
UPDATE `MessageContentTextObject_text` SET `value` = ?, `annotations` = ? WHERE 1;

--
-- DELETE template for table `MessageContentTextObject_text`
--
DELETE FROM `MessageContentTextObject_text` WHERE 0;

