--
-- OpenAI API.
-- Prepared SQL queries for 'CreateModerationResponse_results_inner' definition.
--


--
-- SELECT template for table `CreateModerationResponse_results_inner`
--
SELECT `flagged`, `categories`, `category_scores` FROM `CreateModerationResponse_results_inner` WHERE 1;

--
-- INSERT template for table `CreateModerationResponse_results_inner`
--
INSERT INTO `CreateModerationResponse_results_inner`(`flagged`, `categories`, `category_scores`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateModerationResponse_results_inner`
--
UPDATE `CreateModerationResponse_results_inner` SET `flagged` = ?, `categories` = ?, `category_scores` = ? WHERE 1;

--
-- DELETE template for table `CreateModerationResponse_results_inner`
--
DELETE FROM `CreateModerationResponse_results_inner` WHERE 0;

