--
-- OpenAI API.
-- Prepared SQL queries for 'MessageStreamEvent' definition.
--


--
-- SELECT template for table `MessageStreamEvent`
--
SELECT `event`, `data` FROM `MessageStreamEvent` WHERE 1;

--
-- INSERT template for table `MessageStreamEvent`
--
INSERT INTO `MessageStreamEvent`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `MessageStreamEvent`
--
UPDATE `MessageStreamEvent` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `MessageStreamEvent`
--
DELETE FROM `MessageStreamEvent` WHERE 0;

