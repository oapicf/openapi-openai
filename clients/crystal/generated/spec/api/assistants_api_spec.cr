# #OpenAI API
#
##The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#
#The version of the OpenAPI document: 2.0.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.4.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::AssistantsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "AssistantsApi" do
  describe "test an instance of AssistantsApi" do
    it "should create an instance of AssistantsApi" do
      api_instance = OpenAPIClient::AssistantsApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::AssistantsApi)
    end
  end

  # unit tests for cancel_run
  # Cancels a run that is &#x60;in_progress&#x60;.
  # @param thread_id The ID of the thread to which this run belongs.
  # @param run_id The ID of the run to cancel.
  # @param [Hash] opts the optional parameters
  # @return [RunObject]
  describe "cancel_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_assistant
  # Create an assistant with a model and instructions.
  # @param create_assistant_request 
  # @param [Hash] opts the optional parameters
  # @return [AssistantObject]
  describe "create_assistant test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_assistant_file
  # Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
  # @param assistant_id The ID of the assistant for which to create a File. 
  # @param create_assistant_file_request 
  # @param [Hash] opts the optional parameters
  # @return [AssistantFileObject]
  describe "create_assistant_file test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_message
  # Create a message.
  # @param thread_id The ID of the [thread](/docs/api-reference/threads) to create a message for.
  # @param create_message_request 
  # @param [Hash] opts the optional parameters
  # @return [MessageObject]
  describe "create_message test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_run
  # Create a run.
  # @param thread_id The ID of the thread to run.
  # @param create_run_request 
  # @param [Hash] opts the optional parameters
  # @return [RunObject]
  describe "create_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_thread
  # Create a thread.
  # @param [Hash] opts the optional parameters
  # @option opts [CreateThreadRequest] :create_thread_request 
  # @return [ThreadObject]
  describe "create_thread test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_thread_and_run
  # Create a thread and run it in one request.
  # @param create_thread_and_run_request 
  # @param [Hash] opts the optional parameters
  # @return [RunObject]
  describe "create_thread_and_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for delete_assistant
  # Delete an assistant.
  # @param assistant_id The ID of the assistant to delete.
  # @param [Hash] opts the optional parameters
  # @return [DeleteAssistantResponse]
  describe "delete_assistant test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for delete_assistant_file
  # Delete an assistant file.
  # @param assistant_id The ID of the assistant that the file belongs to.
  # @param file_id The ID of the file to delete.
  # @param [Hash] opts the optional parameters
  # @return [DeleteAssistantFileResponse]
  describe "delete_assistant_file test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for delete_thread
  # Delete a thread.
  # @param thread_id The ID of the thread to delete.
  # @param [Hash] opts the optional parameters
  # @return [DeleteThreadResponse]
  describe "delete_thread test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_assistant
  # Retrieves an assistant.
  # @param assistant_id The ID of the assistant to retrieve.
  # @param [Hash] opts the optional parameters
  # @return [AssistantObject]
  describe "get_assistant test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_assistant_file
  # Retrieves an AssistantFile.
  # @param assistant_id The ID of the assistant who the file belongs to.
  # @param file_id The ID of the file we&#39;re getting.
  # @param [Hash] opts the optional parameters
  # @return [AssistantFileObject]
  describe "get_assistant_file test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_message
  # Retrieve a message.
  # @param thread_id The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
  # @param message_id The ID of the message to retrieve.
  # @param [Hash] opts the optional parameters
  # @return [MessageObject]
  describe "get_message test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_message_file
  # Retrieves a message file.
  # @param thread_id The ID of the thread to which the message and File belong.
  # @param message_id The ID of the message the file belongs to.
  # @param file_id The ID of the file being retrieved.
  # @param [Hash] opts the optional parameters
  # @return [MessageFileObject]
  describe "get_message_file test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_run
  # Retrieves a run.
  # @param thread_id The ID of the [thread](/docs/api-reference/threads) that was run.
  # @param run_id The ID of the run to retrieve.
  # @param [Hash] opts the optional parameters
  # @return [RunObject]
  describe "get_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_run_step
  # Retrieves a run step.
  # @param thread_id The ID of the thread to which the run and run step belongs.
  # @param run_id The ID of the run to which the run step belongs.
  # @param step_id The ID of the run step to retrieve.
  # @param [Hash] opts the optional parameters
  # @return [RunStepObject]
  describe "get_run_step test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_thread
  # Retrieves a thread.
  # @param thread_id The ID of the thread to retrieve.
  # @param [Hash] opts the optional parameters
  # @return [ThreadObject]
  describe "get_thread test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for list_assistant_files
  # Returns a list of assistant files.
  # @param assistant_id The ID of the assistant the file belongs to.
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  # @option opts [String] :order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
  # @option opts [String] :after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
  # @option opts [String] :before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
  # @return [ListAssistantFilesResponse]
  describe "list_assistant_files test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for list_assistants
  # Returns a list of assistants.
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  # @option opts [String] :order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
  # @option opts [String] :after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
  # @option opts [String] :before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
  # @return [ListAssistantsResponse]
  describe "list_assistants test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for list_message_files
  # Returns a list of message files.
  # @param thread_id The ID of the thread that the message and files belong to.
  # @param message_id The ID of the message that the files belongs to.
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  # @option opts [String] :order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
  # @option opts [String] :after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
  # @option opts [String] :before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
  # @return [ListMessageFilesResponse]
  describe "list_message_files test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for list_messages
  # Returns a list of messages for a given thread.
  # @param thread_id The ID of the [thread](/docs/api-reference/threads) the messages belong to.
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  # @option opts [String] :order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
  # @option opts [String] :after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
  # @option opts [String] :before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
  # @option opts [String] :run_id Filter messages by the run ID that generated them. 
  # @return [ListMessagesResponse]
  describe "list_messages test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for list_run_steps
  # Returns a list of run steps belonging to a run.
  # @param thread_id The ID of the thread the run and run steps belong to.
  # @param run_id The ID of the run the run steps belong to.
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  # @option opts [String] :order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
  # @option opts [String] :after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
  # @option opts [String] :before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
  # @return [ListRunStepsResponse]
  describe "list_run_steps test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for list_runs
  # Returns a list of runs belonging to a thread.
  # @param thread_id The ID of the thread the run belongs to.
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  # @option opts [String] :order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
  # @option opts [String] :after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
  # @option opts [String] :before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
  # @return [ListRunsResponse]
  describe "list_runs test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for modify_assistant
  # Modifies an assistant.
  # @param assistant_id The ID of the assistant to modify.
  # @param modify_assistant_request 
  # @param [Hash] opts the optional parameters
  # @return [AssistantObject]
  describe "modify_assistant test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for modify_message
  # Modifies a message.
  # @param thread_id The ID of the thread to which this message belongs.
  # @param message_id The ID of the message to modify.
  # @param modify_message_request 
  # @param [Hash] opts the optional parameters
  # @return [MessageObject]
  describe "modify_message test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for modify_run
  # Modifies a run.
  # @param thread_id The ID of the [thread](/docs/api-reference/threads) that was run.
  # @param run_id The ID of the run to modify.
  # @param modify_run_request 
  # @param [Hash] opts the optional parameters
  # @return [RunObject]
  describe "modify_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for modify_thread
  # Modifies a thread.
  # @param thread_id The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
  # @param modify_thread_request 
  # @param [Hash] opts the optional parameters
  # @return [ThreadObject]
  describe "modify_thread test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for submit_tool_ouputs_to_run
  # When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
  # @param thread_id The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
  # @param run_id The ID of the run that requires the tool output submission.
  # @param submit_tool_outputs_run_request 
  # @param [Hash] opts the optional parameters
  # @return [RunObject]
  describe "submit_tool_ouputs_to_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
