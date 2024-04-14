--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDeltaStepDetailsMessageCreationObject' definition.
--


--
-- SELECT template for table `RunStepDeltaStepDetailsMessageCreationObject`
--
SELECT `type`, `message_creation` FROM `RunStepDeltaStepDetailsMessageCreationObject` WHERE 1;

--
-- INSERT template for table `RunStepDeltaStepDetailsMessageCreationObject`
--
INSERT INTO `RunStepDeltaStepDetailsMessageCreationObject`(`type`, `message_creation`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepDeltaStepDetailsMessageCreationObject`
--
UPDATE `RunStepDeltaStepDetailsMessageCreationObject` SET `type` = ?, `message_creation` = ? WHERE 1;

--
-- DELETE template for table `RunStepDeltaStepDetailsMessageCreationObject`
--
DELETE FROM `RunStepDeltaStepDetailsMessageCreationObject` WHERE 0;

