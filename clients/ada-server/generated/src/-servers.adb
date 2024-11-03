--  OpenAI API
--  The OpenAI REST API. Please see https://platform.openai.com/docs/api_reference for more details.
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  Cancels a run that is `in_progress`.
   overriding
   procedure Cancel_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Cancel_Run;

   --  Create an assistant with a model and instructions.
   overriding
   procedure Create_Assistant
      (Server : in out Server_Type;
       Create_Assistant_Request_Type : in CreateAssistantRequest_Type;
       Result  : out .Models.AssistantObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Assistant;

   --  Create an assistant file by attaching a [File](/docs/api_reference/files) to an [assistant](/docs/api_reference/assistants).
   overriding
   procedure Create_Assistant_File
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       Create_Assistant_File_Request_Type : in CreateAssistantFileRequest_Type;
       Result  : out .Models.AssistantFileObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Assistant_File;

   --  Create a message.
   overriding
   procedure Create_Message
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Create_Message_Request_Type : in CreateMessageRequest_Type;
       Result  : out .Models.MessageObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Message;

   --  Create a run.
   overriding
   procedure Create_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Create_Run_Request_Type : in CreateRunRequest_Type;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Run;

   --  Create a thread.
   overriding
   procedure Create_Thread
      (Server : in out Server_Type;
       Create_Thread_Request_Type : in CreateThreadRequest_Type;
       Result  : out .Models.ThreadObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Thread;

   --  Create a thread and run it in one request.
   overriding
   procedure Create_Thread_And_Run
      (Server : in out Server_Type;
       Create_Thread_And_Run_Request_Type : in CreateThreadAndRunRequest_Type;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Thread_And_Run;

   --  Delete an assistant.
   overriding
   procedure Delete_Assistant
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       Result  : out .Models.DeleteAssistantResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Assistant;

   --  Delete an assistant file.
   overriding
   procedure Delete_Assistant_File
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       File_Id : in Swagger.UString;
       Result  : out .Models.DeleteAssistantFileResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Assistant_File;

   --  Delete a thread.
   overriding
   procedure Delete_Thread
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Result  : out .Models.DeleteThreadResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Thread;

   --  Retrieves an assistant.
   overriding
   procedure Get_Assistant
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       Result  : out .Models.AssistantObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Assistant;

   --  Retrieves an AssistantFile.
   overriding
   procedure Get_Assistant_File
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       File_Id : in Swagger.UString;
       Result  : out .Models.AssistantFileObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Assistant_File;

   --  Retrieve a message.
   overriding
   procedure Get_Message
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Result  : out .Models.MessageObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Message;

   --  Retrieves a message file.
   overriding
   procedure Get_Message_File
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       File_Id : in Swagger.UString;
       Result  : out .Models.MessageFileObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Message_File;

   --  Retrieves a run.
   overriding
   procedure Get_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Run;

   --  Retrieves a run step.
   overriding
   procedure Get_Run_Step
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Step_Id : in Swagger.UString;
       Result  : out .Models.RunStepObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Run_Step;

   --  Retrieves a thread.
   overriding
   procedure Get_Thread
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Result  : out .Models.ThreadObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Thread;

   --  Returns a list of assistant files.
   overriding
   procedure List_Assistant_Files
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ListAssistantFilesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Assistant_Files;

   --  Returns a list of assistants.
   overriding
   procedure List_Assistants
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ListAssistantsResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Assistants;

   --  Returns a list of message files.
   overriding
   procedure List_Message_Files
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ListMessageFilesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Message_Files;

   --  Returns a list of messages for a given thread.
   overriding
   procedure List_Messages
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Run_Id : in Swagger.Nullable_UString;
       Result  : out .Models.ListMessagesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Messages;

   --  Returns a list of run steps belonging to a run.
   overriding
   procedure List_Run_Steps
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ListRunStepsResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Run_Steps;

   --  Returns a list of runs belonging to a thread.
   overriding
   procedure List_Runs
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ListRunsResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Runs;

   --  Modifies an assistant.
   overriding
   procedure Modify_Assistant
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       Modify_Assistant_Request_Type : in ModifyAssistantRequest_Type;
       Result  : out .Models.AssistantObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Modify_Assistant;

   --  Modifies a message.
   overriding
   procedure Modify_Message
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Modify_Message_Request_Type : in ModifyMessageRequest_Type;
       Result  : out .Models.MessageObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Modify_Message;

   --  Modifies a run.
   overriding
   procedure Modify_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Modify_Run_Request_Type : in ModifyRunRequest_Type;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Modify_Run;

   --  Modifies a thread.
   overriding
   procedure Modify_Thread
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Modify_Thread_Request_Type : in ModifyThreadRequest_Type;
       Result  : out .Models.ThreadObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Modify_Thread;

   --  When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.
   overriding
   procedure Submit_Tool_Ouputs_To_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Submit_Tool_Outputs_Run_Request_Type : in SubmitToolOutputsRunRequest_Type;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Submit_Tool_Ouputs_To_Run;

   --  Generates audio from the input text.
   overriding
   procedure Create_Speech
      (Server : in out Server_Type;
       Create_Speech_Request_Type : in CreateSpeechRequest_Type;
       Result  : out Swagger.Blob_Ref;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Speech;

   --  Transcribes audio into the input language.
   overriding
   procedure Create_Transcription
      (Server : in out Server_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models.CreateTranscriptionRequestModel_Type;
       Language : in Swagger.Nullable_UString;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       Temperature : in Swagger.Number;
       Timestamp_Granularities_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.CreateTranscription200Response_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Transcription;

   --  Translates audio into English.
   overriding
   procedure Create_Translation
      (Server : in out Server_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models.CreateTranscriptionRequestModel_Type;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       Temperature : in Swagger.Number;
       Result  : out .Models.CreateTranslation200Response_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Translation;

   --  Creates a model response for the given chat conversation.
   overriding
   procedure Create_Chat_Completion
      (Server : in out Server_Type;
       Create_Chat_Completion_Request_Type : in CreateChatCompletionRequest_Type;
       Result  : out .Models.CreateChatCompletionResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Chat_Completion;

   --  Creates a completion for the provided prompt and parameters.
   overriding
   procedure Create_Completion
      (Server : in out Server_Type;
       Create_Completion_Request_Type : in CreateCompletionRequest_Type;
       Result  : out .Models.CreateCompletionResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Completion;

   --  Creates an embedding vector representing the input text.
   overriding
   procedure Create_Embedding
      (Server : in out Server_Type;
       Create_Embedding_Request_Type : in CreateEmbeddingRequest_Type;
       Result  : out .Models.CreateEmbeddingResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Embedding;

   --  Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine_tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
   overriding
   procedure Create_File
      (Server : in out Server_Type;
       File : in Swagger.File_Part_Type;
       Purpose : in Swagger.UString;
       Result  : out .Models.OpenAIFile_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_File;

   --  Delete a file.
   overriding
   procedure Delete_File
      (Server : in out Server_Type;
       File_Id : in Swagger.UString;
       Result  : out .Models.DeleteFileResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_File;

   --  Returns the contents of the specified file.
   overriding
   procedure Download_File
      (Server : in out Server_Type;
       File_Id : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Download_File;

   --  Returns a list of files that belong to the user's organization.
   overriding
   procedure List_Files
      (Server : in out Server_Type;
       Purpose : in Swagger.Nullable_UString;
       Result  : out .Models.ListFilesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Files;

   --  Returns information about a specific file.
   overriding
   procedure Retrieve_File
      (Server : in out Server_Type;
       File_Id : in Swagger.UString;
       Result  : out .Models.OpenAIFile_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Retrieve_File;

   --  Immediately cancel a fine_tune job.
   overriding
   procedure Cancel_Fine_Tuning_Job
      (Server : in out Server_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       Result  : out .Models.FineTuningJob_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Cancel_Fine_Tuning_Job;

   --  Creates a fine_tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine_tuned models once complete.  [Learn more about fine_tuning](/docs/guides/fine_tuning)
   overriding
   procedure Create_Fine_Tuning_Job
      (Server : in out Server_Type;
       Create_Fine_Tuning_Job_Request_Type : in CreateFineTuningJobRequest_Type;
       Result  : out .Models.FineTuningJob_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Fine_Tuning_Job;

   --  Get status updates for a fine_tuning job.
   overriding
   procedure List_Fine_Tuning_Events
      (Server : in out Server_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ListFineTuningJobEventsResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Fine_Tuning_Events;

   --  List checkpoints for a fine_tuning job.
   overriding
   procedure List_Fine_Tuning_Job_Checkpoints
      (Server : in out Server_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ListFineTuningJobCheckpointsResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Fine_Tuning_Job_Checkpoints;

   --  List your organization's fine_tuning jobs
   overriding
   procedure List_Paginated_Fine_Tuning_Jobs
      (Server : in out Server_Type;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ListPaginatedFineTuningJobsResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Paginated_Fine_Tuning_Jobs;

   --  Get info about a fine_tuning job.  [Learn more about fine_tuning](/docs/guides/fine_tuning)
   overriding
   procedure Retrieve_Fine_Tuning_Job
      (Server : in out Server_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       Result  : out .Models.FineTuningJob_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Retrieve_Fine_Tuning_Job;

   --  Creates an image given a prompt.
   overriding
   procedure Create_Image
      (Server : in out Server_Type;
       Create_Image_Request_Type : in CreateImageRequest_Type;
       Result  : out .Models.ImagesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Image;

   --  Creates an edited or extended image given an original image and a prompt.
   overriding
   procedure Create_Image_Edit
      (Server : in out Server_Type;
       Image : in Swagger.File_Part_Type;
       Prompt : in Swagger.UString;
       Mask : in Swagger.File_Part_Type;
       Model : in .Models.CreateImageEditRequestModel_Type;
       N : in Swagger.Nullable_Integer;
       Size : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       User : in Swagger.Nullable_UString;
       Result  : out .Models.ImagesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Image_Edit;

   --  Creates a variation of a given image.
   overriding
   procedure Create_Image_Variation
      (Server : in out Server_Type;
       Image : in Swagger.File_Part_Type;
       Model : in .Models.CreateImageEditRequestModel_Type;
       N : in Swagger.Nullable_Integer;
       Response_Format : in Swagger.Nullable_UString;
       Size : in Swagger.Nullable_UString;
       User : in Swagger.Nullable_UString;
       Result  : out .Models.ImagesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Image_Variation;

   --  Delete a fine_tuned model. You must have the Owner role in your organization to delete a model.
   overriding
   procedure Delete_Model
      (Server : in out Server_Type;
       Model : in Swagger.UString;
       Result  : out .Models.DeleteModelResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Model;

   --  Lists the currently available models, and provides basic information about each one such as the owner and availability.
   overriding
   procedure List_Models
      (Server : in out Server_Type
       ;
       Result  : out .Models.ListModelsResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Models;

   --  Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
   overriding
   procedure Retrieve_Model
      (Server : in out Server_Type;
       Model : in Swagger.UString;
       Result  : out .Models.Model_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Retrieve_Model;

   --  Classifies if text is potentially harmful.
   overriding
   procedure Create_Moderation
      (Server : in out Server_Type;
       Create_Moderation_Request_Type : in CreateModerationRequest_Type;
       Result  : out .Models.CreateModerationResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Moderation;

end .Servers;
