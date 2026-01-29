import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for FilesApi
void main() {
  final instance = Openapi().getFilesApi();

  group(FilesApi, () {
    // Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    //
    //Future<OpenAIFile> createFile(MultipartFile file, String purpose) async
    test('test createFile', () async {
      // TODO
    });

    // Delete a file.
    //
    //Future<DeleteFileResponse> deleteFile(String fileId) async
    test('test deleteFile', () async {
      // TODO
    });

    // Returns the contents of the specified file.
    //
    //Future<String> downloadFile(String fileId) async
    test('test downloadFile', () async {
      // TODO
    });

    // Returns a list of files that belong to the user's organization.
    //
    //Future<ListFilesResponse> listFiles({ String purpose }) async
    test('test listFiles', () async {
      // TODO
    });

    // Returns information about a specific file.
    //
    //Future<OpenAIFile> retrieveFile(String fileId) async
    test('test retrieveFile', () async {
      // TODO
    });

  });
}
