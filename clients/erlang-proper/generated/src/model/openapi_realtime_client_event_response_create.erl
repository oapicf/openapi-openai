-module(openapi_realtime_client_event_response_create).

-include("openapi.hrl").

-export([openapi_realtime_client_event_response_create/0]).

-export([openapi_realtime_client_event_response_create/1]).

-export_type([openapi_realtime_client_event_response_create/0]).

-type openapi_realtime_client_event_response_create() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'response', openapi_realtime_response_create_params:openapi_realtime_response_create_params() }
  ].


openapi_realtime_client_event_response_create() ->
    openapi_realtime_client_event_response_create([]).

openapi_realtime_client_event_response_create(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"response.create">>]) }
            , {'response', openapi_realtime_response_create_params:openapi_realtime_response_create_params() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

