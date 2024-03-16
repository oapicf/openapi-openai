--
-- OpenAI API.
-- Prepared SQL queries for 'Error' definition.
--


--
-- SELECT template for table `Error`
--
SELECT `type`, `message`, `param`, `code` FROM `Error` WHERE 1;

--
-- INSERT template for table `Error`
--
INSERT INTO `Error`(`type`, `message`, `param`, `code`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Error`
--
UPDATE `Error` SET `type` = ?, `message` = ?, `param` = ?, `code` = ? WHERE 1;

--
-- DELETE template for table `Error`
--
DELETE FROM `Error` WHERE 0;

