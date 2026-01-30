-module(openapi_realtime_session_create_response_client_secret).

-export([encode/1]).

-export_type([openapi_realtime_session_create_response_client_secret/0]).

-type openapi_realtime_session_create_response_client_secret() ::
    #{ 'value' => binary(),
       'expires_at' => integer()
     }.

encode(#{ 'value' := Value,
          'expires_at' := ExpiresAt
        }) ->
    #{ 'value' => Value,
       'expires_at' => ExpiresAt
     }.
