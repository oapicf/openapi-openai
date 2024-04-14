--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsMessageCreationObject' definition.
--


--
-- SELECT template for table `RunStepDetailsMessageCreationObject`
--
SELECT `type`, `message_creation` FROM `RunStepDetailsMessageCreationObject` WHERE 1;

--
-- INSERT template for table `RunStepDetailsMessageCreationObject`
--
INSERT INTO `RunStepDetailsMessageCreationObject`(`type`, `message_creation`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepDetailsMessageCreationObject`
--
UPDATE `RunStepDetailsMessageCreationObject` SET `type` = ?, `message_creation` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsMessageCreationObject`
--
DELETE FROM `RunStepDetailsMessageCreationObject` WHERE 0;

