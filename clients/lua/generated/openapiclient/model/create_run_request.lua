--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_run_request class
local create_run_request = {}
local create_run_request_mt = {
	__name = "create_run_request";
	__index = create_run_request;
}

local function cast_create_run_request(t)
	return setmetatable(t, create_run_request_mt)
end

local function new_create_run_request(assistant_id, model, instructions, additional_instructions, additional_messages, tools, metadata, temperature, stream, max_prompt_tokens, max_completion_tokens, truncation_strategy, tool_choice, response_format)
	return cast_create_run_request({
		["assistant_id"] = assistant_id;
		["model"] = model;
		["instructions"] = instructions;
		["additional_instructions"] = additional_instructions;
		["additional_messages"] = additional_messages;
		["tools"] = tools;
		["metadata"] = metadata;
		["temperature"] = temperature;
		["stream"] = stream;
		["max_prompt_tokens"] = max_prompt_tokens;
		["max_completion_tokens"] = max_completion_tokens;
		["truncation_strategy"] = truncation_strategy;
		["tool_choice"] = tool_choice;
		["response_format"] = response_format;
	})
end

return {
	cast = cast_create_run_request;
	new = new_create_run_request;
}
