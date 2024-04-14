--
-- OpenAI API.
-- Prepared SQL queries for 'Image' definition.
--


--
-- SELECT template for table `Image`
--
SELECT `b64_json`, `url`, `revised_prompt` FROM `Image` WHERE 1;

--
-- INSERT template for table `Image`
--
INSERT INTO `Image`(`b64_json`, `url`, `revised_prompt`) VALUES (?, ?, ?);

--
-- UPDATE template for table `Image`
--
UPDATE `Image` SET `b64_json` = ?, `url` = ?, `revised_prompt` = ? WHERE 1;

--
-- DELETE template for table `Image`
--
DELETE FROM `Image` WHERE 0;

