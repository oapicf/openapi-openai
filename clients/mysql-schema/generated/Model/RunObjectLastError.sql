--
-- OpenAI API.
-- Prepared SQL queries for 'RunObject_last_error' definition.
--


--
-- SELECT template for table `RunObject_last_error`
--
SELECT `code`, `message` FROM `RunObject_last_error` WHERE 1;

--
-- INSERT template for table `RunObject_last_error`
--
INSERT INTO `RunObject_last_error`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `RunObject_last_error`
--
UPDATE `RunObject_last_error` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `RunObject_last_error`
--
DELETE FROM `RunObject_last_error` WHERE 0;

