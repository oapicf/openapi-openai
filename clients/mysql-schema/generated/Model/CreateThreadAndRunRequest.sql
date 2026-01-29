--
-- OpenAI API.
-- Prepared SQL queries for 'CreateThreadAndRunRequest' definition.
--


--
-- SELECT template for table `CreateThreadAndRunRequest`
--
SELECT `assistant_id`, `thread`, `model`, `instructions`, `tools`, `metadata`, `temperature`, `stream`, `max_prompt_tokens`, `max_completion_tokens`, `truncation_strategy`, `tool_choice`, `response_format` FROM `CreateThreadAndRunRequest` WHERE 1;

--
-- INSERT template for table `CreateThreadAndRunRequest`
--
INSERT INTO `CreateThreadAndRunRequest`(`assistant_id`, `thread`, `model`, `instructions`, `tools`, `metadata`, `temperature`, `stream`, `max_prompt_tokens`, `max_completion_tokens`, `truncation_strategy`, `tool_choice`, `response_format`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateThreadAndRunRequest`
--
UPDATE `CreateThreadAndRunRequest` SET `assistant_id` = ?, `thread` = ?, `model` = ?, `instructions` = ?, `tools` = ?, `metadata` = ?, `temperature` = ?, `stream` = ?, `max_prompt_tokens` = ?, `max_completion_tokens` = ?, `truncation_strategy` = ?, `tool_choice` = ?, `response_format` = ? WHERE 1;

--
-- DELETE template for table `CreateThreadAndRunRequest`
--
DELETE FROM `CreateThreadAndRunRequest` WHERE 0;

