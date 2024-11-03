--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- thread_stream_event class
local thread_stream_event = {}
local thread_stream_event_mt = {
	__name = "thread_stream_event";
	__index = thread_stream_event;
}

local function cast_thread_stream_event(t)
	return setmetatable(t, thread_stream_event_mt)
end

local function new_thread_stream_event(event, data)
	return cast_thread_stream_event({
		["event"] = event;
		["data"] = data;
	})
end

return {
	cast = cast_thread_stream_event;
	new = new_thread_stream_event;
}
