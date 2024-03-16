-module(openapi_create_moderation_response_results_inner_category_scores).

-include("openapi.hrl").

-export([openapi_create_moderation_response_results_inner_category_scores/0]).

-export([openapi_create_moderation_response_results_inner_category_scores/1]).

-export_type([openapi_create_moderation_response_results_inner_category_scores/0]).

-type openapi_create_moderation_response_results_inner_category_scores() ::
  [ {'hate', integer() }
  | {'hate_threatening', integer() }
  | {'self_harm', integer() }
  | {'sexual', integer() }
  | {'sexual_minors', integer() }
  | {'violence', integer() }
  | {'violence_graphic', integer() }
  ].


openapi_create_moderation_response_results_inner_category_scores() ->
    openapi_create_moderation_response_results_inner_category_scores([]).

openapi_create_moderation_response_results_inner_category_scores(Fields) ->
  Default = [ {'hate', integer() }
            , {'hate/threatening', integer() }
            , {'self-harm', integer() }
            , {'sexual', integer() }
            , {'sexual/minors', integer() }
            , {'violence', integer() }
            , {'violence/graphic', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

