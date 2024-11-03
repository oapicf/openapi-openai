--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaObject_delta' definition.
--


--
-- SELECT template for table `MessageDeltaObject_delta`
--
SELECT `role`, `content`, `file_ids` FROM `MessageDeltaObject_delta` WHERE 1;

--
-- INSERT template for table `MessageDeltaObject_delta`
--
INSERT INTO `MessageDeltaObject_delta`(`role`, `content`, `file_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MessageDeltaObject_delta`
--
UPDATE `MessageDeltaObject_delta` SET `role` = ?, `content` = ?, `file_ids` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaObject_delta`
--
DELETE FROM `MessageDeltaObject_delta` WHERE 0;

