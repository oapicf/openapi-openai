--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEditResponse' definition.
--


--
-- SELECT template for table `CreateEditResponse`
--
SELECT `object`, `created`, `choices`, `usage` FROM `CreateEditResponse` WHERE 1;

--
-- INSERT template for table `CreateEditResponse`
--
INSERT INTO `CreateEditResponse`(`object`, `created`, `choices`, `usage`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateEditResponse`
--
UPDATE `CreateEditResponse` SET `object` = ?, `created` = ?, `choices` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `CreateEditResponse`
--
DELETE FROM `CreateEditResponse` WHERE 0;

