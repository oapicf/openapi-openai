--
-- OpenAI API.
-- Prepared SQL queries for 'RunToolCallObject_function' definition.
--


--
-- SELECT template for table `RunToolCallObject_function`
--
SELECT `name`, `arguments` FROM `RunToolCallObject_function` WHERE 1;

--
-- INSERT template for table `RunToolCallObject_function`
--
INSERT INTO `RunToolCallObject_function`(`name`, `arguments`) VALUES (?, ?);

--
-- UPDATE template for table `RunToolCallObject_function`
--
UPDATE `RunToolCallObject_function` SET `name` = ?, `arguments` = ? WHERE 1;

--
-- DELETE template for table `RunToolCallObject_function`
--
DELETE FROM `RunToolCallObject_function` WHERE 0;

