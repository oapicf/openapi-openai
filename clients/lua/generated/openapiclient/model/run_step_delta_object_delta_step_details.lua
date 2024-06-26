--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_step_delta_object_delta_step_details class
local run_step_delta_object_delta_step_details = {}
local run_step_delta_object_delta_step_details_mt = {
	__name = "run_step_delta_object_delta_step_details";
	__index = run_step_delta_object_delta_step_details;
}

local function cast_run_step_delta_object_delta_step_details(t)
	return setmetatable(t, run_step_delta_object_delta_step_details_mt)
end

local function new_run_step_delta_object_delta_step_details(type, message_creation, tool_calls)
	return cast_run_step_delta_object_delta_step_details({
		["type"] = type;
		["message_creation"] = message_creation;
		["tool_calls"] = tool_calls;
	})
end

return {
	cast = cast_run_step_delta_object_delta_step_details;
	new = new_run_step_delta_object_delta_step_details;
}
