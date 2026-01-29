--
-- OpenAI API.
-- Prepared SQL queries for 'DeleteMessageResponse' definition.
--


--
-- SELECT template for table `DeleteMessageResponse`
--
SELECT `id`, `deleted`, `object` FROM `DeleteMessageResponse` WHERE 1;

--
-- INSERT template for table `DeleteMessageResponse`
--
INSERT INTO `DeleteMessageResponse`(`id`, `deleted`, `object`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeleteMessageResponse`
--
UPDATE `DeleteMessageResponse` SET `id` = ?, `deleted` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `DeleteMessageResponse`
--
DELETE FROM `DeleteMessageResponse` WHERE 0;

