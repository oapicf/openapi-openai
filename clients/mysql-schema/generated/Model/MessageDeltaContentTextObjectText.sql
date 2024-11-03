--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaContentTextObject_text' definition.
--


--
-- SELECT template for table `MessageDeltaContentTextObject_text`
--
SELECT `value`, `annotations` FROM `MessageDeltaContentTextObject_text` WHERE 1;

--
-- INSERT template for table `MessageDeltaContentTextObject_text`
--
INSERT INTO `MessageDeltaContentTextObject_text`(`value`, `annotations`) VALUES (?, ?);

--
-- UPDATE template for table `MessageDeltaContentTextObject_text`
--
UPDATE `MessageDeltaContentTextObject_text` SET `value` = ?, `annotations` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaContentTextObject_text`
--
DELETE FROM `MessageDeltaContentTextObject_text` WHERE 0;

