--
-- OpenAI API.
-- Prepared SQL queries for 'ImagesResponse_data_inner' definition.
--


--
-- SELECT template for table `ImagesResponse_data_inner`
--
SELECT `url`, `b64_json` FROM `ImagesResponse_data_inner` WHERE 1;

--
-- INSERT template for table `ImagesResponse_data_inner`
--
INSERT INTO `ImagesResponse_data_inner`(`url`, `b64_json`) VALUES (?, ?);

--
-- UPDATE template for table `ImagesResponse_data_inner`
--
UPDATE `ImagesResponse_data_inner` SET `url` = ?, `b64_json` = ? WHERE 1;

--
-- DELETE template for table `ImagesResponse_data_inner`
--
DELETE FROM `ImagesResponse_data_inner` WHERE 0;

