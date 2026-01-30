import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for FilesApi
void main() {
  final instance = Openapi().getFilesApi();

  group(FilesApi, () {
    // Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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

    // Returns a list of files.
    //
    //Future<ListFilesResponse> listFiles({ String purpose, int limit, String order, String after }) async
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
