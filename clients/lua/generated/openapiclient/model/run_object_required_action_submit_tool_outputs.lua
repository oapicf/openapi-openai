--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_object_required_action_submit_tool_outputs class
local run_object_required_action_submit_tool_outputs = {}
local run_object_required_action_submit_tool_outputs_mt = {
	__name = "run_object_required_action_submit_tool_outputs";
	__index = run_object_required_action_submit_tool_outputs;
}

local function cast_run_object_required_action_submit_tool_outputs(t)
	return setmetatable(t, run_object_required_action_submit_tool_outputs_mt)
end

local function new_run_object_required_action_submit_tool_outputs(tool_calls)
	return cast_run_object_required_action_submit_tool_outputs({
		["tool_calls"] = tool_calls;
	})
end

return {
	cast = cast_run_object_required_action_submit_tool_outputs;
	new = new_run_object_required_action_submit_tool_outputs;
}
