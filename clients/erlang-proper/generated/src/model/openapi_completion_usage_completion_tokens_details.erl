-module(openapi_completion_usage_completion_tokens_details).

-include("openapi.hrl").

-export([openapi_completion_usage_completion_tokens_details/0]).

-export([openapi_completion_usage_completion_tokens_details/1]).

-export_type([openapi_completion_usage_completion_tokens_details/0]).

-type openapi_completion_usage_completion_tokens_details() ::
  [ {'accepted_prediction_tokens', integer() }
  | {'audio_tokens', integer() }
  | {'reasoning_tokens', integer() }
  | {'rejected_prediction_tokens', integer() }
  ].


openapi_completion_usage_completion_tokens_details() ->
    openapi_completion_usage_completion_tokens_details([]).

openapi_completion_usage_completion_tokens_details(Fields) ->
  Default = [ {'accepted_prediction_tokens', integer() }
            , {'audio_tokens', integer() }
            , {'reasoning_tokens', integer() }
            , {'rejected_prediction_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

