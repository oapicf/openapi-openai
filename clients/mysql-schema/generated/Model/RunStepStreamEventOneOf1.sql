--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepStreamEvent_oneOf_1' definition.
--


--
-- SELECT template for table `RunStepStreamEvent_oneOf_1`
--
SELECT `event`, `data` FROM `RunStepStreamEvent_oneOf_1` WHERE 1;

--
-- INSERT template for table `RunStepStreamEvent_oneOf_1`
--
INSERT INTO `RunStepStreamEvent_oneOf_1`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepStreamEvent_oneOf_1`
--
UPDATE `RunStepStreamEvent_oneOf_1` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `RunStepStreamEvent_oneOf_1`
--
DELETE FROM `RunStepStreamEvent_oneOf_1` WHERE 0;

