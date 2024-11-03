--
-- OpenAI API.
-- Prepared SQL queries for 'CreateModerationResponse' definition.
--


--
-- SELECT template for table `CreateModerationResponse`
--
SELECT `id`, `model`, `results` FROM `CreateModerationResponse` WHERE 1;

--
-- INSERT template for table `CreateModerationResponse`
--
INSERT INTO `CreateModerationResponse`(`id`, `model`, `results`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateModerationResponse`
--
UPDATE `CreateModerationResponse` SET `id` = ?, `model` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `CreateModerationResponse`
--
DELETE FROM `CreateModerationResponse` WHERE 0;

