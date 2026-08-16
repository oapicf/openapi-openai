//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ImagesApi {
  ImagesApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Creates an image given a prompt.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CreateImageRequest] createImageRequest (required):
  Future<Response> createImageWithHttpInfo(CreateImageRequest createImageRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/images/generations';

    // ignore: prefer_final_locals
    Object? postBody = createImageRequest;

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

  /// Creates an image given a prompt.
  ///
  /// Parameters:
  ///
  /// * [CreateImageRequest] createImageRequest (required):
  Future<ImagesResponse?> createImage(CreateImageRequest createImageRequest,) async {
    final response = await createImageWithHttpInfo(createImageRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ImagesResponse',) as ImagesResponse;
    
    }
    return null;
  }

  /// Creates an edited or extended image given an original image and a prompt.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] image (required):
  ///   The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
  ///
  /// * [String] prompt (required):
  ///   A text description of the desired image(s). The maximum length is 1000 characters.
  ///
  /// * [MultipartFile] mask:
  ///   An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
  ///
  /// * [CreateImageEditRequestModel] model:
  ///
  /// * [int] n:
  ///   The number of images to generate. Must be between 1 and 10.
  ///
  /// * [String] size:
  ///   The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  ///
  /// * [String] responseFormat:
  ///   The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  ///
  /// * [String] user:
  ///   A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  Future<Response> createImageEditWithHttpInfo(MultipartFile image, String prompt, { MultipartFile? mask, CreateImageEditRequestModel? model, int? n, String? size, String? responseFormat, String? user, }) async {
    // ignore: prefer_const_declarations
    final path = r'/images/edits';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['multipart/form-data'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (image != null) {
      hasFields = true;
      mp.fields[r'image'] = image.field;
      mp.files.add(image);
    }
    if (prompt != null) {
      hasFields = true;
      mp.fields[r'prompt'] = parameterToString(prompt);
    }
    if (mask != null) {
      hasFields = true;
      mp.fields[r'mask'] = mask.field;
      mp.files.add(mask);
    }
    if (model != null) {
      hasFields = true;
      mp.fields[r'model'] = parameterToString(model);
    }
    if (n != null) {
      hasFields = true;
      mp.fields[r'n'] = parameterToString(n);
    }
    if (size != null) {
      hasFields = true;
      mp.fields[r'size'] = parameterToString(size);
    }
    if (responseFormat != null) {
      hasFields = true;
      mp.fields[r'response_format'] = parameterToString(responseFormat);
    }
    if (user != null) {
      hasFields = true;
      mp.fields[r'user'] = parameterToString(user);
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

  /// Creates an edited or extended image given an original image and a prompt.
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] image (required):
  ///   The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
  ///
  /// * [String] prompt (required):
  ///   A text description of the desired image(s). The maximum length is 1000 characters.
  ///
  /// * [MultipartFile] mask:
  ///   An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
  ///
  /// * [CreateImageEditRequestModel] model:
  ///
  /// * [int] n:
  ///   The number of images to generate. Must be between 1 and 10.
  ///
  /// * [String] size:
  ///   The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  ///
  /// * [String] responseFormat:
  ///   The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  ///
  /// * [String] user:
  ///   A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  Future<ImagesResponse?> createImageEdit(MultipartFile image, String prompt, { MultipartFile? mask, CreateImageEditRequestModel? model, int? n, String? size, String? responseFormat, String? user, }) async {
    final response = await createImageEditWithHttpInfo(image, prompt,  mask: mask, model: model, n: n, size: size, responseFormat: responseFormat, user: user, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ImagesResponse',) as ImagesResponse;
    
    }
    return null;
  }

  /// Creates a variation of a given image.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] image (required):
  ///   The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
  ///
  /// * [CreateImageEditRequestModel] model:
  ///
  /// * [int] n:
  ///   The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
  ///
  /// * [String] responseFormat:
  ///   The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  ///
  /// * [String] size:
  ///   The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  ///
  /// * [String] user:
  ///   A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  Future<Response> createImageVariationWithHttpInfo(MultipartFile image, { CreateImageEditRequestModel? model, int? n, String? responseFormat, String? size, String? user, }) async {
    // ignore: prefer_const_declarations
    final path = r'/images/variations';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['multipart/form-data'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (image != null) {
      hasFields = true;
      mp.fields[r'image'] = image.field;
      mp.files.add(image);
    }
    if (model != null) {
      hasFields = true;
      mp.fields[r'model'] = parameterToString(model);
    }
    if (n != null) {
      hasFields = true;
      mp.fields[r'n'] = parameterToString(n);
    }
    if (responseFormat != null) {
      hasFields = true;
      mp.fields[r'response_format'] = parameterToString(responseFormat);
    }
    if (size != null) {
      hasFields = true;
      mp.fields[r'size'] = parameterToString(size);
    }
    if (user != null) {
      hasFields = true;
      mp.fields[r'user'] = parameterToString(user);
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

  /// Creates a variation of a given image.
  ///
  /// Parameters:
  ///
  /// * [MultipartFile] image (required):
  ///   The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
  ///
  /// * [CreateImageEditRequestModel] model:
  ///
  /// * [int] n:
  ///   The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
  ///
  /// * [String] responseFormat:
  ///   The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  ///
  /// * [String] size:
  ///   The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  ///
  /// * [String] user:
  ///   A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  Future<ImagesResponse?> createImageVariation(MultipartFile image, { CreateImageEditRequestModel? model, int? n, String? responseFormat, String? size, String? user, }) async {
    final response = await createImageVariationWithHttpInfo(image,  model: model, n: n, responseFormat: responseFormat, size: size, user: user, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ImagesResponse',) as ImagesResponse;
    
    }
    return null;
  }
}
