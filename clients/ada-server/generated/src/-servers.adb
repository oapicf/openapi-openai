--  OpenAI API
--  APIs for sampling from and fine_tuning language models
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


   --  Immediately cancel a fine_tune job.
   overriding
   procedure Cancel_Fine_Tune
      (Server : in out Server_Type;
       Fine_Tune_Id : in Swagger.UString;
       Result  : out .Models.FineTune_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Cancel_Fine_Tune;

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

   --  Creates a new edit for the provided input, instruction, and parameters.
   overriding
   procedure Create_Edit
      (Server : in out Server_Type;
       Create_Edit_Request_Type : in CreateEditRequest_Type;
       Result  : out .Models.CreateEditResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Edit;

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

   --  Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
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

   --  Creates a job that fine_tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine_tuned models once complete.  [Learn more about Fine_tuning](/docs/guides/fine_tuning)
   overriding
   procedure Create_Fine_Tune
      (Server : in out Server_Type;
       Create_Fine_Tune_Request_Type : in CreateFineTuneRequest_Type;
       Result  : out .Models.FineTune_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Fine_Tune;

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
       N : in Swagger.Nullable_Integer;
       Size : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       User : in Swagger.Nullable_UString;
       Result  : out .Models.ImagesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Image_Variation;

   --  Classifies if text violates OpenAI's Content Policy
   overriding
   procedure Create_Moderation
      (Server : in out Server_Type;
       Create_Moderation_Request_Type : in CreateModerationRequest_Type;
       Result  : out .Models.CreateModerationResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Moderation;

   --  Transcribes audio into the input language.
   overriding
   procedure Create_Transcription
      (Server : in out Server_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models.CreateTranscriptionRequestModel_Type;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       Temperature : in Swagger.Number;
       Language : in Swagger.Nullable_UString;
       Result  : out .Models.CreateTranscriptionResponse_Type;
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
       Result  : out .Models.CreateTranslationResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Translation;

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

   --  Delete a fine_tuned model. You must have the Owner role in your organization.
   overriding
   procedure Delete_Model
      (Server : in out Server_Type;
       Model : in Swagger.UString;
       Result  : out .Models.DeleteModelResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Model;

   --  Returns the contents of the specified file
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
      (Server : in out Server_Type
       ;
       Result  : out .Models.ListFilesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Files;

   --  Get fine_grained status updates for a fine_tune job.
   overriding
   procedure List_Fine_Tune_Events
      (Server : in out Server_Type;
       Fine_Tune_Id : in Swagger.UString;
       Stream : in Swagger.Nullable_Boolean;
       Result  : out .Models.ListFineTuneEventsResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Fine_Tune_Events;

   --  List your organization's fine_tuning jobs
   overriding
   procedure List_Fine_Tunes
      (Server : in out Server_Type
       ;
       Result  : out .Models.ListFineTunesResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end List_Fine_Tunes;

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

   --  Gets info about the fine_tune job.  [Learn more about Fine_tuning](/docs/guides/fine_tuning)
   overriding
   procedure Retrieve_Fine_Tune
      (Server : in out Server_Type;
       Fine_Tune_Id : in Swagger.UString;
       Result  : out .Models.FineTune_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Retrieve_Fine_Tune;

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

end .Servers;
