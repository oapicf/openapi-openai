--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_fine_tuning_job_request_integrations_inner_wandb class
local create_fine_tuning_job_request_integrations_inner_wandb = {}
local create_fine_tuning_job_request_integrations_inner_wandb_mt = {
	__name = "create_fine_tuning_job_request_integrations_inner_wandb";
	__index = create_fine_tuning_job_request_integrations_inner_wandb;
}

local function cast_create_fine_tuning_job_request_integrations_inner_wandb(t)
	return setmetatable(t, create_fine_tuning_job_request_integrations_inner_wandb_mt)
end

local function new_create_fine_tuning_job_request_integrations_inner_wandb(project, name, entity, tags)
	return cast_create_fine_tuning_job_request_integrations_inner_wandb({
		["project"] = project;
		["name"] = name;
		["entity"] = entity;
		["tags"] = tags;
	})
end

return {
	cast = cast_create_fine_tuning_job_request_integrations_inner_wandb;
	new = new_create_fine_tuning_job_request_integrations_inner_wandb;
}
