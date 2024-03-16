--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEmbeddingResponse_data_inner' definition.
--


--
-- SELECT template for table `CreateEmbeddingResponse_data_inner`
--
SELECT `index`, `object`, `embedding` FROM `CreateEmbeddingResponse_data_inner` WHERE 1;

--
-- INSERT template for table `CreateEmbeddingResponse_data_inner`
--
INSERT INTO `CreateEmbeddingResponse_data_inner`(`index`, `object`, `embedding`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateEmbeddingResponse_data_inner`
--
UPDATE `CreateEmbeddingResponse_data_inner` SET `index` = ?, `object` = ?, `embedding` = ? WHERE 1;

--
-- DELETE template for table `CreateEmbeddingResponse_data_inner`
--
DELETE FROM `CreateEmbeddingResponse_data_inner` WHERE 0;

