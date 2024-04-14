--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_step_delta_object_delta class
local run_step_delta_object_delta = {}
local run_step_delta_object_delta_mt = {
	__name = "run_step_delta_object_delta";
	__index = run_step_delta_object_delta;
}

local function cast_run_step_delta_object_delta(t)
	return setmetatable(t, run_step_delta_object_delta_mt)
end

local function new_run_step_delta_object_delta(step_details)
	return cast_run_step_delta_object_delta({
		["step_details"] = step_details;
	})
end

return {
	cast = cast_run_step_delta_object_delta;
	new = new_run_step_delta_object_delta;
}
