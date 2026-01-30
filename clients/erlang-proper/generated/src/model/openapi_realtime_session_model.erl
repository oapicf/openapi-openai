-module(openapi_realtime_session_model).

-include("openapi.hrl").

-export([openapi_realtime_session_model/0]).

-export([openapi_realtime_session_model/1]).

-export_type([openapi_realtime_session_model/0]).

-type openapi_realtime_session_model() ::
  [ 
  ].


openapi_realtime_session_model() ->
    openapi_realtime_session_model([]).

openapi_realtime_session_model(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

