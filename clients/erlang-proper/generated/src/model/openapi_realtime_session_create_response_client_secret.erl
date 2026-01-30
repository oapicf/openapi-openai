-module(openapi_realtime_session_create_response_client_secret).

-include("openapi.hrl").

-export([openapi_realtime_session_create_response_client_secret/0]).

-export([openapi_realtime_session_create_response_client_secret/1]).

-export_type([openapi_realtime_session_create_response_client_secret/0]).

-type openapi_realtime_session_create_response_client_secret() ::
  [ {'value', binary() }
  | {'expires_at', integer() }
  ].


openapi_realtime_session_create_response_client_secret() ->
    openapi_realtime_session_create_response_client_secret([]).

openapi_realtime_session_create_response_client_secret(Fields) ->
  Default = [ {'value', binary() }
            , {'expires_at', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

