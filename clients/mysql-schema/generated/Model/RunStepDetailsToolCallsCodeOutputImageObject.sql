--
-- OpenAI API.
-- Prepared SQL queries for 'RunStepDetailsToolCallsCodeOutputImageObject' definition.
--


--
-- SELECT template for table `RunStepDetailsToolCallsCodeOutputImageObject`
--
SELECT `type`, `image` FROM `RunStepDetailsToolCallsCodeOutputImageObject` WHERE 1;

--
-- INSERT template for table `RunStepDetailsToolCallsCodeOutputImageObject`
--
INSERT INTO `RunStepDetailsToolCallsCodeOutputImageObject`(`type`, `image`) VALUES (?, ?);

--
-- UPDATE template for table `RunStepDetailsToolCallsCodeOutputImageObject`
--
UPDATE `RunStepDetailsToolCallsCodeOutputImageObject` SET `type` = ?, `image` = ? WHERE 1;

--
-- DELETE template for table `RunStepDetailsToolCallsCodeOutputImageObject`
--
DELETE FROM `RunStepDetailsToolCallsCodeOutputImageObject` WHERE 0;

