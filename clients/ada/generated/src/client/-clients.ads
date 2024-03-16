--  OpenAI API
--  APIs for sampling from and fine_tuning language models
--
--  The version of the OpenAPI document: 2.0.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.4.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-bmrIu");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  Immediately cancel a fine_tune job.
   procedure Cancel_Fine_Tune
      (Client : in out Client_Type;
       Fine_Tune_Id : in Swagger.UString;
       Result : out .Models.FineTune_Type);

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

   --  Creates a new edit for the provided input, instruction, and parameters.
   procedure Create_Edit
      (Client : in out Client_Type;
       Create_Edit_Request_Type : in .Models.CreateEditRequest_Type;
       Result : out .Models.CreateEditResponse_Type);

   --  Creates an embedding vector representing the input text.
   procedure Create_Embedding
      (Client : in out Client_Type;
       Create_Embedding_Request_Type : in .Models.CreateEmbeddingRequest_Type;
       Result : out .Models.CreateEmbeddingResponse_Type);

   --  Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
   procedure Create_File
      (Client : in out Client_Type;
       File : in Swagger.File_Part_Type;
       Purpose : in Swagger.UString;
       Result : out .Models.OpenAIFile_Type);

   --  Creates a job that fine_tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine_tuned models once complete.  [Learn more about Fine_tuning](/docs/guides/fine_tuning)
   procedure Create_Fine_Tune
      (Client : in out Client_Type;
       Create_Fine_Tune_Request_Type : in .Models.CreateFineTuneRequest_Type;
       Result : out .Models.FineTune_Type);

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
       N : in Swagger.Nullable_Integer;
       Size : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       User : in Swagger.Nullable_UString;
       Result : out .Models.ImagesResponse_Type);

   --  Creates a variation of a given image.
   procedure Create_Image_Variation
      (Client : in out Client_Type;
       Image : in Swagger.File_Part_Type;
       N : in Swagger.Nullable_Integer;
       Size : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       User : in Swagger.Nullable_UString;
       Result : out .Models.ImagesResponse_Type);

   --  Classifies if text violates OpenAI's Content Policy
   procedure Create_Moderation
      (Client : in out Client_Type;
       Create_Moderation_Request_Type : in .Models.CreateModerationRequest_Type;
       Result : out .Models.CreateModerationResponse_Type);

   --  Transcribes audio into the input language.
   procedure Create_Transcription
      (Client : in out Client_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models..Models.CreateTranscriptionRequestModel_Type;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       Temperature : in Swagger.Number;
       Language : in Swagger.Nullable_UString;
       Result : out .Models.CreateTranscriptionResponse_Type);

   --  Translates audio into English.
   procedure Create_Translation
      (Client : in out Client_Type;
       File : in Swagger.File_Part_Type;
       Model : in .Models..Models.CreateTranscriptionRequestModel_Type;
       Prompt : in Swagger.Nullable_UString;
       Response_Format : in Swagger.Nullable_UString;
       Temperature : in Swagger.Number;
       Result : out .Models.CreateTranslationResponse_Type);

   --  Delete a file.
   procedure Delete_File
      (Client : in out Client_Type;
       File_Id : in Swagger.UString;
       Result : out .Models.DeleteFileResponse_Type);

   --  Delete a fine_tuned model. You must have the Owner role in your organization.
   procedure Delete_Model
      (Client : in out Client_Type;
       Model : in Swagger.UString;
       Result : out .Models.DeleteModelResponse_Type);

   --  Returns the contents of the specified file
   procedure Download_File
      (Client : in out Client_Type;
       File_Id : in Swagger.UString;
       Result : out Swagger.UString);

   --  Returns a list of files that belong to the user's organization.
   procedure List_Files
      (Client : in out Client_Type;
       Result : out .Models.ListFilesResponse_Type);

   --  Get fine_grained status updates for a fine_tune job.
   procedure List_Fine_Tune_Events
      (Client : in out Client_Type;
       Fine_Tune_Id : in Swagger.UString;
       Stream : in Swagger.Nullable_Boolean;
       Result : out .Models.ListFineTuneEventsResponse_Type);

   --  List your organization's fine_tuning jobs
   procedure List_Fine_Tunes
      (Client : in out Client_Type;
       Result : out .Models.ListFineTunesResponse_Type);

   --  Lists the currently available models, and provides basic information about each one such as the owner and availability.
   procedure List_Models
      (Client : in out Client_Type;
       Result : out .Models.ListModelsResponse_Type);

   --  Returns information about a specific file.
   procedure Retrieve_File
      (Client : in out Client_Type;
       File_Id : in Swagger.UString;
       Result : out .Models.OpenAIFile_Type);

   --  Gets info about the fine_tune job.  [Learn more about Fine_tuning](/docs/guides/fine_tuning)
   procedure Retrieve_Fine_Tune
      (Client : in out Client_Type;
       Fine_Tune_Id : in Swagger.UString;
       Result : out .Models.FineTune_Type);

   --  Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
   procedure Retrieve_Model
      (Client : in out Client_Type;
       Model : in Swagger.UString;
       Result : out .Models.Model_Type);

end .Clients;
