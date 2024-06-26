--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_step_stream_event_one_of_6 class
local run_step_stream_event_one_of_6 = {}
local run_step_stream_event_one_of_6_mt = {
	__name = "run_step_stream_event_one_of_6";
	__index = run_step_stream_event_one_of_6;
}

local function cast_run_step_stream_event_one_of_6(t)
	return setmetatable(t, run_step_stream_event_one_of_6_mt)
end

local function new_run_step_stream_event_one_of_6(event, data)
	return cast_run_step_stream_event_one_of_6({
		["event"] = event;
		["data"] = data;
	})
end

return {
	cast = cast_run_step_stream_event_one_of_6;
	new = new_run_step_stream_event_one_of_6;
}
