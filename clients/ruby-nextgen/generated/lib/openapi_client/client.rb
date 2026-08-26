# frozen_string_literal: true

module OpenapiClient
  class Client
    attr_reader :configuration, :connection

    def initialize(base_url: nil, **options, &block)
      @configuration = Configuration.new(base_url: base_url, **options, &block)
      @connection = Connection.new(@configuration)
    end

    def assistants
      @assistants ||= OpenapiClient::Api::Assistants.new(@connection)
    end

    def audio
      @audio ||= OpenapiClient::Api::Audio.new(@connection)
    end

    def batches
      @batches ||= OpenapiClient::Api::Batches.new(@connection)
    end

    def chat
      @chat ||= OpenapiClient::Api::Chat.new(@connection)
    end

    def completions
      @completions ||= OpenapiClient::Api::Completions.new(@connection)
    end

    def embeddings
      @embeddings ||= OpenapiClient::Api::Embeddings.new(@connection)
    end

    def files
      @files ||= OpenapiClient::Api::Files.new(@connection)
    end

    def fine_tuning
      @fine_tuning ||= OpenapiClient::Api::FineTuning.new(@connection)
    end

    def images
      @images ||= OpenapiClient::Api::Images.new(@connection)
    end

    def models
      @models ||= OpenapiClient::Api::Models.new(@connection)
    end

    def moderations
      @moderations ||= OpenapiClient::Api::Moderations.new(@connection)
    end

    def organization
      @organization ||= OpenapiClient::Api::Organization.new(@connection)
    end

    def realtime
      @realtime ||= OpenapiClient::Api::Realtime.new(@connection)
    end

    def threads
      @threads ||= OpenapiClient::Api::Threads.new(@connection)
    end

    def uploads
      @uploads ||= OpenapiClient::Api::Uploads.new(@connection)
    end

    def vector_stores
      @vector_stores ||= OpenapiClient::Api::VectorStores.new(@connection)
    end
  end
end
