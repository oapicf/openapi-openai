--[[
  OpenAI API

  APIs for sampling from and fine-tuning language models

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- chat_completion_response_message class
local chat_completion_response_message = {}
local chat_completion_response_message_mt = {
	__name = "chat_completion_response_message";
	__index = chat_completion_response_message;
}

local function cast_chat_completion_response_message(t)
	return setmetatable(t, chat_completion_response_message_mt)
end

local function new_chat_completion_response_message(role, content, function_call)
	return cast_chat_completion_response_message({
		["role"] = role;
		["content"] = content;
		["function_call"] = function_call;
	})
end

return {
	cast = cast_chat_completion_response_message;
	new = new_chat_completion_response_message;
}
