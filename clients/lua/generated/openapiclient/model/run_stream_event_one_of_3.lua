--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_stream_event_one_of_3 class
local run_stream_event_one_of_3 = {}
local run_stream_event_one_of_3_mt = {
	__name = "run_stream_event_one_of_3";
	__index = run_stream_event_one_of_3;
}

local function cast_run_stream_event_one_of_3(t)
	return setmetatable(t, run_stream_event_one_of_3_mt)
end

local function new_run_stream_event_one_of_3(event, data)
	return cast_run_stream_event_one_of_3({
		["event"] = event;
		["data"] = data;
	})
end

return {
	cast = cast_run_stream_event_one_of_3;
	new = new_run_stream_event_one_of_3;
}
