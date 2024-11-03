--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- chat_completion_tool class
local chat_completion_tool = {}
local chat_completion_tool_mt = {
	__name = "chat_completion_tool";
	__index = chat_completion_tool;
}

local function cast_chat_completion_tool(t)
	return setmetatable(t, chat_completion_tool_mt)
end

local function new_chat_completion_tool(type, Function_)
	return cast_chat_completion_tool({
		["type"] = type;
		["function"] = Function_;
	})
end

return {
	cast = cast_chat_completion_tool;
	new = new_chat_completion_tool;
}
