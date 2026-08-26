require "json"

module OpenAPIClient
  module Api
  class Models
    def initialize(@conn : Connection); end

    # Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    def delete(model : String) : Response(OpenAPIClient::DeleteModelResponse)
      @conn.request(OpenAPIClient::DeleteModelResponse,
        method: :DELETE,
        path: "/models/{model}".sub("{model}", OpenAPIClient.enc(model)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    def get(model : String) : Response(OpenAPIClient::Model)
      @conn.request(OpenAPIClient::Model,
        method: :GET,
        path: "/models/{model}".sub("{model}", OpenAPIClient.enc(model)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Lists the currently available models, and provides basic information about each one such as the owner and availability.
    def list() : Response(OpenAPIClient::ListModelsResponse)
      @conn.request(OpenAPIClient::ListModelsResponse,
        method: :GET,
        path: "/models",
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
