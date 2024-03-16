--[[
  OpenAI API

  APIs for sampling from and fine-tuning language models

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_chat_completion_response_choices_inner class
local create_chat_completion_response_choices_inner = {}
local create_chat_completion_response_choices_inner_mt = {
	__name = "create_chat_completion_response_choices_inner";
	__index = create_chat_completion_response_choices_inner;
}

local function cast_create_chat_completion_response_choices_inner(t)
	return setmetatable(t, create_chat_completion_response_choices_inner_mt)
end

local function new_create_chat_completion_response_choices_inner(index, message, finish_reason)
	return cast_create_chat_completion_response_choices_inner({
		["index"] = index;
		["message"] = message;
		["finish_reason"] = finish_reason;
	})
end

return {
	cast = cast_create_chat_completion_response_choices_inner;
	new = new_create_chat_completion_response_choices_inner;
}
