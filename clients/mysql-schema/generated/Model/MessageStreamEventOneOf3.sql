--
-- OpenAI API.
-- Prepared SQL queries for 'MessageStreamEvent_oneOf_3' definition.
--


--
-- SELECT template for table `MessageStreamEvent_oneOf_3`
--
SELECT `event`, `data` FROM `MessageStreamEvent_oneOf_3` WHERE 1;

--
-- INSERT template for table `MessageStreamEvent_oneOf_3`
--
INSERT INTO `MessageStreamEvent_oneOf_3`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `MessageStreamEvent_oneOf_3`
--
UPDATE `MessageStreamEvent_oneOf_3` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `MessageStreamEvent_oneOf_3`
--
DELETE FROM `MessageStreamEvent_oneOf_3` WHERE 0;

