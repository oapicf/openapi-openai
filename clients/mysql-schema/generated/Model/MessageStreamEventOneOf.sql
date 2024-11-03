--
-- OpenAI API.
-- Prepared SQL queries for 'MessageStreamEvent_oneOf' definition.
--


--
-- SELECT template for table `MessageStreamEvent_oneOf`
--
SELECT `event`, `data` FROM `MessageStreamEvent_oneOf` WHERE 1;

--
-- INSERT template for table `MessageStreamEvent_oneOf`
--
INSERT INTO `MessageStreamEvent_oneOf`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `MessageStreamEvent_oneOf`
--
UPDATE `MessageStreamEvent_oneOf` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `MessageStreamEvent_oneOf`
--
DELETE FROM `MessageStreamEvent_oneOf` WHERE 0;

