require 'json'


MyApp.add_route('POST', '/v1/chat/completions', {
  "resourcePath" => "/Chat",
  "summary" => "Creates a model response for the given chat conversation.",
  "nickname" => "create_chat_completion",
  "responseClass" => "CreateChatCompletionResponse",
  "endpoint" => "/chat/completions",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateChatCompletionRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

