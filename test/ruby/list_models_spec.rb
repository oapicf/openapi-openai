require 'time'
require 'openapi_openai'

describe 'OpenApiOpenAIClient' do
  before do
  end

  after do
  end

  describe 'test list_models with invalid token' do
    it 'should fail with 401 Unauthorized' do
      OpenApiOpenAIClient.configure do |config|
        config.access_token = 'INEXISTING_TOKEN'
      end

      api_instance = OpenApiOpenAIClient::ModelsApi.new

      begin
        result = api_instance.list_models
        fail 'API called successfully when it should have failed'
      rescue OpenApiOpenAIClient::ApiError => e
        puts "Error when calling ModelsApi->list_models: #{e}"
        expect(e.code).to eq(401)
        expect(e.message).to include('HTTP status code: 40')
        expect(e.response_body).to include('Incorrect API key provided')
      end
    end
  end

end
