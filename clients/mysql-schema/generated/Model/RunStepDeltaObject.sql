--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaObject' definition.
--


--
-- SELECT template for table `RunStepDeltaObject`
--
SELECT `id`, `object`, `delta` FROM `RunStepDeltaObject` WHERE 1;

--
-- INSERT template for table `RunStepDeltaObject`
--
INSERT INTO `RunStepDeltaObject`(`id`, `object`, `delta`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunStepDeltaObject`
--
UPDATE `RunStepDeltaObject` SET `id` = ?, `object` = ?, `delta` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaObject`
--
DELETE FROM `RunStepDeltaObject` WHERE 0;

