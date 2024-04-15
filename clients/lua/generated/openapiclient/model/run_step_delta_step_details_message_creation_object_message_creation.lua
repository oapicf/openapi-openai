--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- run_step_delta_step_details_message_creation_object_message_creation class
local run_step_delta_step_details_message_creation_object_message_creation = {}
local run_step_delta_step_details_message_creation_object_message_creation_mt = {
	__name = "run_step_delta_step_details_message_creation_object_message_creation";
	__index = run_step_delta_step_details_message_creation_object_message_creation;
}

local function cast_run_step_delta_step_details_message_creation_object_message_creation(t)
	return setmetatable(t, run_step_delta_step_details_message_creation_object_message_creation_mt)
end

local function new_run_step_delta_step_details_message_creation_object_message_creation(message_id)
	return cast_run_step_delta_step_details_message_creation_object_message_creation({
		["message_id"] = message_id;
	})
end

return {
	cast = cast_run_step_delta_step_details_message_creation_object_message_creation;
	new = new_run_step_delta_step_details_message_creation_object_message_creation;
}