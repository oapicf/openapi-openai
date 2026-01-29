--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEmbeddingRequest' definition.
--


--
-- SELECT template for table `CreateEmbeddingRequest`
--
SELECT `input`, `model`, `encoding_format`, `dimensions`, `user` FROM `CreateEmbeddingRequest` WHERE 1;

--
-- INSERT template for table `CreateEmbeddingRequest`
--
INSERT INTO `CreateEmbeddingRequest`(`input`, `model`, `encoding_format`, `dimensions`, `user`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateEmbeddingRequest`
--
UPDATE `CreateEmbeddingRequest` SET `input` = ?, `model` = ?, `encoding_format` = ?, `dimensions` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CreateEmbeddingRequest`
--
DELETE FROM `CreateEmbeddingRequest` WHERE 0;

