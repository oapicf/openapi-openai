--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEmbeddingResponse_usage' definition.
--


--
-- SELECT template for table `CreateEmbeddingResponse_usage`
--
SELECT `prompt_tokens`, `total_tokens` FROM `CreateEmbeddingResponse_usage` WHERE 1;

--
-- INSERT template for table `CreateEmbeddingResponse_usage`
--
INSERT INTO `CreateEmbeddingResponse_usage`(`prompt_tokens`, `total_tokens`) VALUES (?, ?);

--
-- UPDATE template for table `CreateEmbeddingResponse_usage`
--
UPDATE `CreateEmbeddingResponse_usage` SET `prompt_tokens` = ?, `total_tokens` = ? WHERE 1;

--
-- DELETE template for table `CreateEmbeddingResponse_usage`
--
DELETE FROM `CreateEmbeddingResponse_usage` WHERE 0;

