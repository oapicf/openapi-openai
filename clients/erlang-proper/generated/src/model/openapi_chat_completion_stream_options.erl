-module(openapi_chat_completion_stream_options).

-include("openapi.hrl").

-export([openapi_chat_completion_stream_options/0]).

-export([openapi_chat_completion_stream_options/1]).

-export_type([openapi_chat_completion_stream_options/0]).

-type openapi_chat_completion_stream_options() ::
  [ {'include_usage', boolean() }
  ].


openapi_chat_completion_stream_options() ->
    openapi_chat_completion_stream_options([]).

openapi_chat_completion_stream_options(Fields) ->
  Default = [ {'include_usage', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

