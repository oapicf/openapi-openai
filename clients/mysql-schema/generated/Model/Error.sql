--
-- OpenAI API.
-- Prepared SQL queries for 'Error' definition.
--


--
-- SELECT template for table `Error`
--
SELECT `code`, `message`, `param`, `type` FROM `Error` WHERE 1;

--
-- INSERT template for table `Error`
--
INSERT INTO `Error`(`code`, `message`, `param`, `type`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Error`
--
UPDATE `Error` SET `code` = ?, `message` = ?, `param` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `Error`
--
DELETE FROM `Error` WHERE 0;

