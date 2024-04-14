--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEmbeddingResponse' definition.
--


--
-- SELECT template for table `CreateEmbeddingResponse`
--
SELECT `data`, `model`, `object`, `usage` FROM `CreateEmbeddingResponse` WHERE 1;

--
-- INSERT template for table `CreateEmbeddingResponse`
--
INSERT INTO `CreateEmbeddingResponse`(`data`, `model`, `object`, `usage`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateEmbeddingResponse`
--
UPDATE `CreateEmbeddingResponse` SET `data` = ?, `model` = ?, `object` = ?, `usage` = ? WHERE 1;

--
-- DELETE template for table `CreateEmbeddingResponse`
--
DELETE FROM `CreateEmbeddingResponse` WHERE 0;

