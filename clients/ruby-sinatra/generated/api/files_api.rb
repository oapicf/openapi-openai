require 'json'


MyApp.add_route('POST', '/v1/files', {
  "resourcePath" => "/Files",
  "summary" => "Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ",
  "nickname" => "create_file",
  "responseClass" => "OpenAIFile",
  "endpoint" => "/files",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/files/{file_id}', {
  "resourcePath" => "/Files",
  "summary" => "Delete a file.",
  "nickname" => "delete_file",
  "responseClass" => "DeleteFileResponse",
  "endpoint" => "/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "file_id",
      "description" => "The ID of the file to use for this request.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/files/{file_id}/content', {
  "resourcePath" => "/Files",
  "summary" => "Returns the contents of the specified file.",
  "nickname" => "download_file",
  "responseClass" => "String",
  "endpoint" => "/files/{file_id}/content",
  "notes" => "",
  "parameters" => [
    {
      "name" => "file_id",
      "description" => "The ID of the file to use for this request.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/files', {
  "resourcePath" => "/Files",
  "summary" => "Returns a list of files that belong to the user's organization.",
  "nickname" => "list_files",
  "responseClass" => "ListFilesResponse",
  "endpoint" => "/files",
  "notes" => "",
  "parameters" => [
    {
      "name" => "purpose",
      "description" => "Only return files with the given purpose.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/files/{file_id}', {
  "resourcePath" => "/Files",
  "summary" => "Returns information about a specific file.",
  "nickname" => "retrieve_file",
  "responseClass" => "OpenAIFile",
  "endpoint" => "/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "file_id",
      "description" => "The ID of the file to use for this request.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

