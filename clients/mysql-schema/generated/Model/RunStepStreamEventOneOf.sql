--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepStreamEvent_oneOf' definition.
--


--
-- SELECT template for table `RunStepStreamEvent_oneOf`
--
SELECT `event`, `data` FROM `RunStepStreamEvent_oneOf` WHERE 1;

--
-- INSERT template for table `RunStepStreamEvent_oneOf`
--
INSERT INTO `RunStepStreamEvent_oneOf`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepStreamEvent_oneOf`
--
UPDATE `RunStepStreamEvent_oneOf` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `RunStepStreamEvent_oneOf`
--
DELETE FROM `RunStepStreamEvent_oneOf` WHERE 0;

