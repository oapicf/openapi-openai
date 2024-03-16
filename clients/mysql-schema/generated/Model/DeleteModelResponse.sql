--
-- OpenAI API.
-- Prepared SQL queries for 'DeleteModelResponse' definition.
--


--
-- SELECT template for table `DeleteModelResponse`
--
SELECT `id`, `object`, `deleted` FROM `DeleteModelResponse` WHERE 1;

--
-- INSERT template for table `DeleteModelResponse`
--
INSERT INTO `DeleteModelResponse`(`id`, `object`, `deleted`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeleteModelResponse`
--
UPDATE `DeleteModelResponse` SET `id` = ?, `object` = ?, `deleted` = ? WHERE 1;

--
-- DELETE template for table `DeleteModelResponse`
--
DELETE FROM `DeleteModelResponse` WHERE 0;

