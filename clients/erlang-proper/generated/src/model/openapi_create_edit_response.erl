-module(openapi_create_edit_response).

-include("openapi.hrl").

-export([openapi_create_edit_response/0]).

-export([openapi_create_edit_response/1]).

-export_type([openapi_create_edit_response/0]).

-type openapi_create_edit_response() ::
  [ {'object', binary() }
  | {'created', integer() }
  | {'choices', list(openapi_create_edit_response_choices_inner:openapi_create_edit_response_choices_inner()) }
  | {'usage', openapi_create_completion_response_usage:openapi_create_completion_response_usage() }
  ].


openapi_create_edit_response() ->
    openapi_create_edit_response([]).

openapi_create_edit_response(Fields) ->
  Default = [ {'object', binary() }
            , {'created', integer() }
            , {'choices', list(openapi_create_edit_response_choices_inner:openapi_create_edit_response_choices_inner()) }
            , {'usage', openapi_create_completion_response_usage:openapi_create_completion_response_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

