--
-- OpenAI API.
-- Prepared SQL queries for 'ListPaginatedFineTuningJobsResponse' definition.
--


--
-- SELECT template for table `ListPaginatedFineTuningJobsResponse`
--
SELECT `data`, `has_more`, `object` FROM `ListPaginatedFineTuningJobsResponse` WHERE 1;

--
-- INSERT template for table `ListPaginatedFineTuningJobsResponse`
--
INSERT INTO `ListPaginatedFineTuningJobsResponse`(`data`, `has_more`, `object`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ListPaginatedFineTuningJobsResponse`
--
UPDATE `ListPaginatedFineTuningJobsResponse` SET `data` = ?, `has_more` = ?, `object` = ? WHERE 1;

--
-- DELETE template for table `ListPaginatedFineTuningJobsResponse`
--
DELETE FROM `ListPaginatedFineTuningJobsResponse` WHERE 0;

