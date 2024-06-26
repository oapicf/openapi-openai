--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_stream_event class
local run_stream_event = {}
local run_stream_event_mt = {
	__name = "run_stream_event";
	__index = run_stream_event;
}

local function cast_run_stream_event(t)
	return setmetatable(t, run_stream_event_mt)
end

local function new_run_stream_event(event, data)
	return cast_run_stream_event({
		["event"] = event;
		["data"] = data;
	})
end

return {
	cast = cast_run_stream_event;
	new = new_run_stream_event;
}
