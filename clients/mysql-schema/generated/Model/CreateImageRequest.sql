--
-- OpenAI API.
-- Prepared SQL queries for 'CreateImageRequest' definition.
--


--
-- SELECT template for table `CreateImageRequest`
--
SELECT `prompt`, `model`, `n`, `quality`, `response_format`, `size`, `style`, `user` FROM `CreateImageRequest` WHERE 1;

--
-- INSERT template for table `CreateImageRequest`
--
INSERT INTO `CreateImageRequest`(`prompt`, `model`, `n`, `quality`, `response_format`, `size`, `style`, `user`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateImageRequest`
--
UPDATE `CreateImageRequest` SET `prompt` = ?, `model` = ?, `n` = ?, `quality` = ?, `response_format` = ?, `size` = ?, `style` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CreateImageRequest`
--
DELETE FROM `CreateImageRequest` WHERE 0;

