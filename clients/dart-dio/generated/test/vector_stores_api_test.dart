import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for VectorStoresApi
void main() {
  final instance = Openapi().getVectorStoresApi();

  group(VectorStoresApi, () {
    // Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    //
    //Future<VectorStoreFileBatchObject> cancelVectorStoreFileBatch(String vectorStoreId, String batchId) async
    test('test cancelVectorStoreFileBatch', () async {
      // TODO
    });

    // Create a vector store.
    //
    //Future<VectorStoreObject> createVectorStore(CreateVectorStoreRequest createVectorStoreRequest) async
    test('test createVectorStore', () async {
      // TODO
    });

    // Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    //
    //Future<VectorStoreFileObject> createVectorStoreFile(String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest) async
    test('test createVectorStoreFile', () async {
      // TODO
    });

    // Create a vector store file batch.
    //
    //Future<VectorStoreFileBatchObject> createVectorStoreFileBatch(String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest) async
    test('test createVectorStoreFileBatch', () async {
      // TODO
    });

    // Delete a vector store.
    //
    //Future<DeleteVectorStoreResponse> deleteVectorStore(String vectorStoreId) async
    test('test deleteVectorStore', () async {
      // TODO
    });

    // Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    //
    //Future<DeleteVectorStoreFileResponse> deleteVectorStoreFile(String vectorStoreId, String fileId) async
    test('test deleteVectorStoreFile', () async {
      // TODO
    });

    // Retrieves a vector store.
    //
    //Future<VectorStoreObject> getVectorStore(String vectorStoreId) async
    test('test getVectorStore', () async {
      // TODO
    });

    // Retrieves a vector store file.
    //
    //Future<VectorStoreFileObject> getVectorStoreFile(String vectorStoreId, String fileId) async
    test('test getVectorStoreFile', () async {
      // TODO
    });

    // Retrieves a vector store file batch.
    //
    //Future<VectorStoreFileBatchObject> getVectorStoreFileBatch(String vectorStoreId, String batchId) async
    test('test getVectorStoreFileBatch', () async {
      // TODO
    });

    // Returns a list of vector store files in a batch.
    //
    //Future<ListVectorStoreFilesResponse> listFilesInVectorStoreBatch(String vectorStoreId, String batchId, { int limit, String order, String after, String before, String filter }) async
    test('test listFilesInVectorStoreBatch', () async {
      // TODO
    });

    // Returns a list of vector store files.
    //
    //Future<ListVectorStoreFilesResponse> listVectorStoreFiles(String vectorStoreId, { int limit, String order, String after, String before, String filter }) async
    test('test listVectorStoreFiles', () async {
      // TODO
    });

    // Returns a list of vector stores.
    //
    //Future<ListVectorStoresResponse> listVectorStores({ int limit, String order, String after, String before }) async
    test('test listVectorStores', () async {
      // TODO
    });

    // Modifies a vector store.
    //
    //Future<VectorStoreObject> modifyVectorStore(String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest) async
    test('test modifyVectorStore', () async {
      // TODO
    });

  });
}
