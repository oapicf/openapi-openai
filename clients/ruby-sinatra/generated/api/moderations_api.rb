require 'json'


MyApp.add_route('POST', '/v1/moderations', {
  "resourcePath" => "/Moderations",
  "summary" => "Classifies if text is potentially harmful.",
  "nickname" => "create_moderation",
  "responseClass" => "CreateModerationResponse",
  "endpoint" => "/moderations",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateModerationRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

