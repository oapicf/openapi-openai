--
-- OpenAI API.
-- Prepared SQL queries for 'OpenAIFile' definition.
--


--
-- SELECT template for table `OpenAIFile`
--
SELECT `id`, `object`, `bytes`, `created_at`, `filename`, `purpose`, `status`, `status_details` FROM `OpenAIFile` WHERE 1;

--
-- INSERT template for table `OpenAIFile`
--
INSERT INTO `OpenAIFile`(`id`, `object`, `bytes`, `created_at`, `filename`, `purpose`, `status`, `status_details`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OpenAIFile`
--
UPDATE `OpenAIFile` SET `id` = ?, `object` = ?, `bytes` = ?, `created_at` = ?, `filename` = ?, `purpose` = ?, `status` = ?, `status_details` = ? WHERE 1;

--
-- DELETE template for table `OpenAIFile`
--
DELETE FROM `OpenAIFile` WHERE 0;

