--[[
  OpenAI API

  APIs for sampling from and fine-tuning language models

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_fine_tune_request class
local create_fine_tune_request = {}
local create_fine_tune_request_mt = {
	__name = "create_fine_tune_request";
	__index = create_fine_tune_request;
}

local function cast_create_fine_tune_request(t)
	return setmetatable(t, create_fine_tune_request_mt)
end

local function new_create_fine_tune_request(training_file, validation_file, model, n_epochs, batch_size, learning_rate_multiplier, prompt_loss_weight, compute_classification_metrics, classification_n_classes, classification_positive_class, classification_betas, suffix)
	return cast_create_fine_tune_request({
		["training_file"] = training_file;
		["validation_file"] = validation_file;
		["model"] = model;
		["n_epochs"] = n_epochs;
		["batch_size"] = batch_size;
		["learning_rate_multiplier"] = learning_rate_multiplier;
		["prompt_loss_weight"] = prompt_loss_weight;
		["compute_classification_metrics"] = compute_classification_metrics;
		["classification_n_classes"] = classification_n_classes;
		["classification_positive_class"] = classification_positive_class;
		["classification_betas"] = classification_betas;
		["suffix"] = suffix;
	})
end

return {
	cast = cast_create_fine_tune_request;
	new = new_create_fine_tune_request;
}
