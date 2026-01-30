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

// tests for FineTuningJob
void main() {
  // final instance = FineTuningJob();

  group('test FineTuningJob', () {
    // The object identifier, which can be referenced in the API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the fine-tuning job was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // FineTuningJobError error
    test('to test the property `error`', () async {
      // TODO
    });

    // The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
    // String fineTunedModel
    test('to test the property `fineTunedModel`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
    // int finishedAt
    test('to test the property `finishedAt`', () async {
      // TODO
    });

    // FineTuningJobHyperparameters hyperparameters
    test('to test the property `hyperparameters`', () async {
      // TODO
    });

    // The base model that is being fine-tuned.
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // The object type, which is always \"fine_tuning.job\".
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The organization that owns the fine-tuning job.
    // String organizationId
    test('to test the property `organizationId`', () async {
      // TODO
    });

    // The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
    // List<String> resultFiles (default value: const [])
    test('to test the property `resultFiles`', () async {
      // TODO
    });

    // The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
    // int trainedTokens
    test('to test the property `trainedTokens`', () async {
      // TODO
    });

    // The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
    // String trainingFile
    test('to test the property `trainingFile`', () async {
      // TODO
    });

    // The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
    // String validationFile
    test('to test the property `validationFile`', () async {
      // TODO
    });

    // A list of integrations to enable for this fine-tuning job.
    // List<FineTuningJobIntegrationsInner> integrations (default value: const [])
    test('to test the property `integrations`', () async {
      // TODO
    });

    // The seed used for the fine-tuning job.
    // int seed
    test('to test the property `seed`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
    // int estimatedFinish
    test('to test the property `estimatedFinish`', () async {
      // TODO
    });

    // FineTuneMethod method
    test('to test the property `method`', () async {
      // TODO
    });


  });

}
