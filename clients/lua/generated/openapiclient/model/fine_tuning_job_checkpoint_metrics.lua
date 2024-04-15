--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- fine_tuning_job_checkpoint_metrics class
local fine_tuning_job_checkpoint_metrics = {}
local fine_tuning_job_checkpoint_metrics_mt = {
	__name = "fine_tuning_job_checkpoint_metrics";
	__index = fine_tuning_job_checkpoint_metrics;
}

local function cast_fine_tuning_job_checkpoint_metrics(t)
	return setmetatable(t, fine_tuning_job_checkpoint_metrics_mt)
end

local function new_fine_tuning_job_checkpoint_metrics(step, train_loss, train_mean_token_accuracy, valid_loss, valid_mean_token_accuracy, full_valid_loss, full_valid_mean_token_accuracy)
	return cast_fine_tuning_job_checkpoint_metrics({
		["step"] = step;
		["train_loss"] = train_loss;
		["train_mean_token_accuracy"] = train_mean_token_accuracy;
		["valid_loss"] = valid_loss;
		["valid_mean_token_accuracy"] = valid_mean_token_accuracy;
		["full_valid_loss"] = full_valid_loss;
		["full_valid_mean_token_accuracy"] = full_valid_mean_token_accuracy;
	})
end

return {
	cast = cast_fine_tuning_job_checkpoint_metrics;
	new = new_fine_tuning_job_checkpoint_metrics;
}