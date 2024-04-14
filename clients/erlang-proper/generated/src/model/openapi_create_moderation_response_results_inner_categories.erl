-module(openapi_create_moderation_response_results_inner_categories).

-include("openapi.hrl").

-export([openapi_create_moderation_response_results_inner_categories/0]).

-export([openapi_create_moderation_response_results_inner_categories/1]).

-export_type([openapi_create_moderation_response_results_inner_categories/0]).

-type openapi_create_moderation_response_results_inner_categories() ::
  [ {'hate', boolean() }
  | {'hate_threatening', boolean() }
  | {'harassment', boolean() }
  | {'harassment_threatening', boolean() }
  | {'self_harm', boolean() }
  | {'self_harm_intent', boolean() }
  | {'self_harm_instructions', boolean() }
  | {'sexual', boolean() }
  | {'sexual_minors', boolean() }
  | {'violence', boolean() }
  | {'violence_graphic', boolean() }
  ].


openapi_create_moderation_response_results_inner_categories() ->
    openapi_create_moderation_response_results_inner_categories([]).

openapi_create_moderation_response_results_inner_categories(Fields) ->
  Default = [ {'hate', boolean() }
            , {'hate/threatening', boolean() }
            , {'harassment', boolean() }
            , {'harassment/threatening', boolean() }
            , {'self-harm', boolean() }
            , {'self-harm/intent', boolean() }
            , {'self-harm/instructions', boolean() }
            , {'sexual', boolean() }
            , {'sexual/minors', boolean() }
            , {'violence', boolean() }
            , {'violence/graphic', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

