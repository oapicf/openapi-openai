require 'json'


MyApp.add_route('DELETE', '/v1/models/{model}', {
  "resourcePath" => "/Models",
  "summary" => "Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.",
  "nickname" => "delete_model",
  "responseClass" => "DeleteModelResponse",
  "endpoint" => "/models/{model}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "model",
      "description" => "The model to delete",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/models', {
  "resourcePath" => "/Models",
  "summary" => "Lists the currently available models, and provides basic information about each one such as the owner and availability.",
  "nickname" => "list_models",
  "responseClass" => "ListModelsResponse",
  "endpoint" => "/models",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/models/{model}', {
  "resourcePath" => "/Models",
  "summary" => "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.",
  "nickname" => "retrieve_model",
  "responseClass" => "Model",
  "endpoint" => "/models/{model}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "model",
      "description" => "The ID of the model to use for this request",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

