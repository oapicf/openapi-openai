-module(openapi_realtime_response_status_details_error).

-include("openapi.hrl").

-export([openapi_realtime_response_status_details_error/0]).

-export([openapi_realtime_response_status_details_error/1]).

-export_type([openapi_realtime_response_status_details_error/0]).

-type openapi_realtime_response_status_details_error() ::
  [ {'type', binary() }
  | {'code', binary() }
  ].


openapi_realtime_response_status_details_error() ->
    openapi_realtime_response_status_details_error([]).

openapi_realtime_response_status_details_error(Fields) ->
  Default = [ {'type', binary() }
            , {'code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

