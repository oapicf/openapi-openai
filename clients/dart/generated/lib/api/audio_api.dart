//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AudioApi {
  AudioApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Generates audio from the input text.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CreateSpeechRequest] createSpeechRequest (required):
  Future<Response> createSpeechWithHttpInfo(CreateSpeechRequest createSpeechRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/audio/speech';

    // ignore: prefer_final_locals
    Object? postBody = createSpeechRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Generates audio from the input text.
  ///
  /// Parameters:
  ///
  /// * [CreateSpeechRequest] createSpeechRequest (required):
  Future<MultipartFile?> createSpeech(CreateSpeechRequest createSpeechRequest,) async {
    final response = await createSpeechWithHttpInfo(createSpeechRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
    
    }
    return null;
  }

  /// Transcribes audio into the input language.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] file (required):
  ///   The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
  ///
  /// * [CreateTranscriptionRequestModel] model (required):
  ///
  /// * [String] language:
  ///   The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
  ///
  /// * [String] prompt:
  ///   An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
  ///
  /// * [AudioResponseFormat] responseFormat:
  ///
  /// * [num] temperature:
  ///   The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  ///
  /// * [List<String>] timestampGranularitiesLeftSquareBracketRightSquareBracket:
  ///   The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
  Future<Response> createTranscriptionWithHttpInfo(MultipartFile file, CreateTranscriptionRequestModel model, { String? language, String? prompt, AudioResponseFormat? responseFormat, num? temperature, List<String>? timestampGranularitiesLeftSquareBracketRightSquareBracket, }) async {
    // ignore: prefer_const_declarations
    final path = r'/audio/transcriptions';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['multipart/form-data'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (file != null) {
      hasFields = true;
      mp.fields[r'file'] = file.field;
      mp.files.add(file);
    }
    if (model != null) {
      hasFields = true;
      mp.fields[r'model'] = parameterToString(model);
    }
    if (language != null) {
      hasFields = true;
      mp.fields[r'language'] = parameterToString(language);
    }
    if (prompt != null) {
      hasFields = true;
      mp.fields[r'prompt'] = parameterToString(prompt);
    }
    if (responseFormat != null) {
      hasFields = true;
      mp.fields[r'response_format'] = parameterToString(responseFormat);
    }
    if (temperature != null) {
      hasFields = true;
      mp.fields[r'temperature'] = parameterToString(temperature);
    }
    if (timestampGranularitiesLeftSquareBracketRightSquareBracket != null) {
      hasFields = true;
      mp.fields[r'timestamp_granularities[]'] = parameterToString(timestampGranularitiesLeftSquareBracketRightSquareBracket);
    }
    if (hasFields) {
      postBody = mp;
    }

    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Transcribes audio into the input language.
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] file (required):
  ///   The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
  ///
  /// * [CreateTranscriptionRequestModel] model (required):
  ///
  /// * [String] language:
  ///   The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
  ///
  /// * [String] prompt:
  ///   An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
  ///
  /// * [AudioResponseFormat] responseFormat:
  ///
  /// * [num] temperature:
  ///   The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  ///
  /// * [List<String>] timestampGranularitiesLeftSquareBracketRightSquareBracket:
  ///   The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
  Future<CreateTranscription200Response?> createTranscription(MultipartFile file, CreateTranscriptionRequestModel model, { String? language, String? prompt, AudioResponseFormat? responseFormat, num? temperature, List<String>? timestampGranularitiesLeftSquareBracketRightSquareBracket, }) async {
    final response = await createTranscriptionWithHttpInfo(file, model,  language: language, prompt: prompt, responseFormat: responseFormat, temperature: temperature, timestampGranularitiesLeftSquareBracketRightSquareBracket: timestampGranularitiesLeftSquareBracketRightSquareBracket, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CreateTranscription200Response',) as CreateTranscription200Response;
    
    }
    return null;
  }

  /// Translates audio into English.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] file (required):
  ///   The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
  ///
  /// * [CreateTranscriptionRequestModel] model (required):
  ///
  /// * [String] prompt:
  ///   An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
  ///
  /// * [AudioResponseFormat] responseFormat:
  ///
  /// * [num] temperature:
  ///   The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  Future<Response> createTranslationWithHttpInfo(MultipartFile file, CreateTranscriptionRequestModel model, { String? prompt, AudioResponseFormat? responseFormat, num? temperature, }) async {
    // ignore: prefer_const_declarations
    final path = r'/audio/translations';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['multipart/form-data'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (file != null) {
      hasFields = true;
      mp.fields[r'file'] = file.field;
      mp.files.add(file);
    }
    if (model != null) {
      hasFields = true;
      mp.fields[r'model'] = parameterToString(model);
    }
    if (prompt != null) {
      hasFields = true;
      mp.fields[r'prompt'] = parameterToString(prompt);
    }
    if (responseFormat != null) {
      hasFields = true;
      mp.fields[r'response_format'] = parameterToString(responseFormat);
    }
    if (temperature != null) {
      hasFields = true;
      mp.fields[r'temperature'] = parameterToString(temperature);
    }
    if (hasFields) {
      postBody = mp;
    }

    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Translates audio into English.
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] file (required):
  ///   The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
  ///
  /// * [CreateTranscriptionRequestModel] model (required):
  ///
  /// * [String] prompt:
  ///   An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
  ///
  /// * [AudioResponseFormat] responseFormat:
  ///
  /// * [num] temperature:
  ///   The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  Future<CreateTranslation200Response?> createTranslation(MultipartFile file, CreateTranscriptionRequestModel model, { String? prompt, AudioResponseFormat? responseFormat, num? temperature, }) async {
    final response = await createTranslationWithHttpInfo(file, model,  prompt: prompt, responseFormat: responseFormat, temperature: temperature, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CreateTranslation200Response',) as CreateTranslation200Response;
    
    }
    return null;
  }
}
