--  OpenAI API
--  The OpenAI REST API. Please see https://platform.openai.com/docs/api_reference for more details.
--
--  The version of the OpenAPI document: 2.0.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.9.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
package .Clients is
   pragma Style_Checks ("-bmrIu");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  Cancels a run that is `in_progress`.
   procedure Cancel_Run
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Result : out .Models.RunObject_Type);

   --  Create an assistant with a model and instructions.
   procedure Create_Assistant
      (Client : in out Client_Type;
       Create_Assistant_Request_Type : in .Models.CreateAssistantRequest_Type;
       Result : out .Models.AssistantObject_Type);

   --  Create an assistant file by attaching a [File](/docs/api_reference/files) to an [assistant](/docs/api_reference/assistants).
   procedure Create_Assistant_File
      (Client : in out Client_Type;
       Assistant_Id : in Swagger.UString;
       Create_Assistant_File_Request_Type : in .Models.CreateAssistantFileRequest_Type;
       Result : out .Models.AssistantFileObject_Type);

   --  Create a message.
   procedure Create_Message
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Create_Message_Request_Type : in .Models.CreateMessageRequest_Type;
       Result : out .Models.MessageObject_Type);

   --  Create a run.
   procedure Create_Run
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Create_Run_Request_Type : in .Models.CreateRunRequest_Type;
       Result : out .Models.RunObject_Type);

   --  Create a thread.
   procedure Create_Thread
      (Client : in out Client_Type;
       Create_Thread_Request_Type : in .Models.CreateThreadRequest_Type;
       Result : out .Models.ThreadObject_Type);

   --  Create a thread and run it in one request.
   procedure Create_Thread_And_Run
      (Client : in out Client_Type;
       Create_Thread_And_Run_Request_Type : in .Models.CreateThreadAndRunRequest_Type;
       Result : out .Models.RunObject_Type);

   --  Delete an assistant.
   procedure Delete_Assistant
      (Client : in out Client_Type;
       Assistant_Id : in Swagger.UString;
       Result : out .Models.DeleteAssistantResponse_Type);

   --  Delete an assistant file.
   procedure Delete_Assistant_File
      (Client : in out Client_Type;
       Assistant_Id : in Swagger.UString;
       File_Id : in Swagger.UString;
       Result : out .Models.DeleteAssistantFileResponse_Type);

   --  Delete a thread.
   procedure Delete_Thread
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Result : out .Models.DeleteThreadResponse_Type);

   --  Retrieves an assistant.
   procedure Get_Assistant
      (Client : in out Client_Type;
       Assistant_Id : in Swagger.UString;
       Result : out .Models.AssistantObject_Type);

   --  Retrieves an AssistantFile.
   procedure Get_Assistant_File
      (Client : in out Client_Type;
       Assistant_Id : in Swagger.UString;
       File_Id : in Swagger.UString;
       Result : out .Models.AssistantFileObject_Type);

   --  Retrieve a message.
   procedure Get_Message
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Result : out .Models.MessageObject_Type);

   --  Retrieves a message file.
   procedure Get_Message_File
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       File_Id : in Swagger.UString;
       Result : out .Models.MessageFileObject_Type);

   --  Retrieves a run.
   procedure Get_Run
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Result : out .Models.RunObject_Type);

   --  Retrieves a run step.
   procedure Get_Run_Step
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Step_Id : in Swagger.UString;
       Result : out .Models.RunStepObject_Type);

   --  Retrieves a thread.
   procedure Get_Thread
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Result : out .Models.ThreadObject_Type);

   --  Returns a list of assistant files.
   procedure List_Assistant_Files
      (Client : in out Client_Type;
       Assistant_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result : out .Models.ListAssistantFilesResponse_Type);

   --  Returns a list of assistants.
   procedure List_Assistants
      (Client : in out Client_Type;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result : out .Models.ListAssistantsResponse_Type);

   --  Returns a list of message files.
   procedure List_Message_Files
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result : out .Models.ListMessageFilesResponse_Type);

   --  Returns a list of messages for a given thread.
   procedure List_Messages
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Run_Id : in Swagger.Nullable_UString;
       Result : out .Models.ListMessagesResponse_Type);

   --  Returns a list of run steps belonging to a run.
   procedure List_Run_Steps
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result : out .Models.ListRunStepsResponse_Type);

   --  Returns a list of runs belonging to a thread.
   procedure List_Runs
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result : out .Models.ListRunsResponse_Type);

   --  Modifies an assistant.
   procedure Modify_Assistant
      (Client : in out Client_Type;
       Assistant_Id : in Swagger.UString;
       Modify_Assistant_Request_Type : in .Models.ModifyAssistantRequest_Type;
       Result : out .Models.AssistantObject_Type);

   --  Modifies a message.
   procedure Modify_Message
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Modify_Message_Request_Type : in .Models.ModifyMessageRequest_Type;
       Result : out .Models.MessageObject_Type);

   --  Modifies a run.
   procedure Modify_Run
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Modify_Run_Request_Type : in .Models.ModifyRunRequest_Type;
       Result : out .Models.RunObject_Type);

   --  Modifies a thread.
   procedure Modify_Thread
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Modify_Thread_Request_Type : in .Models.ModifyThreadRequest_Type;
       Result : out .Models.ThreadObject_Type);

   --  When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.
   procedure Submit_Tool_Ouputs_To_Run
      (Client : in out Client_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Submit_Tool_Outputs_Run_Request_Type : in .Models.SubmitToolOutputsRunRequest_Type;
       Result : out .Models.RunObject_Type);

   --  Generates audio from the input text.
   procedure Create_Speech
      (Client : in out Client_Type;
       Create_Speech_Request_Type : in .Models.CreateSpeechRequest_Type;
       Result : out Swagger.Blob_Ref);

   --  Transcribes audio into the input language.
   procedure Create_Transcription
      (Client : in out Client_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models..Models.CreateTranscriptionRequestModel_Type;
       Language : in Swagger.Nullable_UString;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       Temperature : in Swagger.Number;
       Timestamp_Granularities_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Result : out .Models.CreateTranscription200Response_Type);

   --  Translates audio into English.
   procedure Create_Translation
      (Client : in out Client_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models..Models.CreateTranscriptionRequestModel_Type;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       Temperature : in Swagger.Number;
       Result : out .Models.CreateTranslation200Response_Type);

   --  Creates a model response for the given chat conversation.
   procedure Create_Chat_Completion
      (Client : in out Client_Type;
       Create_Chat_Completion_Request_Type : in .Models.CreateChatCompletionRequest_Type;
       Result : out .Models.CreateChatCompletionResponse_Type);

   --  Creates a completion for the provided prompt and parameters.
   procedure Create_Completion
      (Client : in out Client_Type;
       Create_Completion_Request_Type : in .Models.CreateCompletionRequest_Type;
       Result : out .Models.CreateCompletionResponse_Type);

   --  Creates an embedding vector representing the input text.
   procedure Create_Embedding
      (Client : in out Client_Type;
       Create_Embedding_Request_Type : in .Models.CreateEmbeddingRequest_Type;
       Result : out .Models.CreateEmbeddingResponse_Type);

   --  Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine_tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
   procedure Create_File
      (Client : in out Client_Type;
       File : in Swagger.File_Part_Type;
       Purpose : in Swagger.UString;
       Result : out .Models.OpenAIFile_Type);

   --  Delete a file.
   procedure Delete_File
      (Client : in out Client_Type;
       File_Id : in Swagger.UString;
       Result : out .Models.DeleteFileResponse_Type);

   --  Returns the contents of the specified file.
   procedure Download_File
      (Client : in out Client_Type;
       File_Id : in Swagger.UString;
       Result : out Swagger.UString);

   --  Returns a list of files that belong to the user's organization.
   procedure List_Files
      (Client : in out Client_Type;
       Purpose : in Swagger.Nullable_UString;
       Result : out .Models.ListFilesResponse_Type);

   --  Returns information about a specific file.
   procedure Retrieve_File
      (Client : in out Client_Type;
       File_Id : in Swagger.UString;
       Result : out .Models.OpenAIFile_Type);

   --  Immediately cancel a fine_tune job.
   procedure Cancel_Fine_Tuning_Job
      (Client : in out Client_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       Result : out .Models.FineTuningJob_Type);

   --  Creates a fine_tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine_tuned models once complete.  [Learn more about fine_tuning](/docs/guides/fine_tuning)
   procedure Create_Fine_Tuning_Job
      (Client : in out Client_Type;
       Create_Fine_Tuning_Job_Request_Type : in .Models.CreateFineTuningJobRequest_Type;
       Result : out .Models.FineTuningJob_Type);

   --  Get status updates for a fine_tuning job.
   procedure List_Fine_Tuning_Events
      (Client : in out Client_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result : out .Models.ListFineTuningJobEventsResponse_Type);

   --  List checkpoints for a fine_tuning job.
   procedure List_Fine_Tuning_Job_Checkpoints
      (Client : in out Client_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result : out .Models.ListFineTuningJobCheckpointsResponse_Type);

   --  List your organization's fine_tuning jobs
   procedure List_Paginated_Fine_Tuning_Jobs
      (Client : in out Client_Type;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result : out .Models.ListPaginatedFineTuningJobsResponse_Type);

   --  Get info about a fine_tuning job.  [Learn more about fine_tuning](/docs/guides/fine_tuning)
   procedure Retrieve_Fine_Tuning_Job
      (Client : in out Client_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       Result : out .Models.FineTuningJob_Type);

   --  Creates an image given a prompt.
   procedure Create_Image
      (Client : in out Client_Type;
       Create_Image_Request_Type : in .Models.CreateImageRequest_Type;
       Result : out .Models.ImagesResponse_Type);

   --  Creates an edited or extended image given an original image and a prompt.
   procedure Create_Image_Edit
      (Client : in out Client_Type;
       Image : in Swagger.File_Part_Type;
       Prompt : in Swagger.UString;
       Mask : in Swagger.File_Part_Type;
       Model : in .Models..Models.CreateImageEditRequestModel_Type;
       N : in Swagger.Nullable_Integer;
       Size : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       User : in Swagger.Nullable_UString;
       Result : out .Models.ImagesResponse_Type);

   --  Creates a variation of a given image.
   procedure Create_Image_Variation
      (Client : in out Client_Type;
       Image : in Swagger.File_Part_Type;
       Model : in .Models..Models.CreateImageEditRequestModel_Type;
       N : in Swagger.Nullable_Integer;
       Response_Format : in Swagger.Nullable_UString;
       Size : in Swagger.Nullable_UString;
       User : in Swagger.Nullable_UString;
       Result : out .Models.ImagesResponse_Type);

   --  Delete a fine_tuned model. You must have the Owner role in your organization to delete a model.
   procedure Delete_Model
      (Client : in out Client_Type;
       Model : in Swagger.UString;
       Result : out .Models.DeleteModelResponse_Type);

   --  Lists the currently available models, and provides basic information about each one such as the owner and availability.
   procedure List_Models
      (Client : in out Client_Type;
       Result : out .Models.ListModelsResponse_Type);

   --  Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
   procedure Retrieve_Model
      (Client : in out Client_Type;
       Model : in Swagger.UString;
       Result : out .Models.Model_Type);

   --  Classifies if text is potentially harmful.
   procedure Create_Moderation
      (Client : in out Client_Type;
       Create_Moderation_Request_Type : in .Models.CreateModerationRequest_Type;
       Result : out .Models.CreateModerationResponse_Type);

end .Clients;
