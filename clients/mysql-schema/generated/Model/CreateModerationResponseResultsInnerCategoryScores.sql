--
-- OpenAI API.
-- Prepared SQL queries for 'CreateModerationResponse_results_inner_category_scores' definition.
--


--
-- SELECT template for table `CreateModerationResponse_results_inner_category_scores`
--
SELECT `hate`, `hate/threatening`, `harassment`, `harassment/threatening`, `self-harm`, `self-harm/intent`, `self-harm/instructions`, `sexual`, `sexual/minors`, `violence`, `violence/graphic` FROM `CreateModerationResponse_results_inner_category_scores` WHERE 1;

--
-- INSERT template for table `CreateModerationResponse_results_inner_category_scores`
--
INSERT INTO `CreateModerationResponse_results_inner_category_scores`(`hate`, `hate/threatening`, `harassment`, `harassment/threatening`, `self-harm`, `self-harm/intent`, `self-harm/instructions`, `sexual`, `sexual/minors`, `violence`, `violence/graphic`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateModerationResponse_results_inner_category_scores`
--
UPDATE `CreateModerationResponse_results_inner_category_scores` SET `hate` = ?, `hate/threatening` = ?, `harassment` = ?, `harassment/threatening` = ?, `self-harm` = ?, `self-harm/intent` = ?, `self-harm/instructions` = ?, `sexual` = ?, `sexual/minors` = ?, `violence` = ?, `violence/graphic` = ? WHERE 1;

--
-- DELETE template for table `CreateModerationResponse_results_inner_category_scores`
--
DELETE FROM `CreateModerationResponse_results_inner_category_scores` WHERE 0;

