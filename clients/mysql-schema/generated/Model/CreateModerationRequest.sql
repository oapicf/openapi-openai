--
-- OpenAI API.
-- Prepared SQL queries for 'CreateModerationRequest' definition.
--


--
-- SELECT template for table `CreateModerationRequest`
--
SELECT `input`, `model` FROM `CreateModerationRequest` WHERE 1;

--
-- INSERT template for table `CreateModerationRequest`
--
INSERT INTO `CreateModerationRequest`(`input`, `model`) VALUES (?, ?);

--
-- UPDATE template for table `CreateModerationRequest`
--
UPDATE `CreateModerationRequest` SET `input` = ?, `model` = ? WHERE 1;

--
-- DELETE template for table `CreateModerationRequest`
--
DELETE FROM `CreateModerationRequest` WHERE 0;

