--
-- OpenAI API.
-- Prepared SQL queries for 'CreateImageRequest' definition.
--


--
-- SELECT template for table `CreateImageRequest`
--
SELECT `prompt`, `n`, `size`, `response_format`, `user` FROM `CreateImageRequest` WHERE 1;

--
-- INSERT template for table `CreateImageRequest`
--
INSERT INTO `CreateImageRequest`(`prompt`, `n`, `size`, `response_format`, `user`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateImageRequest`
--
UPDATE `CreateImageRequest` SET `prompt` = ?, `n` = ?, `size` = ?, `response_format` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CreateImageRequest`
--
DELETE FROM `CreateImageRequest` WHERE 0;

