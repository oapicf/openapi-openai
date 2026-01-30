-module(openapi_realtime_response).

-include("openapi.hrl").

-export([openapi_realtime_response/0]).

-export([openapi_realtime_response/1]).

-export_type([openapi_realtime_response/0]).

-type openapi_realtime_response() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'status', binary() }
  | {'status_details', openapi_realtime_response_status_details:openapi_realtime_response_status_details() }
  | {'output', list(openapi_realtime_conversation_item:openapi_realtime_conversation_item()) }
  | {'metadata', map() }
  | {'usage', openapi_realtime_response_usage:openapi_realtime_response_usage() }
  ].


openapi_realtime_response() ->
    openapi_realtime_response([]).

openapi_realtime_response(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"realtime.response">>]) }
            , {'status', elements([<<"completed">>, <<"cancelled">>, <<"failed">>, <<"incomplete">>]) }
            , {'status_details', openapi_realtime_response_status_details:openapi_realtime_response_status_details() }
            , {'output', list(openapi_realtime_conversation_item:openapi_realtime_conversation_item()) }
            , {'metadata', map() }
            , {'usage', openapi_realtime_response_usage:openapi_realtime_response_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

