--
-- OpenAI API.
-- Prepared SQL queries for 'ThreadStreamEvent' definition.
--


--
-- SELECT template for table `ThreadStreamEvent`
--
SELECT `event`, `data` FROM `ThreadStreamEvent` WHERE 1;

--
-- INSERT template for table `ThreadStreamEvent`
--
INSERT INTO `ThreadStreamEvent`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `ThreadStreamEvent`
--
UPDATE `ThreadStreamEvent` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `ThreadStreamEvent`
--
DELETE FROM `ThreadStreamEvent` WHERE 0;

