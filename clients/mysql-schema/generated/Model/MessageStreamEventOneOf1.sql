--
-- OpenAI API.
-- Prepared SQL queries for 'MessageStreamEvent_oneOf_1' definition.
--


--
-- SELECT template for table `MessageStreamEvent_oneOf_1`
--
SELECT `event`, `data` FROM `MessageStreamEvent_oneOf_1` WHERE 1;

--
-- INSERT template for table `MessageStreamEvent_oneOf_1`
--
INSERT INTO `MessageStreamEvent_oneOf_1`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `MessageStreamEvent_oneOf_1`
--
UPDATE `MessageStreamEvent_oneOf_1` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `MessageStreamEvent_oneOf_1`
--
DELETE FROM `MessageStreamEvent_oneOf_1` WHERE 0;

