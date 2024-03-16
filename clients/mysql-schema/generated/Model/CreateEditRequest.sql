--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEditRequest' definition.
--


--
-- SELECT template for table `CreateEditRequest`
--
SELECT `model`, `input`, `instruction`, `n`, `temperature`, `top_p` FROM `CreateEditRequest` WHERE 1;

--
-- INSERT template for table `CreateEditRequest`
--
INSERT INTO `CreateEditRequest`(`model`, `input`, `instruction`, `n`, `temperature`, `top_p`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateEditRequest`
--
UPDATE `CreateEditRequest` SET `model` = ?, `input` = ?, `instruction` = ?, `n` = ?, `temperature` = ?, `top_p` = ? WHERE 1;

--
-- DELETE template for table `CreateEditRequest`
--
DELETE FROM `CreateEditRequest` WHERE 0;

