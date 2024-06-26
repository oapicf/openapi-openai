--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- list_fine_tuning_job_events_response class
local list_fine_tuning_job_events_response = {}
local list_fine_tuning_job_events_response_mt = {
	__name = "list_fine_tuning_job_events_response";
	__index = list_fine_tuning_job_events_response;
}

local function cast_list_fine_tuning_job_events_response(t)
	return setmetatable(t, list_fine_tuning_job_events_response_mt)
end

local function new_list_fine_tuning_job_events_response(data, object)
	return cast_list_fine_tuning_job_events_response({
		["data"] = data;
		["object"] = object;
	})
end

return {
	cast = cast_list_fine_tuning_job_events_response;
	new = new_list_fine_tuning_job_events_response;
}
