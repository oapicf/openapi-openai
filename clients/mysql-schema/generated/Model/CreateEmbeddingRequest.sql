--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEmbeddingRequest' definition.
--


--
-- SELECT template for table `CreateEmbeddingRequest`
--
SELECT `model`, `input`, `user` FROM `CreateEmbeddingRequest` WHERE 1;

--
-- INSERT template for table `CreateEmbeddingRequest`
--
INSERT INTO `CreateEmbeddingRequest`(`model`, `input`, `user`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateEmbeddingRequest`
--
UPDATE `CreateEmbeddingRequest` SET `model` = ?, `input` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CreateEmbeddingRequest`
--
DELETE FROM `CreateEmbeddingRequest` WHERE 0;

