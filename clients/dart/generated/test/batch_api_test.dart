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


/// tests for BatchApi
void main() {
  // final instance = BatchApi();

  group('tests for BatchApi', () {
    // Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
    //
    //Future<Batch> cancelBatch(String batchId) async
    test('test cancelBatch', () async {
      // TODO
    });

    // Creates and executes a batch from an uploaded file of requests
    //
    //Future<Batch> createBatch(CreateBatchRequest createBatchRequest) async
    test('test createBatch', () async {
      // TODO
    });

    // List your organization's batches.
    //
    //Future<ListBatchesResponse> listBatches({ String after, int limit }) async
    test('test listBatches', () async {
      // TODO
    });

    // Retrieves a batch.
    //
    //Future<Batch> retrieveBatch(String batchId) async
    test('test retrieveBatch', () async {
      // TODO
    });

  });
}
