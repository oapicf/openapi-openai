--
-- OpenAI API.
-- Prepared SQL queries for 'MessageContentTextObject' definition.
--


--
-- SELECT template for table `MessageContentTextObject`
--
SELECT `type`, `text` FROM `MessageContentTextObject` WHERE 1;

--
-- INSERT template for table `MessageContentTextObject`
--
INSERT INTO `MessageContentTextObject`(`type`, `text`) VALUES (?, ?);

--
-- UPDATE template for table `MessageContentTextObject`
--
UPDATE `MessageContentTextObject` SET `type` = ?, `text` = ? WHERE 1;

--
-- DELETE template for table `MessageContentTextObject`
--
DELETE FROM `MessageContentTextObject` WHERE 0;

