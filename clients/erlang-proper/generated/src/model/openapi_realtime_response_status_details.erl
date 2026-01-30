-module(openapi_realtime_response_status_details).

-include("openapi.hrl").

-export([openapi_realtime_response_status_details/0]).

-export([openapi_realtime_response_status_details/1]).

-export_type([openapi_realtime_response_status_details/0]).

-type openapi_realtime_response_status_details() ::
  [ {'type', binary() }
  | {'reason', binary() }
  | {'error', openapi_realtime_response_status_details_error:openapi_realtime_response_status_details_error() }
  ].


openapi_realtime_response_status_details() ->
    openapi_realtime_response_status_details([]).

openapi_realtime_response_status_details(Fields) ->
  Default = [ {'type', elements([<<"completed">>, <<"cancelled">>, <<"failed">>, <<"incomplete">>]) }
            , {'reason', elements([<<"turn_detected">>, <<"client_cancelled">>, <<"max_output_tokens">>, <<"content_filter">>]) }
            , {'error', openapi_realtime_response_status_details_error:openapi_realtime_response_status_details_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

