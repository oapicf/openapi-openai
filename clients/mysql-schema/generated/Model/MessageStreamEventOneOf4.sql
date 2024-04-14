--
-- OpenAI API.
-- Prepared SQL queries for 'MessageStreamEvent_oneOf_4' definition.
--


--
-- SELECT template for table `MessageStreamEvent_oneOf_4`
--
SELECT `event`, `data` FROM `MessageStreamEvent_oneOf_4` WHERE 1;

--
-- INSERT template for table `MessageStreamEvent_oneOf_4`
--
INSERT INTO `MessageStreamEvent_oneOf_4`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `MessageStreamEvent_oneOf_4`
--
UPDATE `MessageStreamEvent_oneOf_4` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `MessageStreamEvent_oneOf_4`
--
DELETE FROM `MessageStreamEvent_oneOf_4` WHERE 0;

