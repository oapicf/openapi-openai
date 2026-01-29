--
-- OpenAI API.
-- Prepared SQL queries for 'FunctionObject' definition.
--


--
-- SELECT template for table `FunctionObject`
--
SELECT `description`, `name`, `parameters` FROM `FunctionObject` WHERE 1;

--
-- INSERT template for table `FunctionObject`
--
INSERT INTO `FunctionObject`(`description`, `name`, `parameters`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FunctionObject`
--
UPDATE `FunctionObject` SET `description` = ?, `name` = ?, `parameters` = ? WHERE 1;

--
-- DELETE template for table `FunctionObject`
--
DELETE FROM `FunctionObject` WHERE 0;

