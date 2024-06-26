--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- chat_completion_stream_response_delta class
local chat_completion_stream_response_delta = {}
local chat_completion_stream_response_delta_mt = {
	__name = "chat_completion_stream_response_delta";
	__index = chat_completion_stream_response_delta;
}

local function cast_chat_completion_stream_response_delta(t)
	return setmetatable(t, chat_completion_stream_response_delta_mt)
end

local function new_chat_completion_stream_response_delta(content, function_call, tool_calls, role)
	return cast_chat_completion_stream_response_delta({
		["content"] = content;
		["function_call"] = function_call;
		["tool_calls"] = tool_calls;
		["role"] = role;
	})
end

return {
	cast = cast_chat_completion_stream_response_delta;
	new = new_chat_completion_stream_response_delta;
}
