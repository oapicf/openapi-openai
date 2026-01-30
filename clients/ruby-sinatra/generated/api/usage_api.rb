require 'json'


MyApp.add_route('GET', '/v1/organization/usage/audio_speeches', {
  "resourcePath" => "/Usage",
  "summary" => "Get audio speeches usage details for the organization.",
  "nickname" => "usage_audio_speeches",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/usage/audio_speeches",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1m, 1h, 1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only usage for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "user_ids",
      "description" => "Return only usage for these users.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "api_key_ids",
      "description" => "Return only usage for these API keys.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "models",
      "description" => "Return only usage for these models.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/usage/audio_transcriptions', {
  "resourcePath" => "/Usage",
  "summary" => "Get audio transcriptions usage details for the organization.",
  "nickname" => "usage_audio_transcriptions",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/usage/audio_transcriptions",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1m, 1h, 1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only usage for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "user_ids",
      "description" => "Return only usage for these users.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "api_key_ids",
      "description" => "Return only usage for these API keys.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "models",
      "description" => "Return only usage for these models.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/usage/code_interpreter_sessions', {
  "resourcePath" => "/Usage",
  "summary" => "Get code interpreter sessions usage details for the organization.",
  "nickname" => "usage_code_interpreter_sessions",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/usage/code_interpreter_sessions",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1m, 1h, 1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only usage for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/usage/completions', {
  "resourcePath" => "/Usage",
  "summary" => "Get completions usage details for the organization.",
  "nickname" => "usage_completions",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/usage/completions",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1m, 1h, 1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only usage for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "user_ids",
      "description" => "Return only usage for these users.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "api_key_ids",
      "description" => "Return only usage for these API keys.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "models",
      "description" => "Return only usage for these models.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "batch",
      "description" => "If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/costs', {
  "resourcePath" => "/Usage",
  "summary" => "Get costs details for the organization.",
  "nickname" => "usage_costs",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/costs",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only costs for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "7",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/usage/embeddings', {
  "resourcePath" => "/Usage",
  "summary" => "Get embeddings usage details for the organization.",
  "nickname" => "usage_embeddings",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/usage/embeddings",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1m, 1h, 1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only usage for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "user_ids",
      "description" => "Return only usage for these users.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "api_key_ids",
      "description" => "Return only usage for these API keys.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "models",
      "description" => "Return only usage for these models.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/usage/images', {
  "resourcePath" => "/Usage",
  "summary" => "Get images usage details for the organization.",
  "nickname" => "usage_images",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/usage/images",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1m, 1h, 1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "sources",
      "description" => "Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "sizes",
      "description" => "Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only usage for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "user_ids",
      "description" => "Return only usage for these users.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "api_key_ids",
      "description" => "Return only usage for these API keys.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "models",
      "description" => "Return only usage for these models.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/usage/moderations', {
  "resourcePath" => "/Usage",
  "summary" => "Get moderations usage details for the organization.",
  "nickname" => "usage_moderations",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/usage/moderations",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1m, 1h, 1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only usage for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "user_ids",
      "description" => "Return only usage for these users.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "api_key_ids",
      "description" => "Return only usage for these API keys.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "models",
      "description" => "Return only usage for these models.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/organization/usage/vector_stores', {
  "resourcePath" => "/Usage",
  "summary" => "Get vector stores usage details for the organization.",
  "nickname" => "usage_vector_stores",
  "responseClass" => "UsageResponse",
  "endpoint" => "/organization/usage/vector_stores",
  "notes" => "",
  "parameters" => [
    {
      "name" => "start_time",
      "description" => "Start time (Unix seconds) of the query time range, inclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "end_time",
      "description" => "End time (Unix seconds) of the query time range, exclusive.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "bucket_width",
      "description" => "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.",
      "dataType" => "String",
      "allowableValues" => "[1m, 1h, 1d]",
      "defaultValue" => "'1d'",
      "paramType" => "query",
    },
    {
      "name" => "project_ids",
      "description" => "Return only usage for these projects.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "group_by",
      "description" => "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page",
      "description" => "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

