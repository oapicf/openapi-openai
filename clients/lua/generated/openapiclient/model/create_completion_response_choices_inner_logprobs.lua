--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_completion_response_choices_inner_logprobs class
local create_completion_response_choices_inner_logprobs = {}
local create_completion_response_choices_inner_logprobs_mt = {
	__name = "create_completion_response_choices_inner_logprobs";
	__index = create_completion_response_choices_inner_logprobs;
}

local function cast_create_completion_response_choices_inner_logprobs(t)
	return setmetatable(t, create_completion_response_choices_inner_logprobs_mt)
end

local function new_create_completion_response_choices_inner_logprobs(text_offset, token_logprobs, tokens, top_logprobs)
	return cast_create_completion_response_choices_inner_logprobs({
		["text_offset"] = text_offset;
		["token_logprobs"] = token_logprobs;
		["tokens"] = tokens;
		["top_logprobs"] = top_logprobs;
	})
end

return {
	cast = cast_create_completion_response_choices_inner_logprobs;
	new = new_create_completion_response_choices_inner_logprobs;
}
