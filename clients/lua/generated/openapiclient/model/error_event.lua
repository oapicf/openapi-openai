--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- error_event class
local error_event = {}
local error_event_mt = {
	__name = "error_event";
	__index = error_event;
}

local function cast_error_event(t)
	return setmetatable(t, error_event_mt)
end

local function new_error_event(event, data)
	return cast_error_event({
		["event"] = event;
		["data"] = data;
	})
end

return {
	cast = cast_error_event;
	new = new_error_event;
}
