--
-- OpenAI API.
-- Prepared SQL queries for 'ImagesResponse' definition.
--


--
-- SELECT template for table `ImagesResponse`
--
SELECT `created`, `data` FROM `ImagesResponse` WHERE 1;

--
-- INSERT template for table `ImagesResponse`
--
INSERT INTO `ImagesResponse`(`created`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `ImagesResponse`
--
UPDATE `ImagesResponse` SET `created` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `ImagesResponse`
--
DELETE FROM `ImagesResponse` WHERE 0;

