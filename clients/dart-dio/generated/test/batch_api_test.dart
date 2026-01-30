import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for BatchApi
void main() {
  final instance = Openapi().getBatchApi();

  group(BatchApi, () {
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
