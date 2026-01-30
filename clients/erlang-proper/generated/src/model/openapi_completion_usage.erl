-module(openapi_completion_usage).

-include("openapi.hrl").

-export([openapi_completion_usage/0]).

-export([openapi_completion_usage/1]).

-export_type([openapi_completion_usage/0]).

-type openapi_completion_usage() ::
  [ {'completion_tokens', integer() }
  | {'prompt_tokens', integer() }
  | {'total_tokens', integer() }
  | {'completion_tokens_details', openapi_completion_usage_completion_tokens_details:openapi_completion_usage_completion_tokens_details() }
  | {'prompt_tokens_details', openapi_completion_usage_prompt_tokens_details:openapi_completion_usage_prompt_tokens_details() }
  ].


openapi_completion_usage() ->
    openapi_completion_usage([]).

openapi_completion_usage(Fields) ->
  Default = [ {'completion_tokens', integer() }
            , {'prompt_tokens', integer() }
            , {'total_tokens', integer() }
            , {'completion_tokens_details', openapi_completion_usage_completion_tokens_details:openapi_completion_usage_completion_tokens_details() }
            , {'prompt_tokens_details', openapi_completion_usage_prompt_tokens_details:openapi_completion_usage_prompt_tokens_details() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

