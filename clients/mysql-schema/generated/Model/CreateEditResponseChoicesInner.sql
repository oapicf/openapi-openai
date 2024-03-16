--
-- OpenAI API.
-- Prepared SQL queries for 'CreateEditResponse_choices_inner' definition.
--


--
-- SELECT template for table `CreateEditResponse_choices_inner`
--
SELECT `text`, `index`, `logprobs`, `finish_reason` FROM `CreateEditResponse_choices_inner` WHERE 1;

--
-- INSERT template for table `CreateEditResponse_choices_inner`
--
INSERT INTO `CreateEditResponse_choices_inner`(`text`, `index`, `logprobs`, `finish_reason`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateEditResponse_choices_inner`
--
UPDATE `CreateEditResponse_choices_inner` SET `text` = ?, `index` = ?, `logprobs` = ?, `finish_reason` = ? WHERE 1;

--
-- DELETE template for table `CreateEditResponse_choices_inner`
--
DELETE FROM `CreateEditResponse_choices_inner` WHERE 0;

