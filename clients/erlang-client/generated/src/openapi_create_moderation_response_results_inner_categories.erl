-module(openapi_create_moderation_response_results_inner_categories).

-export([encode/1]).

-export_type([openapi_create_moderation_response_results_inner_categories/0]).

-type openapi_create_moderation_response_results_inner_categories() ::
    #{ 'hate' := boolean(),
       'hate_threatening' := boolean(),
       'self_harm' := boolean(),
       'sexual' := boolean(),
       'sexual_minors' := boolean(),
       'violence' := boolean(),
       'violence_graphic' := boolean()
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
