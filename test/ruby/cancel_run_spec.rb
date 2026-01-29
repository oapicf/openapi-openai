require 'time'
require 'openapi_openai'

describe 'OpenApiOpenAIClient' do
  before do
  end

  after do
  end

  describe 'test cancel_run with invalid token' do
    it 'should fail with 401 Unauthorized' do
      OpenApiOpenAIClient.configure do |config|
        config.access_token = 'INEXISTING_TOKEN'
      end

      api_instance = OpenApiOpenAIClient::AssistantsApi.new
      thread_id = 'inexisting_thread_id'
      run_id = 'inexisting_run_id'

      begin
        result = api_instance.cancel_run(thread_id, run_id)
        fail 'API called successfully when it should have failed'
      rescue OpenApiOpenAIClient::ApiError => e
        puts "Error when calling AssistantsApi->cancel_run: #{e}"
        expect(e.code).to eq(401)
        expect(e.message).to include('HTTP status code: 40')
        expect(e.response_body).to include('Incorrect API key provided')
      end
    end
  end

end
