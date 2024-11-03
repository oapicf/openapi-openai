--
-- OpenAI API.
-- Prepared SQL queries for 'RunStreamEvent_oneOf_1' definition.
--


--
-- SELECT template for table `RunStreamEvent_oneOf_1`
--
SELECT `event`, `data` FROM `RunStreamEvent_oneOf_1` WHERE 1;

--
-- INSERT template for table `RunStreamEvent_oneOf_1`
--
INSERT INTO `RunStreamEvent_oneOf_1`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `RunStreamEvent_oneOf_1`
--
UPDATE `RunStreamEvent_oneOf_1` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `RunStreamEvent_oneOf_1`
--
DELETE FROM `RunStreamEvent_oneOf_1` WHERE 0;

