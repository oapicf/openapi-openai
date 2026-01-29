--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaContentImageFileObject' definition.
--


--
-- SELECT template for table `MessageDeltaContentImageFileObject`
--
SELECT `index`, `type`, `image_file` FROM `MessageDeltaContentImageFileObject` WHERE 1;

--
-- INSERT template for table `MessageDeltaContentImageFileObject`
--
INSERT INTO `MessageDeltaContentImageFileObject`(`index`, `type`, `image_file`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MessageDeltaContentImageFileObject`
--
UPDATE `MessageDeltaContentImageFileObject` SET `index` = ?, `type` = ?, `image_file` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaContentImageFileObject`
--
DELETE FROM `MessageDeltaContentImageFileObject` WHERE 0;

