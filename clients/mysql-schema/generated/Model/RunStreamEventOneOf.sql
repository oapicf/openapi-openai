--
-- OpenAI API.
-- Prepared SQL queries for 'RunStreamEvent_oneOf' definition.
--


--
-- SELECT template for table `RunStreamEvent_oneOf`
--
SELECT `event`, `data` FROM `RunStreamEvent_oneOf` WHERE 1;

--
-- INSERT template for table `RunStreamEvent_oneOf`
--
INSERT INTO `RunStreamEvent_oneOf`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `RunStreamEvent_oneOf`
--
UPDATE `RunStreamEvent_oneOf` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `RunStreamEvent_oneOf`
--
DELETE FROM `RunStreamEvent_oneOf` WHERE 0;

