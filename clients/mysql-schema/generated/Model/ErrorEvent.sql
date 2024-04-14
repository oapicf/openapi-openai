--
-- OpenAI API.
-- Prepared SQL queries for 'ErrorEvent' definition.
--


--
-- SELECT template for table `ErrorEvent`
--
SELECT `event`, `data` FROM `ErrorEvent` WHERE 1;

--
-- INSERT template for table `ErrorEvent`
--
INSERT INTO `ErrorEvent`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `ErrorEvent`
--
UPDATE `ErrorEvent` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `ErrorEvent`
--
DELETE FROM `ErrorEvent` WHERE 0;

