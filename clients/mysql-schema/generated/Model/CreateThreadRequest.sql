--
-- OpenAI API.
-- Prepared SQL queries for 'CreateThreadRequest' definition.
--


--
-- SELECT template for table `CreateThreadRequest`
--
SELECT `messages`, `metadata` FROM `CreateThreadRequest` WHERE 1;

--
-- INSERT template for table `CreateThreadRequest`
--
INSERT INTO `CreateThreadRequest`(`messages`, `metadata`) VALUES (?, ?);

--
-- UPDATE template for table `CreateThreadRequest`
--
UPDATE `CreateThreadRequest` SET `messages` = ?, `metadata` = ? WHERE 1;

--
-- DELETE template for table `CreateThreadRequest`
--
DELETE FROM `CreateThreadRequest` WHERE 0;

