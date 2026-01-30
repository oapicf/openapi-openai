require 'json'


MyApp.add_route('POST', '/v1/uploads/{upload_id}/parts', {
  "resourcePath" => "/Uploads",
  "summary" => "Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). ",
  "nickname" => "add_upload_part",
  "responseClass" => "UploadPart",
  "endpoint" => "/uploads/{upload_id}/parts",
  "notes" => "",
  "parameters" => [
    {
      "name" => "upload_id",
      "description" => "The ID of the Upload. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/uploads/{upload_id}/cancel', {
  "resourcePath" => "/Uploads",
  "summary" => "Cancels the Upload. No Parts may be added after an Upload is cancelled. ",
  "nickname" => "cancel_upload",
  "responseClass" => "Upload",
  "endpoint" => "/uploads/{upload_id}/cancel",
  "notes" => "",
  "parameters" => [
    {
      "name" => "upload_id",
      "description" => "The ID of the Upload. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/uploads/{upload_id}/complete', {
  "resourcePath" => "/Uploads",
  "summary" => "Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. ",
  "nickname" => "complete_upload",
  "responseClass" => "Upload",
  "endpoint" => "/uploads/{upload_id}/complete",
  "notes" => "",
  "parameters" => [
    {
      "name" => "upload_id",
      "description" => "The ID of the Upload. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CompleteUploadRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/uploads', {
  "resourcePath" => "/Uploads",
  "summary" => "Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). ",
  "nickname" => "create_upload",
  "responseClass" => "Upload",
  "endpoint" => "/uploads",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateUploadRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

