--
-- OpenAI API.
-- Prepared SQL queries for 'Embedding' definition.
--


--
-- SELECT template for table `Embedding`
--
SELECT `index`, `embedding`, `object` FROM `Embedding` WHERE 1;

--
-- INSERT template for table `Embedding`
--
INSERT INTO `Embedding`(`index`, `embedding`, `object`) VALUES (?, ?, ?);

--
-- UPDATE template for table `Embedding`
--
UPDATE `Embedding` SET `index` = ?, `embedding` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `Embedding`
--
DELETE FROM `Embedding` WHERE 0;

