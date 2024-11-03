--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaContentTextObject' definition.
--


--
-- SELECT template for table `MessageDeltaContentTextObject`
--
SELECT `index`, `type`, `text` FROM `MessageDeltaContentTextObject` WHERE 1;

--
-- INSERT template for table `MessageDeltaContentTextObject`
--
INSERT INTO `MessageDeltaContentTextObject`(`index`, `type`, `text`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MessageDeltaContentTextObject`
--
UPDATE `MessageDeltaContentTextObject` SET `index` = ?, `type` = ?, `text` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaContentTextObject`
--
DELETE FROM `MessageDeltaContentTextObject` WHERE 0;

