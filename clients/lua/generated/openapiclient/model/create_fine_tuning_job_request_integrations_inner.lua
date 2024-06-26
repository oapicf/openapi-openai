--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_fine_tuning_job_request_integrations_inner class
local create_fine_tuning_job_request_integrations_inner = {}
local create_fine_tuning_job_request_integrations_inner_mt = {
	__name = "create_fine_tuning_job_request_integrations_inner";
	__index = create_fine_tuning_job_request_integrations_inner;
}

local function cast_create_fine_tuning_job_request_integrations_inner(t)
	return setmetatable(t, create_fine_tuning_job_request_integrations_inner_mt)
end

local function new_create_fine_tuning_job_request_integrations_inner(type, wandb)
	return cast_create_fine_tuning_job_request_integrations_inner({
		["type"] = type;
		["wandb"] = wandb;
	})
end

return {
	cast = cast_create_fine_tuning_job_request_integrations_inner;
	new = new_create_fine_tuning_job_request_integrations_inner;
}
