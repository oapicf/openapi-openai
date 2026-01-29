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

// tests for CreateFineTuningJobRequest
void main() {
  // final instance = CreateFineTuningJobRequest();

  group('test CreateFineTuningJobRequest', () {
    // CreateFineTuningJobRequestModel model
    test('to test the property `model`', () async {
      // TODO
    });

    // The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
    // String trainingFile
    test('to test the property `trainingFile`', () async {
      // TODO
    });

    // CreateFineTuningJobRequestHyperparameters hyperparameters
    test('to test the property `hyperparameters`', () async {
      // TODO
    });

    // A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
    // String suffix
    test('to test the property `suffix`', () async {
      // TODO
    });

    // The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
    // String validationFile
    test('to test the property `validationFile`', () async {
      // TODO
    });

    // A list of integrations to enable for your fine-tuning job.
    // List<CreateFineTuningJobRequestIntegrationsInner> integrations (default value: const [])
    test('to test the property `integrations`', () async {
      // TODO
    });

    // The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
    // int seed
    test('to test the property `seed`', () async {
      // TODO
    });


  });

}
