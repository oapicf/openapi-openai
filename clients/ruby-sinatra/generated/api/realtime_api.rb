require 'json'


MyApp.add_route('POST', '/v1/realtime/sessions', {
  "resourcePath" => "/Realtime",
  "summary" => "Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. ",
  "nickname" => "create_realtime_session",
  "responseClass" => "RealtimeSessionCreateResponse",
  "endpoint" => "/realtime/sessions",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Create an ephemeral API key with the given session configuration.",
      "dataType" => "RealtimeSessionCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

