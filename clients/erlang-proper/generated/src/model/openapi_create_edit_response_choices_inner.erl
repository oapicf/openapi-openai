-module(openapi_create_edit_response_choices_inner).

-include("openapi.hrl").

-export([openapi_create_edit_response_choices_inner/0]).

-export([openapi_create_edit_response_choices_inner/1]).

-export_type([openapi_create_edit_response_choices_inner/0]).

-type openapi_create_edit_response_choices_inner() ::
  [ {'text', binary() }
  | {'index', integer() }
  | {'logprobs', openapi_create_completion_response_choices_inner_logprobs:openapi_create_completion_response_choices_inner_logprobs() }
  | {'finish_reason', binary() }
  ].


openapi_create_edit_response_choices_inner() ->
    openapi_create_edit_response_choices_inner([]).

openapi_create_edit_response_choices_inner(Fields) ->
  Default = [ {'text', binary() }
            , {'index', integer() }
            , {'logprobs', openapi_create_completion_response_choices_inner_logprobs:openapi_create_completion_response_choices_inner_logprobs() }
            , {'finish_reason', elements([<<"stop">>, <<"length">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

