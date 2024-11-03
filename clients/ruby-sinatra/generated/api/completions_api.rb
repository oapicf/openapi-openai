require 'json'


MyApp.add_route('POST', '/v1/completions', {
  "resourcePath" => "/Completions",
  "summary" => "Creates a completion for the provided prompt and parameters.",
  "nickname" => "create_completion",
  "responseClass" => "CreateCompletionResponse",
  "endpoint" => "/completions",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateCompletionRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

