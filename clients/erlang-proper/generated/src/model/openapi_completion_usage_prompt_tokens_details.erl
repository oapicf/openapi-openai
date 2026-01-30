-module(openapi_completion_usage_prompt_tokens_details).

-include("openapi.hrl").

-export([openapi_completion_usage_prompt_tokens_details/0]).

-export([openapi_completion_usage_prompt_tokens_details/1]).

-export_type([openapi_completion_usage_prompt_tokens_details/0]).

-type openapi_completion_usage_prompt_tokens_details() ::
  [ {'audio_tokens', integer() }
  | {'cached_tokens', integer() }
  ].


openapi_completion_usage_prompt_tokens_details() ->
    openapi_completion_usage_prompt_tokens_details([]).

openapi_completion_usage_prompt_tokens_details(Fields) ->
  Default = [ {'audio_tokens', integer() }
            , {'cached_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

