import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for FineTuningJobCheckpoint
void main() {
  final instance = FineTuningJobCheckpointBuilder();
  // TODO add properties to the builder and call build()

  group(FineTuningJobCheckpoint, () {
    // The checkpoint identifier, which can be referenced in the API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the checkpoint was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The name of the fine-tuned checkpoint model that is created.
    // String fineTunedModelCheckpoint
    test('to test the property `fineTunedModelCheckpoint`', () async {
      // TODO
    });

    // The step number that the checkpoint was created at.
    // int stepNumber
    test('to test the property `stepNumber`', () async {
      // TODO
    });

    // FineTuningJobCheckpointMetrics metrics
    test('to test the property `metrics`', () async {
      // TODO
    });

    // The name of the fine-tuning job that this checkpoint was created from.
    // String fineTuningJobId
    test('to test the property `fineTuningJobId`', () async {
      // TODO
    });

    // The object type, which is always \"fine_tuning.job.checkpoint\".
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

  });
}
