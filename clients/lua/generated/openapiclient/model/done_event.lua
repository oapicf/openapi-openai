--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- done_event class
local done_event = {}
local done_event_mt = {
	__name = "done_event";
	__index = done_event;
}

local function cast_done_event(t)
	return setmetatable(t, done_event_mt)
end

local function new_done_event(event, data)
	return cast_done_event({
		["event"] = event;
		["data"] = data;
	})
end

return {
	cast = cast_done_event;
	new = new_done_event;
}
