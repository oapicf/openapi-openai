-module(openapi_create_moderation_response).

-include("openapi.hrl").

-export([openapi_create_moderation_response/0]).

-export([openapi_create_moderation_response/1]).

-export_type([openapi_create_moderation_response/0]).

-type openapi_create_moderation_response() ::
  [ {'id', binary() }
  | {'model', binary() }
  | {'results', list(openapi_create_moderation_response_results_inner:openapi_create_moderation_response_results_inner()) }
  ].


openapi_create_moderation_response() ->
    openapi_create_moderation_response([]).

openapi_create_moderation_response(Fields) ->
  Default = [ {'id', binary() }
            , {'model', binary() }
            , {'results', list(openapi_create_moderation_response_results_inner:openapi_create_moderation_response_results_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

