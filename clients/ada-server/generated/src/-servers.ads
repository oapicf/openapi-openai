--  OpenAI API
--  The OpenAI REST API. Please see https://platform.openai.com/docs/api_reference for more details.
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with Swagger.Servers;
with .Models;
with .Skeletons;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;
with Swagger.UString_Vectors;

package .Servers is
   pragma Warnings (Off, "*use clause for package*");
   use .Models;
   type Server_Type is limited new .Skeletons.Server_Type with null record;


   --  Cancels a run that is `in_progress`.
   overriding
   procedure Cancel_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create an assistant with a model and instructions.
   overriding
   procedure Create_Assistant
      (Server : in out Server_Type;
       Create_Assistant_Request_Type : in CreateAssistantRequest_Type;
       Result  : out .Models.AssistantObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a message.
   overriding
   procedure Create_Message
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Create_Message_Request_Type : in CreateMessageRequest_Type;
       Result  : out .Models.MessageObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a run.
   overriding
   procedure Create_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Create_Run_Request_Type : in CreateRunRequest_Type;
       Include_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a thread.
   overriding
   procedure Create_Thread
      (Server : in out Server_Type;
       Create_Thread_Request_Type : in CreateThreadRequest_Type;
       Result  : out .Models.ThreadObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a thread and run it in one request.
   overriding
   procedure Create_Thread_And_Run
      (Server : in out Server_Type;
       Create_Thread_And_Run_Request_Type : in CreateThreadAndRunRequest_Type;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete an assistant.
   overriding
   procedure Delete_Assistant
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       Result  : out .Models.DeleteAssistantResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Deletes a message.
   overriding
   procedure Delete_Message
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Result  : out .Models.DeleteMessageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete a thread.
   overriding
   procedure Delete_Thread
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Result  : out .Models.DeleteThreadResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves an assistant.
   overriding
   procedure Get_Assistant
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       Result  : out .Models.AssistantObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieve a message.
   overriding
   procedure Get_Message
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Result  : out .Models.MessageObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a run.
   overriding
   procedure Get_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a run step.
   overriding
   procedure Get_Run_Step
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Step_Id : in Swagger.UString;
       Include_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.RunStepObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a thread.
   overriding
   procedure Get_Thread
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Result  : out .Models.ThreadObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of assistants.
   overriding
   procedure List_Assistants
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ListAssistantsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

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
       Context : in out Swagger.Servers.Context_Type);

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
       Include_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.ListRunStepsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

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
       Context : in out Swagger.Servers.Context_Type);

   --  Modifies an assistant.
   overriding
   procedure Modify_Assistant
      (Server : in out Server_Type;
       Assistant_Id : in Swagger.UString;
       Modify_Assistant_Request_Type : in ModifyAssistantRequest_Type;
       Result  : out .Models.AssistantObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Modifies a message.
   overriding
   procedure Modify_Message
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Message_Id : in Swagger.UString;
       Modify_Message_Request_Type : in ModifyMessageRequest_Type;
       Result  : out .Models.MessageObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Modifies a run.
   overriding
   procedure Modify_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Modify_Run_Request_Type : in ModifyRunRequest_Type;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Modifies a thread.
   overriding
   procedure Modify_Thread
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Modify_Thread_Request_Type : in ModifyThreadRequest_Type;
       Result  : out .Models.ThreadObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.
   overriding
   procedure Submit_Tool_Ouputs_To_Run
      (Server : in out Server_Type;
       Thread_Id : in Swagger.UString;
       Run_Id : in Swagger.UString;
       Submit_Tool_Outputs_Run_Request_Type : in SubmitToolOutputsRunRequest_Type;
       Result  : out .Models.RunObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Generates audio from the input text.
   overriding
   procedure Create_Speech
      (Server : in out Server_Type;
       Create_Speech_Request_Type : in CreateSpeechRequest_Type;
       Result  : out Swagger.Blob_Ref;
       Context : in out Swagger.Servers.Context_Type);

   --  Transcribes audio into the input language.
   overriding
   procedure Create_Transcription
      (Server : in out Server_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models.CreateTranscriptionRequestModel_Type;
       Language : in Swagger.Nullable_UString;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in .Models.AudioResponseFormat_Type;
       Temperature : in Swagger.Number;
       Timestamp_Granularities_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.CreateTranscription200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Translates audio into English.
   overriding
   procedure Create_Translation
      (Server : in out Server_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models.CreateTranscriptionRequestModel_Type;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in .Models.AudioResponseFormat_Type;
       Temperature : in Swagger.Number;
       Result  : out .Models.CreateTranslation200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List user actions and configuration changes within this organization.
   overriding
   procedure List_Audit_Logs
      (Server : in out Server_Type;
       Effective_At : in ListAuditLogsEffectiveAtParameter_Type;
       Project_Ids_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Event_Types_Left_Square_Bracket_Right_Square_Bracket : in .Models.AuditLogEventType_Type_Vectors.Vector;
       Actor_Ids_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Actor_Emails_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Resource_Ids_Left_Square_Bracket_Right_Square_Bracket : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ListAuditLogsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Cancels an in_progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
   overriding
   procedure Cancel_Batch
      (Server : in out Server_Type;
       Batch_Id : in Swagger.UString;
       Result  : out .Models.Batch_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Creates and executes a batch from an uploaded file of requests
   overriding
   procedure Create_Batch
      (Server : in out Server_Type;
       Create_Batch_Request_Type : in CreateBatchRequest_Type;
       Result  : out .Models.Batch_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List your organization's batches.
   overriding
   procedure List_Batches
      (Server : in out Server_Type;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ListBatchesResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a batch.
   overriding
   procedure Retrieve_Batch
      (Server : in out Server_Type;
       Batch_Id : in Swagger.UString;
       Result  : out .Models.Batch_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text_generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).
   overriding
   procedure Create_Chat_Completion
      (Server : in out Server_Type;
       Create_Chat_Completion_Request_Type : in CreateChatCompletionRequest_Type;
       Result  : out .Models.CreateChatCompletionResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Creates a completion for the provided prompt and parameters.
   overriding
   procedure Create_Completion
      (Server : in out Server_Type;
       Create_Completion_Request_Type : in CreateCompletionRequest_Type;
       Result  : out .Models.CreateCompletionResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create an organization admin API key
   --  Create a new admin-level API key for the organization.
   overriding
   procedure Admin_Api_Keys_Create
      (Server : in out Server_Type;
       Admin_Api_Keys_Create_Request_Type : in AdminApiKeysCreateRequest_Type;
       Result  : out .Models.AdminApiKey_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete an organization admin API key
   --  Delete the specified admin API key.
   overriding
   procedure Admin_Api_Keys_Delete
      (Server : in out Server_Type;
       Key_Id : in Swagger.UString;
       Result  : out .Models.AdminApiKeysDelete200Response_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieve a single organization API key
   --  Get details for a specific organization API key by its ID.
   overriding
   procedure Admin_Api_Keys_Get
      (Server : in out Server_Type;
       Key_Id : in Swagger.UString;
       Result  : out .Models.AdminApiKey_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List organization API keys
   --  Retrieve a paginated list of organization admin API keys.
   overriding
   procedure Admin_Api_Keys_List
      (Server : in out Server_Type;
       After : in Swagger.Nullable_UString;
       Order : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ApiKeyList_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Creates an embedding vector representing the input text.
   overriding
   procedure Create_Embedding
      (Server : in out Server_Type;
       Create_Embedding_Request_Type : in CreateEmbeddingRequest_Type;
       Result  : out .Models.CreateEmbeddingResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine_tuning API only supports `.jsonl` files. The input also has certain required formats for fine_tuning [chat](/docs/api_reference/fine_tuning/chat_input) or [completions](/docs/api_reference/fine_tuning/completions_input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api_reference/batch/request_input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
   overriding
   procedure Create_File
      (Server : in out Server_Type;
       File : in Swagger.File_Part_Type;
       Purpose : in Swagger.UString;
       Result  : out .Models.OpenAIFile_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete a file.
   overriding
   procedure Delete_File
      (Server : in out Server_Type;
       File_Id : in Swagger.UString;
       Result  : out .Models.DeleteFileResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns the contents of the specified file.
   overriding
   procedure Download_File
      (Server : in out Server_Type;
       File_Id : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of files.
   overriding
   procedure List_Files
      (Server : in out Server_Type;
       Purpose : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Result  : out .Models.ListFilesResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns information about a specific file.
   overriding
   procedure Retrieve_File
      (Server : in out Server_Type;
       File_Id : in Swagger.UString;
       Result  : out .Models.OpenAIFile_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Immediately cancel a fine_tune job.
   overriding
   procedure Cancel_Fine_Tuning_Job
      (Server : in out Server_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       Result  : out .Models.FineTuningJob_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Creates a fine_tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine_tuned models once complete.  [Learn more about fine_tuning](/docs/guides/fine_tuning)
   overriding
   procedure Create_Fine_Tuning_Job
      (Server : in out Server_Type;
       Create_Fine_Tuning_Job_Request_Type : in CreateFineTuningJobRequest_Type;
       Result  : out .Models.FineTuningJob_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get status updates for a fine_tuning job.
   overriding
   procedure List_Fine_Tuning_Events
      (Server : in out Server_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ListFineTuningJobEventsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List checkpoints for a fine_tuning job.
   overriding
   procedure List_Fine_Tuning_Job_Checkpoints
      (Server : in out Server_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ListFineTuningJobCheckpointsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  List your organization's fine_tuning jobs
   overriding
   procedure List_Paginated_Fine_Tuning_Jobs
      (Server : in out Server_Type;
       After : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.ListPaginatedFineTuningJobsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get info about a fine_tuning job.  [Learn more about fine_tuning](/docs/guides/fine_tuning)
   overriding
   procedure Retrieve_Fine_Tuning_Job
      (Server : in out Server_Type;
       Fine_Tuning_Job_Id : in Swagger.UString;
       Result  : out .Models.FineTuningJob_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Creates an image given a prompt.
   overriding
   procedure Create_Image
      (Server : in out Server_Type;
       Create_Image_Request_Type : in CreateImageRequest_Type;
       Result  : out .Models.ImagesResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

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
       Context : in out Swagger.Servers.Context_Type);

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
       Context : in out Swagger.Servers.Context_Type);

   --  Delete an invite. If the invite has already been accepted, it cannot be deleted.
   overriding
   procedure Delete_Invite
      (Server : in out Server_Type;
       Invite_Id : in Swagger.UString;
       Result  : out .Models.InviteDeleteResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
   overriding
   procedure Invite_User
      (Server : in out Server_Type;
       Invite_Request_Type : in InviteRequest_Type;
       Result  : out .Models.Invite_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of invites in the organization.
   overriding
   procedure List_Invites
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       After : in Swagger.Nullable_UString;
       Result  : out .Models.InviteListResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves an invite.
   overriding
   procedure Retrieve_Invite
      (Server : in out Server_Type;
       Invite_Id : in Swagger.UString;
       Result  : out .Models.Invite_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete a fine_tuned model. You must have the Owner role in your organization to delete a model.
   overriding
   procedure Delete_Model
      (Server : in out Server_Type;
       Model : in Swagger.UString;
       Result  : out .Models.DeleteModelResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Lists the currently available models, and provides basic information about each one such as the owner and availability.
   overriding
   procedure List_Models
      (Server : in out Server_Type
       ;
       Result  : out .Models.ListModelsResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
   overriding
   procedure Retrieve_Model
      (Server : in out Server_Type;
       Model : in Swagger.UString;
       Result  : out .Models.Model_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).
   overriding
   procedure Create_Moderation
      (Server : in out Server_Type;
       Create_Moderation_Request_Type : in CreateModerationRequest_Type;
       Result  : out .Models.CreateModerationResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Archives a project in the organization. Archived projects cannot be used or updated.
   overriding
   procedure Archive_Project
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Result  : out .Models.Project_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
   overriding
   procedure Create_Project
      (Server : in out Server_Type;
       Project_Create_Request_Type : in ProjectCreateRequest_Type;
       Result  : out .Models.Project_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Creates a new service account in the project. This also returns an unredacted API key for the service account.
   overriding
   procedure Create_Project_Service_Account
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Project_Service_Account_Create_Request_Type : in ProjectServiceAccountCreateRequest_Type;
       Result  : out .Models.ProjectServiceAccountCreateResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Adds a user to the project. Users must already be members of the organization to be added to a project.
   overriding
   procedure Create_Project_User
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Project_User_Create_Request_Type : in ProjectUserCreateRequest_Type;
       Result  : out .Models.ProjectUser_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Deletes an API key from the project.
   overriding
   procedure Delete_Project_Api_Key
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Key_Id : in Swagger.UString;
       Result  : out .Models.ProjectApiKeyDeleteResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Deletes a service account from the project.
   overriding
   procedure Delete_Project_Service_Account
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Service_Account_Id : in Swagger.UString;
       Result  : out .Models.ProjectServiceAccountDeleteResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Deletes a user from the project.
   overriding
   procedure Delete_Project_User
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       User_Id : in Swagger.UString;
       Result  : out .Models.ProjectUserDeleteResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of API keys in the project.
   overriding
   procedure List_Project_Api_Keys
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       After : in Swagger.Nullable_UString;
       Result  : out .Models.ProjectApiKeyListResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns the rate limits per model for a project.
   overriding
   procedure List_Project_Rate_Limits
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ProjectRateLimitListResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of service accounts in the project.
   overriding
   procedure List_Project_Service_Accounts
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       After : in Swagger.Nullable_UString;
       Result  : out .Models.ProjectServiceAccountListResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of users in the project.
   overriding
   procedure List_Project_Users
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       After : in Swagger.Nullable_UString;
       Result  : out .Models.ProjectUserListResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of projects.
   overriding
   procedure List_Projects
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       After : in Swagger.Nullable_UString;
       Include_Archived : in Swagger.Nullable_Boolean;
       Result  : out .Models.ProjectListResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Modifies a project in the organization.
   overriding
   procedure Modify_Project
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Project_Update_Request_Type : in ProjectUpdateRequest_Type;
       Result  : out .Models.Project_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Modifies a user's role in the project.
   overriding
   procedure Modify_Project_User
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       User_Id : in Swagger.UString;
       Project_User_Update_Request_Type : in ProjectUserUpdateRequest_Type;
       Result  : out .Models.ProjectUser_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a project.
   overriding
   procedure Retrieve_Project
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Result  : out .Models.Project_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves an API key in the project.
   overriding
   procedure Retrieve_Project_Api_Key
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Key_Id : in Swagger.UString;
       Result  : out .Models.ProjectApiKey_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a service account in the project.
   overriding
   procedure Retrieve_Project_Service_Account
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Service_Account_Id : in Swagger.UString;
       Result  : out .Models.ProjectServiceAccount_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a user in the project.
   overriding
   procedure Retrieve_Project_User
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       User_Id : in Swagger.UString;
       Result  : out .Models.ProjectUser_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Updates a project rate limit.
   overriding
   procedure Update_Project_Rate_Limits
      (Server : in out Server_Type;
       Project_Id : in Swagger.UString;
       Rate_Limit_Id : in Swagger.UString;
       Project_Rate_Limit_Update_Request_Type : in ProjectRateLimitUpdateRequest_Type;
       Result  : out .Models.ProjectRateLimit_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create an ephemeral API token for use in client_side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.
   overriding
   procedure Create_Realtime_Session
      (Server : in out Server_Type;
       Realtime_Session_Create_Request_Type : in RealtimeSessionCreateRequest_Type;
       Result  : out .Models.RealtimeSessionCreateResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Adds a [Part](/docs/api_reference/uploads/part_object) to an [Upload](/docs/api_reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api_reference/uploads/complete).
   overriding
   procedure Add_Upload_Part
      (Server : in out Server_Type;
       Upload_Id : in Swagger.UString;
       Data : in Swagger.File_Part_Type;
       Result  : out .Models.UploadPart_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Cancels the Upload. No Parts may be added after an Upload is cancelled.
   overriding
   procedure Cancel_Upload
      (Server : in out Server_Type;
       Upload_Id : in Swagger.UString;
       Result  : out .Models.Upload_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Completes the [Upload](/docs/api_reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api_reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.
   overriding
   procedure Complete_Upload
      (Server : in out Server_Type;
       Upload_Id : in Swagger.UString;
       Complete_Upload_Request_Type : in CompleteUploadRequest_Type;
       Result  : out .Models.Upload_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Creates an intermediate [Upload](/docs/api_reference/uploads/object) object that you can add [Parts](/docs/api_reference/uploads/part_object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api_reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: _ [Assistants](/docs/assistants/tools/file_search#supported_files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api_reference/files/create).
   overriding
   procedure Create_Upload
      (Server : in out Server_Type;
       Create_Upload_Request_Type : in CreateUploadRequest_Type;
       Result  : out .Models.Upload_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get audio speeches usage details for the organization.
   overriding
   procedure Usage_Audio_Speeches
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       User_Ids : in Swagger.UString_Vectors.Vector;
       Api_Key_Ids : in Swagger.UString_Vectors.Vector;
       Models : in Swagger.UString_Vectors.Vector;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get audio transcriptions usage details for the organization.
   overriding
   procedure Usage_Audio_Transcriptions
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       User_Ids : in Swagger.UString_Vectors.Vector;
       Api_Key_Ids : in Swagger.UString_Vectors.Vector;
       Models : in Swagger.UString_Vectors.Vector;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get code interpreter sessions usage details for the organization.
   overriding
   procedure Usage_Code_Interpreter_Sessions
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get completions usage details for the organization.
   overriding
   procedure Usage_Completions
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       User_Ids : in Swagger.UString_Vectors.Vector;
       Api_Key_Ids : in Swagger.UString_Vectors.Vector;
       Models : in Swagger.UString_Vectors.Vector;
       Batch : in Swagger.Nullable_Boolean;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get costs details for the organization.
   overriding
   procedure Usage_Costs
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get embeddings usage details for the organization.
   overriding
   procedure Usage_Embeddings
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       User_Ids : in Swagger.UString_Vectors.Vector;
       Api_Key_Ids : in Swagger.UString_Vectors.Vector;
       Models : in Swagger.UString_Vectors.Vector;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get images usage details for the organization.
   overriding
   procedure Usage_Images
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Sources : in Swagger.UString_Vectors.Vector;
       Sizes : in Swagger.UString_Vectors.Vector;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       User_Ids : in Swagger.UString_Vectors.Vector;
       Api_Key_Ids : in Swagger.UString_Vectors.Vector;
       Models : in Swagger.UString_Vectors.Vector;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get moderations usage details for the organization.
   overriding
   procedure Usage_Moderations
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       User_Ids : in Swagger.UString_Vectors.Vector;
       Api_Key_Ids : in Swagger.UString_Vectors.Vector;
       Models : in Swagger.UString_Vectors.Vector;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Get vector stores usage details for the organization.
   overriding
   procedure Usage_Vector_Stores
      (Server : in out Server_Type;
       Start_Time : in Integer;
       End_Time : in Swagger.Nullable_Integer;
       Bucket_Width : in Swagger.Nullable_UString;
       Project_Ids : in Swagger.UString_Vectors.Vector;
       Group_By : in Swagger.UString_Vectors.Vector;
       Limit : in Swagger.Nullable_Integer;
       Page : in Swagger.Nullable_UString;
       Result  : out .Models.UsageResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Deletes a user from the organization.
   overriding
   procedure Delete_User
      (Server : in out Server_Type;
       User_Id : in Swagger.UString;
       Result  : out .Models.UserDeleteResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Lists all of the users in the organization.
   overriding
   procedure List_Users
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       After : in Swagger.Nullable_UString;
       Result  : out .Models.UserListResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Modifies a user's role in the organization.
   overriding
   procedure Modify_User
      (Server : in out Server_Type;
       User_Id : in Swagger.UString;
       User_Role_Update_Request_Type : in UserRoleUpdateRequest_Type;
       Result  : out .Models.User_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a user by their identifier.
   overriding
   procedure Retrieve_User
      (Server : in out Server_Type;
       User_Id : in Swagger.UString;
       Result  : out .Models.User_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
   overriding
   procedure Cancel_Vector_Store_File_Batch
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Batch_Id : in Swagger.UString;
       Result  : out .Models.VectorStoreFileBatchObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a vector store.
   overriding
   procedure Create_Vector_Store
      (Server : in out Server_Type;
       Create_Vector_Store_Request_Type : in CreateVectorStoreRequest_Type;
       Result  : out .Models.VectorStoreObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a vector store file by attaching a [File](/docs/api_reference/files) to a [vector store](/docs/api_reference/vector_stores/object).
   overriding
   procedure Create_Vector_Store_File
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Create_Vector_Store_File_Request_Type : in CreateVectorStoreFileRequest_Type;
       Result  : out .Models.VectorStoreFileObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Create a vector store file batch.
   overriding
   procedure Create_Vector_Store_File_Batch
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Create_Vector_Store_File_Batch_Request_Type : in CreateVectorStoreFileBatchRequest_Type;
       Result  : out .Models.VectorStoreFileBatchObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete a vector store.
   overriding
   procedure Delete_Vector_Store
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Result  : out .Models.DeleteVectorStoreResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api_reference/files/delete) endpoint.
   overriding
   procedure Delete_Vector_Store_File
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       File_Id : in Swagger.UString;
       Result  : out .Models.DeleteVectorStoreFileResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a vector store.
   overriding
   procedure Get_Vector_Store
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Result  : out .Models.VectorStoreObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a vector store file.
   overriding
   procedure Get_Vector_Store_File
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       File_Id : in Swagger.UString;
       Result  : out .Models.VectorStoreFileObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Retrieves a vector store file batch.
   overriding
   procedure Get_Vector_Store_File_Batch
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Batch_Id : in Swagger.UString;
       Result  : out .Models.VectorStoreFileBatchObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of vector store files in a batch.
   overriding
   procedure List_Files_In_Vector_Store_Batch
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Batch_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Filter : in Swagger.Nullable_UString;
       Result  : out .Models.ListVectorStoreFilesResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of vector store files.
   overriding
   procedure List_Vector_Store_Files
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Filter : in Swagger.Nullable_UString;
       Result  : out .Models.ListVectorStoreFilesResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Returns a list of vector stores.
   overriding
   procedure List_Vector_Stores
      (Server : in out Server_Type;
       Limit : in Swagger.Nullable_Integer;
       Order : in Swagger.Nullable_UString;
       After : in Swagger.Nullable_UString;
       Before : in Swagger.Nullable_UString;
       Result  : out .Models.ListVectorStoresResponse_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  Modifies a vector store.
   overriding
   procedure Modify_Vector_Store
      (Server : in out Server_Type;
       Vector_Store_Id : in Swagger.UString;
       Update_Vector_Store_Request_Type : in UpdateVectorStoreRequest_Type;
       Result  : out .Models.VectorStoreObject_Type;
       Context : in out Swagger.Servers.Context_Type);

   package Server_Impl is
      new .Skeletons.Shared_Instance (Server_Type);

end .Servers;
