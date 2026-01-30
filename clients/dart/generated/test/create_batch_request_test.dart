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

// tests for CreateBatchRequest
void main() {
  // final instance = CreateBatchRequest();

  group('test CreateBatchRequest', () {
    // The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
    // String inputFileId
    test('to test the property `inputFileId`', () async {
      // TODO
    });

    // The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
    // String endpoint
    test('to test the property `endpoint`', () async {
      // TODO
    });

    // The time frame within which the batch should be processed. Currently only `24h` is supported.
    // String completionWindow
    test('to test the property `completionWindow`', () async {
      // TODO
    });

    // Optional custom metadata for the batch.
    // Map<String, String> metadata (default value: const {})
    test('to test the property `metadata`', () async {
      // TODO
    });


  });

}
