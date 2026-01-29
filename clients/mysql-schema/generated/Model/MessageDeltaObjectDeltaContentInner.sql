--
-- OpenAI API.
-- Prepared SQL queries for 'MessageDeltaObject_delta_content_inner' definition.
--


--
-- SELECT template for table `MessageDeltaObject_delta_content_inner`
--
SELECT `index`, `type`, `image_file`, `text` FROM `MessageDeltaObject_delta_content_inner` WHERE 1;

--
-- INSERT template for table `MessageDeltaObject_delta_content_inner`
--
INSERT INTO `MessageDeltaObject_delta_content_inner`(`index`, `type`, `image_file`, `text`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MessageDeltaObject_delta_content_inner`
--
UPDATE `MessageDeltaObject_delta_content_inner` SET `index` = ?, `type` = ?, `image_file` = ?, `text` = ? WHERE 1;

--
-- DELETE template for table `MessageDeltaObject_delta_content_inner`
--
DELETE FROM `MessageDeltaObject_delta_content_inner` WHERE 0;

