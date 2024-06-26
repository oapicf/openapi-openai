--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- fine_tuning_job_error class
local fine_tuning_job_error = {}
local fine_tuning_job_error_mt = {
	__name = "fine_tuning_job_error";
	__index = fine_tuning_job_error;
}

local function cast_fine_tuning_job_error(t)
	return setmetatable(t, fine_tuning_job_error_mt)
end

local function new_fine_tuning_job_error(code, message, param)
	return cast_fine_tuning_job_error({
		["code"] = code;
		["message"] = message;
		["param"] = param;
	})
end

return {
	cast = cast_fine_tuning_job_error;
	new = new_fine_tuning_job_error;
}
