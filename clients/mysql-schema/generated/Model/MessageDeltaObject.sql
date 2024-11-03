--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaObject' definition.
--


--
-- SELECT template for table `MessageDeltaObject`
--
SELECT `id`, `object`, `delta` FROM `MessageDeltaObject` WHERE 1;

--
-- INSERT template for table `MessageDeltaObject`
--
INSERT INTO `MessageDeltaObject`(`id`, `object`, `delta`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MessageDeltaObject`
--
UPDATE `MessageDeltaObject` SET `id` = ?, `object` = ?, `delta` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaObject`
--
DELETE FROM `MessageDeltaObject` WHERE 0;

