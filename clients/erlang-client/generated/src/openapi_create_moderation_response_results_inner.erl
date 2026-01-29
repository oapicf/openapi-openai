-module(openapi_create_moderation_response_results_inner).

-export([encode/1]).

-export_type([openapi_create_moderation_response_results_inner/0]).

-type openapi_create_moderation_response_results_inner() ::
    #{ 'flagged' := boolean(),
       'categories' := openapi_create_moderation_response_results_inner_categories:openapi_create_moderation_response_results_inner_categories(),
       'category_scores' := openapi_create_moderation_response_results_inner_category_scores:openapi_create_moderation_response_results_inner_category_scores()
     }.

encode(#{ 'flagged' := Flagged,
          'categories' := Categories,
          'category_scores' := CategoryScores
        }) ->
    #{ 'flagged' => Flagged,
       'categories' => Categories,
       'category_scores' => CategoryScores
     }.
