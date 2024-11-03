--
-- OpenAI API.
-- Prepared SQL queries for 'ListModelsResponse' definition.
--


--
-- SELECT template for table `ListModelsResponse`
--
SELECT `object`, `data` FROM `ListModelsResponse` WHERE 1;

--
-- INSERT template for table `ListModelsResponse`
--
INSERT INTO `ListModelsResponse`(`object`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `ListModelsResponse`
--
UPDATE `ListModelsResponse` SET `object` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `ListModelsResponse`
--
DELETE FROM `ListModelsResponse` WHERE 0;

