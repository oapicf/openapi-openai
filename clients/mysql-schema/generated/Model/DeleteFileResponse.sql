--
-- OpenAI API.
-- Prepared SQL queries for 'DeleteFileResponse' definition.
--


--
-- SELECT template for table `DeleteFileResponse`
--
SELECT `id`, `object`, `deleted` FROM `DeleteFileResponse` WHERE 1;

--
-- INSERT template for table `DeleteFileResponse`
--
INSERT INTO `DeleteFileResponse`(`id`, `object`, `deleted`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeleteFileResponse`
--
UPDATE `DeleteFileResponse` SET `id` = ?, `object` = ?, `deleted` = ? WHERE 1;

--
-- DELETE template for table `DeleteFileResponse`
--
DELETE FROM `DeleteFileResponse` WHERE 0;

