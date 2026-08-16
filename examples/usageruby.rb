# Load the gem
require 'openapi_openai'

OpenApiOpenAIClient.configure do |config|
  config.access_token = 'YOUR_OPENAI_API_KEY'
end

api_instance = OpenApiOpenAIClient::AssistantsApi.new
thread_id = 'thread_id'
run_id = 'run_id'

begin
  # Cancel a run
  result = api_instance.cancel_run(thread_id, run_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Exception when calling AssistantsApi->cancel_run: #{e}"
  raise
end
