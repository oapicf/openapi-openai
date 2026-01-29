--
-- OpenAI API.
-- Prepared SQL queries for 'TruncationObject' definition.
--


--
-- SELECT template for table `TruncationObject`
--
SELECT `type`, `last_messages` FROM `TruncationObject` WHERE 1;

--
-- INSERT template for table `TruncationObject`
--
INSERT INTO `TruncationObject`(`type`, `last_messages`) VALUES (?, ?);

--
-- UPDATE template for table `TruncationObject`
--
UPDATE `TruncationObject` SET `type` = ?, `last_messages` = ? WHERE 1;

--
-- DELETE template for table `TruncationObject`
--
DELETE FROM `TruncationObject` WHERE 0;

