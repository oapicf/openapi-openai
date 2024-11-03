--
-- OpenAI API.
-- Prepared SQL queries for 'DeleteThreadResponse' definition.
--


--
-- SELECT template for table `DeleteThreadResponse`
--
SELECT `id`, `deleted`, `object` FROM `DeleteThreadResponse` WHERE 1;

--
-- INSERT template for table `DeleteThreadResponse`
--
INSERT INTO `DeleteThreadResponse`(`id`, `deleted`, `object`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeleteThreadResponse`
--
UPDATE `DeleteThreadResponse` SET `id` = ?, `deleted` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `DeleteThreadResponse`
--
DELETE FROM `DeleteThreadResponse` WHERE 0;

