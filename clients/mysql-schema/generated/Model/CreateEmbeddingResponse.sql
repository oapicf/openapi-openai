--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEmbeddingResponse' definition.
--


--
-- SELECT template for table `CreateEmbeddingResponse`
--
SELECT `object`, `model`, `data`, `usage` FROM `CreateEmbeddingResponse` WHERE 1;

--
-- INSERT template for table `CreateEmbeddingResponse`
--
INSERT INTO `CreateEmbeddingResponse`(`object`, `model`, `data`, `usage`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateEmbeddingResponse`
--
UPDATE `CreateEmbeddingResponse` SET `object` = ?, `model` = ?, `data` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `CreateEmbeddingResponse`
--
DELETE FROM `CreateEmbeddingResponse` WHERE 0;

