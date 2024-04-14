--
-- OpenAI API.
-- Prepared SQL queries for 'CreateRunRequest' definition.
--


--
-- SELECT template for table `CreateRunRequest`
--
SELECT `assistant_id`, `model`, `instructions`, `additional_instructions`, `additional_messages`, `tools`, `metadata`, `temperature`, `stream`, `max_prompt_tokens`, `max_completion_tokens`, `truncation_strategy`, `tool_choice`, `response_format` FROM `CreateRunRequest` WHERE 1;

--
-- INSERT template for table `CreateRunRequest`
--
INSERT INTO `CreateRunRequest`(`assistant_id`, `model`, `instructions`, `additional_instructions`, `additional_messages`, `tools`, `metadata`, `temperature`, `stream`, `max_prompt_tokens`, `max_completion_tokens`, `truncation_strategy`, `tool_choice`, `response_format`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateRunRequest`
--
UPDATE `CreateRunRequest` SET `assistant_id` = ?, `model` = ?, `instructions` = ?, `additional_instructions` = ?, `additional_messages` = ?, `tools` = ?, `metadata` = ?, `temperature` = ?, `stream` = ?, `max_prompt_tokens` = ?, `max_completion_tokens` = ?, `truncation_strategy` = ?, `tool_choice` = ?, `response_format` = ? WHERE 1;

--
-- DELETE template for table `CreateRunRequest`
--
DELETE FROM `CreateRunRequest` WHERE 0;

