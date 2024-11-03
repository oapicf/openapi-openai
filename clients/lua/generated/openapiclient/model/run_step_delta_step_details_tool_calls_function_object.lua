--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_step_delta_step_details_tool_calls_function_object class
local run_step_delta_step_details_tool_calls_function_object = {}
local run_step_delta_step_details_tool_calls_function_object_mt = {
	__name = "run_step_delta_step_details_tool_calls_function_object";
	__index = run_step_delta_step_details_tool_calls_function_object;
}

local function cast_run_step_delta_step_details_tool_calls_function_object(t)
	return setmetatable(t, run_step_delta_step_details_tool_calls_function_object_mt)
end

local function new_run_step_delta_step_details_tool_calls_function_object(index, id, type, Function_)
	return cast_run_step_delta_step_details_tool_calls_function_object({
		["index"] = index;
		["id"] = id;
		["type"] = type;
		["function"] = Function_;
	})
end

return {
	cast = cast_run_step_delta_step_details_tool_calls_function_object;
	new = new_run_step_delta_step_details_tool_calls_function_object;
}
