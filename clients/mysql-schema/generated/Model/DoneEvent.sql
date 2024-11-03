--
-- OpenAI API.
-- Prepared SQL queries for 'DoneEvent' definition.
--


--
-- SELECT template for table `DoneEvent`
--
SELECT `event`, `data` FROM `DoneEvent` WHERE 1;

--
-- INSERT template for table `DoneEvent`
--
INSERT INTO `DoneEvent`(`event`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `DoneEvent`
--
UPDATE `DoneEvent` SET `event` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `DoneEvent`
--
DELETE FROM `DoneEvent` WHERE 0;

