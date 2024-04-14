--
-- OpenAI API.
-- Prepared SQL queries for 'TranscriptionSegment' definition.
--


--
-- SELECT template for table `TranscriptionSegment`
--
SELECT `id`, `seek`, `start`, `end`, `text`, `tokens`, `temperature`, `avg_logprob`, `compression_ratio`, `no_speech_prob` FROM `TranscriptionSegment` WHERE 1;

--
-- INSERT template for table `TranscriptionSegment`
--
INSERT INTO `TranscriptionSegment`(`id`, `seek`, `start`, `end`, `text`, `tokens`, `temperature`, `avg_logprob`, `compression_ratio`, `no_speech_prob`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TranscriptionSegment`
--
UPDATE `TranscriptionSegment` SET `id` = ?, `seek` = ?, `start` = ?, `end` = ?, `text` = ?, `tokens` = ?, `temperature` = ?, `avg_logprob` = ?, `compression_ratio` = ?, `no_speech_prob` = ? WHERE 1;

--
-- DELETE template for table `TranscriptionSegment`
--
DELETE FROM `TranscriptionSegment` WHERE 0;

