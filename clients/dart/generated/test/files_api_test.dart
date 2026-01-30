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


/// tests for FilesApi
void main() {
  // final instance = FilesApi();

  group('tests for FilesApi', () {
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
