require "json"

module OpenAPIClient
  module Api
  class Images
    def initialize(@conn : Connection); end

    # Creates an edited or extended image given an original image and a prompt.
    def edits(image : ::File? = nil, prompt : String? = nil, mask : ::File? = nil, model : OpenAPIClient::CreateImageEditRequestModel? = nil, n : Int32? = nil, size : String? = nil, response_format : String? = nil, user : String? = nil) : Response(OpenAPIClient::ImagesResponse)
      @conn.request(OpenAPIClient::ImagesResponse,
        method: :POST,
        path: "/images/edits",
        form: Hash(String, Crest::ParamsValue){ "image" => image, "prompt" => prompt, "mask" => mask, "model" => model, "n" => n, "size" => size, "response_format" => response_format, "user" => user },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Creates an image given a prompt.
    def generations(create_image_request : OpenAPIClient::CreateImageRequest) : Response(OpenAPIClient::ImagesResponse)
      @conn.request(OpenAPIClient::ImagesResponse,
        method: :POST,
        path: "/images/generations",
        body: create_image_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Creates a variation of a given image.
    def variations(image : ::File? = nil, model : OpenAPIClient::CreateImageEditRequestModel? = nil, n : Int32? = nil, response_format : String? = nil, size : String? = nil, user : String? = nil) : Response(OpenAPIClient::ImagesResponse)
      @conn.request(OpenAPIClient::ImagesResponse,
        method: :POST,
        path: "/images/variations",
        form: Hash(String, Crest::ParamsValue){ "image" => image, "model" => model, "n" => n, "response_format" => response_format, "size" => size, "user" => user },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
