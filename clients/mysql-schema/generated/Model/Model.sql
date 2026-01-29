--
-- OpenAI API.
-- Prepared SQL queries for 'Model' definition.
--


--
-- SELECT template for table `Model`
--
SELECT `id`, `created`, `object`, `owned_by` FROM `Model` WHERE 1;

--
-- INSERT template for table `Model`
--
INSERT INTO `Model`(`id`, `created`, `object`, `owned_by`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Model`
--
UPDATE `Model` SET `id` = ?, `created` = ?, `object` = ?, `owned_by` = ? WHERE 1;

--
-- DELETE template for table `Model`
--
DELETE FROM `Model` WHERE 0;

