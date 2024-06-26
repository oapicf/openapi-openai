--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- message_stream_event_one_of_4 class
local message_stream_event_one_of_4 = {}
local message_stream_event_one_of_4_mt = {
	__name = "message_stream_event_one_of_4";
	__index = message_stream_event_one_of_4;
}

local function cast_message_stream_event_one_of_4(t)
	return setmetatable(t, message_stream_event_one_of_4_mt)
end

local function new_message_stream_event_one_of_4(event, data)
	return cast_message_stream_event_one_of_4({
		["event"] = event;
		["data"] = data;
	})
end

return {
	cast = cast_message_stream_event_one_of_4;
	new = new_message_stream_event_one_of_4;
}
