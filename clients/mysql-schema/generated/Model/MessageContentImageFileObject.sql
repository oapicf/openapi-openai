--
-- OpenAI API.
-- Prepared SQL queries for 'MessageContentImageFileObject' definition.
--


--
-- SELECT template for table `MessageContentImageFileObject`
--
SELECT `type`, `image_file` FROM `MessageContentImageFileObject` WHERE 1;

--
-- INSERT template for table `MessageContentImageFileObject`
--
INSERT INTO `MessageContentImageFileObject`(`type`, `image_file`) VALUES (?, ?);

--
-- UPDATE template for table `MessageContentImageFileObject`
--
UPDATE `MessageContentImageFileObject` SET `type` = ?, `image_file` = ? WHERE 1;

--
-- DELETE template for table `MessageContentImageFileObject`
--
DELETE FROM `MessageContentImageFileObject` WHERE 0;

