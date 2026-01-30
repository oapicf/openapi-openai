require 'json'


MyApp.add_route('POST', '/v1/chat/completions', {
  "resourcePath" => "/Chat",
  "summary" => "Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). ",
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

