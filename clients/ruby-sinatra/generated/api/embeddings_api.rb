require 'json'


MyApp.add_route('POST', '/v1/embeddings', {
  "resourcePath" => "/Embeddings",
  "summary" => "Creates an embedding vector representing the input text.",
  "nickname" => "create_embedding",
  "responseClass" => "CreateEmbeddingResponse",
  "endpoint" => "/embeddings",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateEmbeddingRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

