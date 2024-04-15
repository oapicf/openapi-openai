--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_step_details_tool_calls_retrieval_object class
local run_step_details_tool_calls_retrieval_object = {}
local run_step_details_tool_calls_retrieval_object_mt = {
	__name = "run_step_details_tool_calls_retrieval_object";
	__index = run_step_details_tool_calls_retrieval_object;
}

local function cast_run_step_details_tool_calls_retrieval_object(t)
	return setmetatable(t, run_step_details_tool_calls_retrieval_object_mt)
end

local function new_run_step_details_tool_calls_retrieval_object(id, type, retrieval)
	return cast_run_step_details_tool_calls_retrieval_object({
		["id"] = id;
		["type"] = type;
		["retrieval"] = retrieval;
	})
end

return {
	cast = cast_run_step_details_tool_calls_retrieval_object;
	new = new_run_step_details_tool_calls_retrieval_object;
}