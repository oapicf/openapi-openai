--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- chat_completion_request_message_content_part_text class
local chat_completion_request_message_content_part_text = {}
local chat_completion_request_message_content_part_text_mt = {
	__name = "chat_completion_request_message_content_part_text";
	__index = chat_completion_request_message_content_part_text;
}

local function cast_chat_completion_request_message_content_part_text(t)
	return setmetatable(t, chat_completion_request_message_content_part_text_mt)
end

local function new_chat_completion_request_message_content_part_text(type, text)
	return cast_chat_completion_request_message_content_part_text({
		["type"] = type;
		["text"] = text;
	})
end

return {
	cast = cast_chat_completion_request_message_content_part_text;
	new = new_chat_completion_request_message_content_part_text;
}
