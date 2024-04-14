--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- message_content_text_object class
local message_content_text_object = {}
local message_content_text_object_mt = {
	__name = "message_content_text_object";
	__index = message_content_text_object;
}

local function cast_message_content_text_object(t)
	return setmetatable(t, message_content_text_object_mt)
end

local function new_message_content_text_object(type, text)
	return cast_message_content_text_object({
		["type"] = type;
		["text"] = text;
	})
end

return {
	cast = cast_message_content_text_object;
	new = new_message_content_text_object;
}
