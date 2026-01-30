require 'json'


MyApp.add_route('POST', '/v1/files', {
  "resourcePath" => "/Files",
  "summary" => "Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ",
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
  "summary" => "Returns a list of files.",
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
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "10000",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
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

