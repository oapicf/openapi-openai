--
-- OpenAI API.
-- Prepared SQL queries for 'RunStreamEvent' definition.
--


--
-- SELECT template for table `RunStreamEvent`
--
SELECT `event`, `data` FROM `RunStreamEvent` WHERE 1;

--
-- INSERT template for table `RunStreamEvent`
--
INSERT INTO `RunStreamEvent`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `RunStreamEvent`
--
UPDATE `RunStreamEvent` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `RunStreamEvent`
--
DELETE FROM `RunStreamEvent` WHERE 0;

