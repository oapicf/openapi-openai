--
-- OpenAI API.
-- Prepared SQL queries for 'Model' definition.
--


--
-- SELECT template for table `Model`
--
SELECT `id`, `object`, `created`, `owned_by` FROM `Model` WHERE 1;

--
-- INSERT template for table `Model`
--
INSERT INTO `Model`(`id`, `object`, `created`, `owned_by`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Model`
--
UPDATE `Model` SET `id` = ?, `object` = ?, `created` = ?, `owned_by` = ? WHERE 1;

--
-- DELETE template for table `Model`
--
DELETE FROM `Model` WHERE 0;

