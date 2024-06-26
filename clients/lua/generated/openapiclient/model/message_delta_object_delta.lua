--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- message_delta_object_delta class
local message_delta_object_delta = {}
local message_delta_object_delta_mt = {
	__name = "message_delta_object_delta";
	__index = message_delta_object_delta;
}

local function cast_message_delta_object_delta(t)
	return setmetatable(t, message_delta_object_delta_mt)
end

local function new_message_delta_object_delta(role, content, file_ids)
	return cast_message_delta_object_delta({
		["role"] = role;
		["content"] = content;
		["file_ids"] = file_ids;
	})
end

return {
	cast = cast_message_delta_object_delta;
	new = new_message_delta_object_delta;
}
