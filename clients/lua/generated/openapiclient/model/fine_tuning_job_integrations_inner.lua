--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- fine_tuning_job_integrations_inner class
local fine_tuning_job_integrations_inner = {}
local fine_tuning_job_integrations_inner_mt = {
	__name = "fine_tuning_job_integrations_inner";
	__index = fine_tuning_job_integrations_inner;
}

local function cast_fine_tuning_job_integrations_inner(t)
	return setmetatable(t, fine_tuning_job_integrations_inner_mt)
end

local function new_fine_tuning_job_integrations_inner(type, wandb)
	return cast_fine_tuning_job_integrations_inner({
		["type"] = type;
		["wandb"] = wandb;
	})
end

return {
	cast = cast_fine_tuning_job_integrations_inner;
	new = new_fine_tuning_job_integrations_inner;
}
