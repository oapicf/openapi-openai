--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_object class
local run_object = {}
local run_object_mt = {
	__name = "run_object";
	__index = run_object;
}

local function cast_run_object(t)
	return setmetatable(t, run_object_mt)
end

local function new_run_object(id, object, created_at, thread_id, assistant_id, status, required_action, last_error, expires_at, started_at, cancelled_at, failed_at, completed_at, incomplete_details, model, instructions, tools, file_ids, metadata, usage, temperature, max_prompt_tokens, max_completion_tokens, truncation_strategy, tool_choice, response_format)
	return cast_run_object({
		["id"] = id;
		["object"] = object;
		["created_at"] = created_at;
		["thread_id"] = thread_id;
		["assistant_id"] = assistant_id;
		["status"] = status;
		["required_action"] = required_action;
		["last_error"] = last_error;
		["expires_at"] = expires_at;
		["started_at"] = started_at;
		["cancelled_at"] = cancelled_at;
		["failed_at"] = failed_at;
		["completed_at"] = completed_at;
		["incomplete_details"] = incomplete_details;
		["model"] = model;
		["instructions"] = instructions;
		["tools"] = tools;
		["file_ids"] = file_ids;
		["metadata"] = metadata;
		["usage"] = usage;
		["temperature"] = temperature;
		["max_prompt_tokens"] = max_prompt_tokens;
		["max_completion_tokens"] = max_completion_tokens;
		["truncation_strategy"] = truncation_strategy;
		["tool_choice"] = tool_choice;
		["response_format"] = response_format;
	})
end

return {
	cast = cast_run_object;
	new = new_run_object;
}
