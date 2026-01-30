-module(openapi_create_moderation_response_results_inner).

-export([encode/1]).

-export_type([openapi_create_moderation_response_results_inner/0]).

-type openapi_create_moderation_response_results_inner() ::
    #{ 'flagged' := boolean(),
       'categories' := openapi_create_moderation_response_results_inner_categories:openapi_create_moderation_response_results_inner_categories(),
       'category_scores' := openapi_create_moderation_response_results_inner_category_scores:openapi_create_moderation_response_results_inner_category_scores(),
       'category_applied_input_types' := openapi_create_moderation_response_results_inner_category_applied_input_types:openapi_create_moderation_response_results_inner_category_applied_input_types()
     }.

encode(#{ 'flagged' := Flagged,
          'categories' := Categories,
          'category_scores' := CategoryScores,
          'category_applied_input_types' := CategoryAppliedInputTypes
        }) ->
    #{ 'flagged' => Flagged,
       'categories' => Categories,
       'category_scores' => CategoryScores,
       'category_applied_input_types' => CategoryAppliedInputTypes
     }.
