--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- chat_completion_named_tool_choice_function class
local chat_completion_named_tool_choice_function = {}
local chat_completion_named_tool_choice_function_mt = {
	__name = "chat_completion_named_tool_choice_function";
	__index = chat_completion_named_tool_choice_function;
}

local function cast_chat_completion_named_tool_choice_function(t)
	return setmetatable(t, chat_completion_named_tool_choice_function_mt)
end

local function new_chat_completion_named_tool_choice_function(name)
	return cast_chat_completion_named_tool_choice_function({
		["name"] = name;
	})
end

return {
	cast = cast_chat_completion_named_tool_choice_function;
	new = new_chat_completion_named_tool_choice_function;
}
