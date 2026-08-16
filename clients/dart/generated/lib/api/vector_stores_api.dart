//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class VectorStoresApi {
  VectorStoresApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the file batch belongs to.
  ///
  /// * [String] batchId (required):
  ///   The ID of the file batch to cancel.
  Future<Response> cancelVectorStoreFileBatchWithHttpInfo(String vectorStoreId, String batchId,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel'
      .replaceAll('{vector_store_id}', vectorStoreId)
      .replaceAll('{batch_id}', batchId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


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

  /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the file batch belongs to.
  ///
  /// * [String] batchId (required):
  ///   The ID of the file batch to cancel.
  Future<VectorStoreFileBatchObject?> cancelVectorStoreFileBatch(String vectorStoreId, String batchId,) async {
    final response = await cancelVectorStoreFileBatchWithHttpInfo(vectorStoreId, batchId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'VectorStoreFileBatchObject',) as VectorStoreFileBatchObject;
    
    }
    return null;
  }

  /// Create a vector store.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CreateVectorStoreRequest] createVectorStoreRequest (required):
  Future<Response> createVectorStoreWithHttpInfo(CreateVectorStoreRequest createVectorStoreRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores';

    // ignore: prefer_final_locals
    Object? postBody = createVectorStoreRequest;

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

  /// Create a vector store.
  ///
  /// Parameters:
  ///
  /// * [CreateVectorStoreRequest] createVectorStoreRequest (required):
  Future<VectorStoreObject?> createVectorStore(CreateVectorStoreRequest createVectorStoreRequest,) async {
    final response = await createVectorStoreWithHttpInfo(createVectorStoreRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'VectorStoreObject',) as VectorStoreObject;
    
    }
    return null;
  }

  /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store for which to create a File. 
  ///
  /// * [CreateVectorStoreFileRequest] createVectorStoreFileRequest (required):
  Future<Response> createVectorStoreFileWithHttpInfo(String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}/files'
      .replaceAll('{vector_store_id}', vectorStoreId);

    // ignore: prefer_final_locals
    Object? postBody = createVectorStoreFileRequest;

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

  /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store for which to create a File. 
  ///
  /// * [CreateVectorStoreFileRequest] createVectorStoreFileRequest (required):
  Future<VectorStoreFileObject?> createVectorStoreFile(String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest,) async {
    final response = await createVectorStoreFileWithHttpInfo(vectorStoreId, createVectorStoreFileRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'VectorStoreFileObject',) as VectorStoreFileObject;
    
    }
    return null;
  }

  /// Create a vector store file batch.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store for which to create a File Batch. 
  ///
  /// * [CreateVectorStoreFileBatchRequest] createVectorStoreFileBatchRequest (required):
  Future<Response> createVectorStoreFileBatchWithHttpInfo(String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}/file_batches'
      .replaceAll('{vector_store_id}', vectorStoreId);

    // ignore: prefer_final_locals
    Object? postBody = createVectorStoreFileBatchRequest;

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

  /// Create a vector store file batch.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store for which to create a File Batch. 
  ///
  /// * [CreateVectorStoreFileBatchRequest] createVectorStoreFileBatchRequest (required):
  Future<VectorStoreFileBatchObject?> createVectorStoreFileBatch(String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest,) async {
    final response = await createVectorStoreFileBatchWithHttpInfo(vectorStoreId, createVectorStoreFileBatchRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'VectorStoreFileBatchObject',) as VectorStoreFileBatchObject;
    
    }
    return null;
  }

  /// Delete a vector store.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store to delete.
  Future<Response> deleteVectorStoreWithHttpInfo(String vectorStoreId,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}'
      .replaceAll('{vector_store_id}', vectorStoreId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete a vector store.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store to delete.
  Future<DeleteVectorStoreResponse?> deleteVectorStore(String vectorStoreId,) async {
    final response = await deleteVectorStoreWithHttpInfo(vectorStoreId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeleteVectorStoreResponse',) as DeleteVectorStoreResponse;
    
    }
    return null;
  }

  /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the file belongs to.
  ///
  /// * [String] fileId (required):
  ///   The ID of the file to delete.
  Future<Response> deleteVectorStoreFileWithHttpInfo(String vectorStoreId, String fileId,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}/files/{file_id}'
      .replaceAll('{vector_store_id}', vectorStoreId)
      .replaceAll('{file_id}', fileId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the file belongs to.
  ///
  /// * [String] fileId (required):
  ///   The ID of the file to delete.
  Future<DeleteVectorStoreFileResponse?> deleteVectorStoreFile(String vectorStoreId, String fileId,) async {
    final response = await deleteVectorStoreFileWithHttpInfo(vectorStoreId, fileId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeleteVectorStoreFileResponse',) as DeleteVectorStoreFileResponse;
    
    }
    return null;
  }

  /// Retrieves a vector store.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store to retrieve.
  Future<Response> getVectorStoreWithHttpInfo(String vectorStoreId,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}'
      .replaceAll('{vector_store_id}', vectorStoreId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Retrieves a vector store.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store to retrieve.
  Future<VectorStoreObject?> getVectorStore(String vectorStoreId,) async {
    final response = await getVectorStoreWithHttpInfo(vectorStoreId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'VectorStoreObject',) as VectorStoreObject;
    
    }
    return null;
  }

  /// Retrieves a vector store file.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the file belongs to.
  ///
  /// * [String] fileId (required):
  ///   The ID of the file being retrieved.
  Future<Response> getVectorStoreFileWithHttpInfo(String vectorStoreId, String fileId,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}/files/{file_id}'
      .replaceAll('{vector_store_id}', vectorStoreId)
      .replaceAll('{file_id}', fileId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Retrieves a vector store file.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the file belongs to.
  ///
  /// * [String] fileId (required):
  ///   The ID of the file being retrieved.
  Future<VectorStoreFileObject?> getVectorStoreFile(String vectorStoreId, String fileId,) async {
    final response = await getVectorStoreFileWithHttpInfo(vectorStoreId, fileId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'VectorStoreFileObject',) as VectorStoreFileObject;
    
    }
    return null;
  }

  /// Retrieves a vector store file batch.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the file batch belongs to.
  ///
  /// * [String] batchId (required):
  ///   The ID of the file batch being retrieved.
  Future<Response> getVectorStoreFileBatchWithHttpInfo(String vectorStoreId, String batchId,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}/file_batches/{batch_id}'
      .replaceAll('{vector_store_id}', vectorStoreId)
      .replaceAll('{batch_id}', batchId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Retrieves a vector store file batch.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the file batch belongs to.
  ///
  /// * [String] batchId (required):
  ///   The ID of the file batch being retrieved.
  Future<VectorStoreFileBatchObject?> getVectorStoreFileBatch(String vectorStoreId, String batchId,) async {
    final response = await getVectorStoreFileBatchWithHttpInfo(vectorStoreId, batchId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'VectorStoreFileBatchObject',) as VectorStoreFileBatchObject;
    
    }
    return null;
  }

  /// Returns a list of vector store files in a batch.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the files belong to.
  ///
  /// * [String] batchId (required):
  ///   The ID of the file batch that the files belong to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  ///
  /// * [String] filter:
  ///   Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
  Future<Response> listFilesInVectorStoreBatchWithHttpInfo(String vectorStoreId, String batchId, { int? limit, String? order, String? after, String? before, String? filter, }) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}/file_batches/{batch_id}/files'
      .replaceAll('{vector_store_id}', vectorStoreId)
      .replaceAll('{batch_id}', batchId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (before != null) {
      queryParams.addAll(_queryParams('', 'before', before));
    }
    if (filter != null) {
      queryParams.addAll(_queryParams('', 'filter', filter));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Returns a list of vector store files in a batch.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the files belong to.
  ///
  /// * [String] batchId (required):
  ///   The ID of the file batch that the files belong to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  ///
  /// * [String] filter:
  ///   Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
  Future<ListVectorStoreFilesResponse?> listFilesInVectorStoreBatch(String vectorStoreId, String batchId, { int? limit, String? order, String? after, String? before, String? filter, }) async {
    final response = await listFilesInVectorStoreBatchWithHttpInfo(vectorStoreId, batchId,  limit: limit, order: order, after: after, before: before, filter: filter, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListVectorStoreFilesResponse',) as ListVectorStoreFilesResponse;
    
    }
    return null;
  }

  /// Returns a list of vector store files.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the files belong to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  ///
  /// * [String] filter:
  ///   Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
  Future<Response> listVectorStoreFilesWithHttpInfo(String vectorStoreId, { int? limit, String? order, String? after, String? before, String? filter, }) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}/files'
      .replaceAll('{vector_store_id}', vectorStoreId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (before != null) {
      queryParams.addAll(_queryParams('', 'before', before));
    }
    if (filter != null) {
      queryParams.addAll(_queryParams('', 'filter', filter));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Returns a list of vector store files.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store that the files belong to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  ///
  /// * [String] filter:
  ///   Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
  Future<ListVectorStoreFilesResponse?> listVectorStoreFiles(String vectorStoreId, { int? limit, String? order, String? after, String? before, String? filter, }) async {
    final response = await listVectorStoreFilesWithHttpInfo(vectorStoreId,  limit: limit, order: order, after: after, before: before, filter: filter, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListVectorStoreFilesResponse',) as ListVectorStoreFilesResponse;
    
    }
    return null;
  }

  /// Returns a list of vector stores.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<Response> listVectorStoresWithHttpInfo({ int? limit, String? order, String? after, String? before, }) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (before != null) {
      queryParams.addAll(_queryParams('', 'before', before));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Returns a list of vector stores.
  ///
  /// Parameters:
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<ListVectorStoresResponse?> listVectorStores({ int? limit, String? order, String? after, String? before, }) async {
    final response = await listVectorStoresWithHttpInfo( limit: limit, order: order, after: after, before: before, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListVectorStoresResponse',) as ListVectorStoresResponse;
    
    }
    return null;
  }

  /// Modifies a vector store.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store to modify.
  ///
  /// * [UpdateVectorStoreRequest] updateVectorStoreRequest (required):
  Future<Response> modifyVectorStoreWithHttpInfo(String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/vector_stores/{vector_store_id}'
      .replaceAll('{vector_store_id}', vectorStoreId);

    // ignore: prefer_final_locals
    Object? postBody = updateVectorStoreRequest;

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

  /// Modifies a vector store.
  ///
  /// Parameters:
  ///
  /// * [String] vectorStoreId (required):
  ///   The ID of the vector store to modify.
  ///
  /// * [UpdateVectorStoreRequest] updateVectorStoreRequest (required):
  Future<VectorStoreObject?> modifyVectorStore(String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest,) async {
    final response = await modifyVectorStoreWithHttpInfo(vectorStoreId, updateVectorStoreRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'VectorStoreObject',) as VectorStoreObject;
    
    }
    return null;
  }
}
