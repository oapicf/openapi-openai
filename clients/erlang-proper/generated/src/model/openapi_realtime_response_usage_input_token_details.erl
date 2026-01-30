-module(openapi_realtime_response_usage_input_token_details).

-include("openapi.hrl").

-export([openapi_realtime_response_usage_input_token_details/0]).

-export([openapi_realtime_response_usage_input_token_details/1]).

-export_type([openapi_realtime_response_usage_input_token_details/0]).

-type openapi_realtime_response_usage_input_token_details() ::
  [ {'cached_tokens', integer() }
  | {'text_tokens', integer() }
  | {'audio_tokens', integer() }
  ].


openapi_realtime_response_usage_input_token_details() ->
    openapi_realtime_response_usage_input_token_details([]).

openapi_realtime_response_usage_input_token_details(Fields) ->
  Default = [ {'cached_tokens', integer() }
            , {'text_tokens', integer() }
            , {'audio_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

