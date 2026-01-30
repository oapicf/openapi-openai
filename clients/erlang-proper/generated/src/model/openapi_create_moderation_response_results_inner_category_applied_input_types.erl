-module(openapi_create_moderation_response_results_inner_category_applied_input_types).

-include("openapi.hrl").

-export([openapi_create_moderation_response_results_inner_category_applied_input_types/0]).

-export([openapi_create_moderation_response_results_inner_category_applied_input_types/1]).

-export_type([openapi_create_moderation_response_results_inner_category_applied_input_types/0]).

-type openapi_create_moderation_response_results_inner_category_applied_input_types() ::
  [ {'hate', list(binary()) }
  | {'hate_threatening', list(binary()) }
  | {'harassment', list(binary()) }
  | {'harassment_threatening', list(binary()) }
  | {'illicit', list(binary()) }
  | {'illicit_violent', list(binary()) }
  | {'self_harm', list(binary()) }
  | {'self_harm_intent', list(binary()) }
  | {'self_harm_instructions', list(binary()) }
  | {'sexual', list(binary()) }
  | {'sexual_minors', list(binary()) }
  | {'violence', list(binary()) }
  | {'violence_graphic', list(binary()) }
  ].


openapi_create_moderation_response_results_inner_category_applied_input_types() ->
    openapi_create_moderation_response_results_inner_category_applied_input_types([]).

openapi_create_moderation_response_results_inner_category_applied_input_types(Fields) ->
  Default = [ {'hate', list(binary()) }
            , {'hate/threatening', list(binary()) }
            , {'harassment', list(binary()) }
            , {'harassment/threatening', list(binary()) }
            , {'illicit', list(binary()) }
            , {'illicit/violent', list(binary()) }
            , {'self-harm', list(binary()) }
            , {'self-harm/intent', list(binary()) }
            , {'self-harm/instructions', list(binary()) }
            , {'sexual', list(binary()) }
            , {'sexual/minors', list(binary()) }
            , {'violence', list(binary()) }
            , {'violence/graphic', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

