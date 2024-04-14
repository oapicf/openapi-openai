--
-- OpenAI API.
-- Prepared SQL queries for 'ThreadStreamEvent_oneOf' definition.
--


--
-- SELECT template for table `ThreadStreamEvent_oneOf`
--
SELECT `event`, `data` FROM `ThreadStreamEvent_oneOf` WHERE 1;

--
-- INSERT template for table `ThreadStreamEvent_oneOf`
--
INSERT INTO `ThreadStreamEvent_oneOf`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `ThreadStreamEvent_oneOf`
--
UPDATE `ThreadStreamEvent_oneOf` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `ThreadStreamEvent_oneOf`
--
DELETE FROM `ThreadStreamEvent_oneOf` WHERE 0;

