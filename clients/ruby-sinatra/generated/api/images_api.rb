require 'json'


MyApp.add_route('POST', '/v1/images/generations', {
  "resourcePath" => "/Images",
  "summary" => "Creates an image given a prompt.",
  "nickname" => "create_image",
  "responseClass" => "ImagesResponse",
  "endpoint" => "/images/generations",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateImageRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/images/edits', {
  "resourcePath" => "/Images",
  "summary" => "Creates an edited or extended image given an original image and a prompt.",
  "nickname" => "create_image_edit",
  "responseClass" => "ImagesResponse",
  "endpoint" => "/images/edits",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/images/variations', {
  "resourcePath" => "/Images",
  "summary" => "Creates a variation of a given image.",
  "nickname" => "create_image_variation",
  "responseClass" => "ImagesResponse",
  "endpoint" => "/images/variations",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

