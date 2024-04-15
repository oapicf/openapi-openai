--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_completion_response_choices_inner class
local create_completion_response_choices_inner = {}
local create_completion_response_choices_inner_mt = {
	__name = "create_completion_response_choices_inner";
	__index = create_completion_response_choices_inner;
}

local function cast_create_completion_response_choices_inner(t)
	return setmetatable(t, create_completion_response_choices_inner_mt)
end

local function new_create_completion_response_choices_inner(finish_reason, index, logprobs, text)
	return cast_create_completion_response_choices_inner({
		["finish_reason"] = finish_reason;
		["index"] = index;
		["logprobs"] = logprobs;
		["text"] = text;
	})
end

return {
	cast = cast_create_completion_response_choices_inner;
	new = new_create_completion_response_choices_inner;
}