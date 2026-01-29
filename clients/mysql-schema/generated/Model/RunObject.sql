--
-- OpenAI API.
-- Prepared SQL queries for 'RunObject' definition.
--


--
-- SELECT template for table `RunObject`
--
SELECT `id`, `object`, `created_at`, `thread_id`, `assistant_id`, `status`, `required_action`, `last_error`, `expires_at`, `started_at`, `cancelled_at`, `failed_at`, `completed_at`, `incomplete_details`, `model`, `instructions`, `tools`, `file_ids`, `metadata`, `usage`, `temperature`, `max_prompt_tokens`, `max_completion_tokens`, `truncation_strategy`, `tool_choice`, `response_format` FROM `RunObject` WHERE 1;

--
-- INSERT template for table `RunObject`
--
INSERT INTO `RunObject`(`id`, `object`, `created_at`, `thread_id`, `assistant_id`, `status`, `required_action`, `last_error`, `expires_at`, `started_at`, `cancelled_at`, `failed_at`, `completed_at`, `incomplete_details`, `model`, `instructions`, `tools`, `file_ids`, `metadata`, `usage`, `temperature`, `max_prompt_tokens`, `max_completion_tokens`, `truncation_strategy`, `tool_choice`, `response_format`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `RunObject`
--
UPDATE `RunObject` SET `id` = ?, `object` = ?, `created_at` = ?, `thread_id` = ?, `assistant_id` = ?, `status` = ?, `required_action` = ?, `last_error` = ?, `expires_at` = ?, `started_at` = ?, `cancelled_at` = ?, `failed_at` = ?, `completed_at` = ?, `incomplete_details` = ?, `model` = ?, `instructions` = ?, `tools` = ?, `file_ids` = ?, `metadata` = ?, `usage` = ?, `temperature` = ?, `max_prompt_tokens` = ?, `max_completion_tokens` = ?, `truncation_strategy` = ?, `tool_choice` = ?, `response_format` = ? WHERE 1;

--
-- DELETE template for table `RunObject`
--
DELETE FROM `RunObject` WHERE 0;

