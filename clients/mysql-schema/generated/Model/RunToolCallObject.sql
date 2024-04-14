--
-- OpenAI API.
-- Prepared SQL queries for 'RunToolCallObject' definition.
--


--
-- SELECT template for table `RunToolCallObject`
--
SELECT `id`, `type`, `function` FROM `RunToolCallObject` WHERE 1;

--
-- INSERT template for table `RunToolCallObject`
--
INSERT INTO `RunToolCallObject`(`id`, `type`, `function`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RunToolCallObject`
--
UPDATE `RunToolCallObject` SET `id` = ?, `type` = ?, `function` = ? WHERE 1;

--
-- DELETE template for table `RunToolCallObject`
--
DELETE FROM `RunToolCallObject` WHERE 0;

