--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- chat_completion_request_message_content_part_image class
local chat_completion_request_message_content_part_image = {}
local chat_completion_request_message_content_part_image_mt = {
	__name = "chat_completion_request_message_content_part_image";
	__index = chat_completion_request_message_content_part_image;
}

local function cast_chat_completion_request_message_content_part_image(t)
	return setmetatable(t, chat_completion_request_message_content_part_image_mt)
end

local function new_chat_completion_request_message_content_part_image(type, image_url)
	return cast_chat_completion_request_message_content_part_image({
		["type"] = type;
		["image_url"] = image_url;
	})
end

return {
	cast = cast_chat_completion_request_message_content_part_image;
	new = new_chat_completion_request_message_content_part_image;
}
