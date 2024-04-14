--
-- OpenAI API.
-- Prepared SQL queries for 'MessageStreamEvent_oneOf_2' definition.
--


--
-- SELECT template for table `MessageStreamEvent_oneOf_2`
--
SELECT `event`, `data` FROM `MessageStreamEvent_oneOf_2` WHERE 1;

--
-- INSERT template for table `MessageStreamEvent_oneOf_2`
--
INSERT INTO `MessageStreamEvent_oneOf_2`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `MessageStreamEvent_oneOf_2`
--
UPDATE `MessageStreamEvent_oneOf_2` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `MessageStreamEvent_oneOf_2`
--
DELETE FROM `MessageStreamEvent_oneOf_2` WHERE 0;

