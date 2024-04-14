--
-- OpenAI API.
-- Prepared SQL queries for 'DeleteModelResponse' definition.
--


--
-- SELECT template for table `DeleteModelResponse`
--
SELECT `id`, `deleted`, `object` FROM `DeleteModelResponse` WHERE 1;

--
-- INSERT template for table `DeleteModelResponse`
--
INSERT INTO `DeleteModelResponse`(`id`, `deleted`, `object`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeleteModelResponse`
--
UPDATE `DeleteModelResponse` SET `id` = ?, `deleted` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `DeleteModelResponse`
--
DELETE FROM `DeleteModelResponse` WHERE 0;

