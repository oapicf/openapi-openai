--
-- OpenAI API.
-- Prepared SQL queries for 'CreateModerationResponse_results_inner_categories' definition.
--


--
-- SELECT template for table `CreateModerationResponse_results_inner_categories`
--
SELECT `hate`, `hate/threatening`, `self-harm`, `sexual`, `sexual/minors`, `violence`, `violence/graphic` FROM `CreateModerationResponse_results_inner_categories` WHERE 1;

--
-- INSERT template for table `CreateModerationResponse_results_inner_categories`
--
INSERT INTO `CreateModerationResponse_results_inner_categories`(`hate`, `hate/threatening`, `self-harm`, `sexual`, `sexual/minors`, `violence`, `violence/graphic`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateModerationResponse_results_inner_categories`
--
UPDATE `CreateModerationResponse_results_inner_categories` SET `hate` = ?, `hate/threatening` = ?, `self-harm` = ?, `sexual` = ?, `sexual/minors` = ?, `violence` = ?, `violence/graphic` = ? WHERE 1;

--
-- DELETE template for table `CreateModerationResponse_results_inner_categories`
--
DELETE FROM `CreateModerationResponse_results_inner_categories` WHERE 0;

