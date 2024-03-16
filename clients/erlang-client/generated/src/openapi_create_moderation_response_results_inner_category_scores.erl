-module(openapi_create_moderation_response_results_inner_category_scores).

-export([encode/1]).

-export_type([openapi_create_moderation_response_results_inner_category_scores/0]).

-type openapi_create_moderation_response_results_inner_category_scores() ::
    #{ 'hate' := integer(),
       'hate_threatening' := integer(),
       'self_harm' := integer(),
       'sexual' := integer(),
       'sexual_minors' := integer(),
       'violence' := integer(),
       'violence_graphic' := integer()
     }.

encode(#{ 'hate' := Hate,
          'hate_threatening' := HateThreatening,
          'self_harm' := SelfHarm,
          'sexual' := Sexual,
          'sexual_minors' := SexualMinors,
          'violence' := Violence,
          'violence_graphic' := ViolenceGraphic
        }) ->
    #{ 'hate' => Hate,
       'hate/threatening' => HateThreatening,
       'self-harm' => SelfHarm,
       'sexual' => Sexual,
       'sexual/minors' => SexualMinors,
       'violence' => Violence,
       'violence/graphic' => ViolenceGraphic
     }.
