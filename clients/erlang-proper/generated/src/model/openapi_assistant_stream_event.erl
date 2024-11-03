-module(openapi_assistant_stream_event).

-include("openapi.hrl").

-export([openapi_assistant_stream_event/0]).

-export([openapi_assistant_stream_event/1]).

-export_type([openapi_assistant_stream_event/0]).

-type openapi_assistant_stream_event() ::
  [ {'event', binary() }
  | {'data', binary() }
  ].


openapi_assistant_stream_event() ->
    openapi_assistant_stream_event([]).

openapi_assistant_stream_event(Fields) ->
  Default = [ {'event', elements([<<"done">>]) }
            , {'data', elements([<<"[DONE]">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

