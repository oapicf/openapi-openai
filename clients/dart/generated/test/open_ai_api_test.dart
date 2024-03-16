//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for OpenAIApi
void main() {
  // final instance = OpenAIApi();

  group('tests for OpenAIApi', () {
    // Immediately cancel a fine-tune job. 
    //
    //Future<FineTune> cancelFineTune(String fineTuneId) async
    test('test cancelFineTune', () async {
      // TODO
    });

    // Creates a model response for the given chat conversation.
    //
    //Future<CreateChatCompletionResponse> createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest) async
    test('test createChatCompletion', () async {
      // TODO
    });

    // Creates a completion for the provided prompt and parameters.
    //
    //Future<CreateCompletionResponse> createCompletion(CreateCompletionRequest createCompletionRequest) async
    test('test createCompletion', () async {
      // TODO
    });

    // Creates a new edit for the provided input, instruction, and parameters.
    //
    //Future<CreateEditResponse> createEdit(CreateEditRequest createEditRequest) async
    test('test createEdit', () async {
      // TODO
    });

    // Creates an embedding vector representing the input text.
    //
    //Future<CreateEmbeddingResponse> createEmbedding(CreateEmbeddingRequest createEmbeddingRequest) async
    test('test createEmbedding', () async {
      // TODO
    });

    // Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    //
    //Future<OpenAIFile> createFile(MultipartFile file, String purpose) async
    test('test createFile', () async {
      // TODO
    });

    // Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    //
    //Future<FineTune> createFineTune(CreateFineTuneRequest createFineTuneRequest) async
    test('test createFineTune', () async {
      // TODO
    });

    // Creates an image given a prompt.
    //
    //Future<ImagesResponse> createImage(CreateImageRequest createImageRequest) async
    test('test createImage', () async {
      // TODO
    });

    // Creates an edited or extended image given an original image and a prompt.
    //
    //Future<ImagesResponse> createImageEdit(MultipartFile image, String prompt, { MultipartFile mask, int n, String size, String responseFormat, String user }) async
    test('test createImageEdit', () async {
      // TODO
    });

    // Creates a variation of a given image.
    //
    //Future<ImagesResponse> createImageVariation(MultipartFile image, { int n, String size, String responseFormat, String user }) async
    test('test createImageVariation', () async {
      // TODO
    });

    // Classifies if text violates OpenAI's Content Policy
    //
    //Future<CreateModerationResponse> createModeration(CreateModerationRequest createModerationRequest) async
    test('test createModeration', () async {
      // TODO
    });

    // Transcribes audio into the input language.
    //
    //Future<CreateTranscriptionResponse> createTranscription(MultipartFile file, CreateTranscriptionRequestModel model, { String prompt, String responseFormat, num temperature, String language }) async
    test('test createTranscription', () async {
      // TODO
    });

    // Translates audio into English.
    //
    //Future<CreateTranslationResponse> createTranslation(MultipartFile file, CreateTranscriptionRequestModel model, { String prompt, String responseFormat, num temperature }) async
    test('test createTranslation', () async {
      // TODO
    });

    // Delete a file.
    //
    //Future<DeleteFileResponse> deleteFile(String fileId) async
    test('test deleteFile', () async {
      // TODO
    });

    // Delete a fine-tuned model. You must have the Owner role in your organization.
    //
    //Future<DeleteModelResponse> deleteModel(String model) async
    test('test deleteModel', () async {
      // TODO
    });

    // Returns the contents of the specified file
    //
    //Future<String> downloadFile(String fileId) async
    test('test downloadFile', () async {
      // TODO
    });

    // Returns a list of files that belong to the user's organization.
    //
    //Future<ListFilesResponse> listFiles() async
    test('test listFiles', () async {
      // TODO
    });

    // Get fine-grained status updates for a fine-tune job. 
    //
    //Future<ListFineTuneEventsResponse> listFineTuneEvents(String fineTuneId, { bool stream }) async
    test('test listFineTuneEvents', () async {
      // TODO
    });

    // List your organization's fine-tuning jobs 
    //
    //Future<ListFineTunesResponse> listFineTunes() async
    test('test listFineTunes', () async {
      // TODO
    });

    // Lists the currently available models, and provides basic information about each one such as the owner and availability.
    //
    //Future<ListModelsResponse> listModels() async
    test('test listModels', () async {
      // TODO
    });

    // Returns information about a specific file.
    //
    //Future<OpenAIFile> retrieveFile(String fileId) async
    test('test retrieveFile', () async {
      // TODO
    });

    // Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    //
    //Future<FineTune> retrieveFineTune(String fineTuneId) async
    test('test retrieveFineTune', () async {
      // TODO
    });

    // Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    //
    //Future<Model> retrieveModel(String model) async
    test('test retrieveModel', () async {
      // TODO
    });

  });
}
