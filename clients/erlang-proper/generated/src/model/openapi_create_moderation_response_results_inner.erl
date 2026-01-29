-module(openapi_create_moderation_response_results_inner).

-include("openapi.hrl").

-export([openapi_create_moderation_response_results_inner/0]).

-export([openapi_create_moderation_response_results_inner/1]).

-export_type([openapi_create_moderation_response_results_inner/0]).

-type openapi_create_moderation_response_results_inner() ::
  [ {'flagged', boolean() }
  | {'categories', openapi_create_moderation_response_results_inner_categories:openapi_create_moderation_response_results_inner_categories() }
  | {'category_scores', openapi_create_moderation_response_results_inner_category_scores:openapi_create_moderation_response_results_inner_category_scores() }
  ].


openapi_create_moderation_response_results_inner() ->
    openapi_create_moderation_response_results_inner([]).

openapi_create_moderation_response_results_inner(Fields) ->
  Default = [ {'flagged', boolean() }
            , {'categories', openapi_create_moderation_response_results_inner_categories:openapi_create_moderation_response_results_inner_categories() }
            , {'category_scores', openapi_create_moderation_response_results_inner_category_scores:openapi_create_moderation_response_results_inner_category_scores() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

