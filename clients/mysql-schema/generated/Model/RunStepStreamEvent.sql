--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepStreamEvent' definition.
--


--
-- SELECT template for table `RunStepStreamEvent`
--
SELECT `event`, `data` FROM `RunStepStreamEvent` WHERE 1;

--
-- INSERT template for table `RunStepStreamEvent`
--
INSERT INTO `RunStepStreamEvent`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepStreamEvent`
--
UPDATE `RunStepStreamEvent` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `RunStepStreamEvent`
--
DELETE FROM `RunStepStreamEvent` WHERE 0;

