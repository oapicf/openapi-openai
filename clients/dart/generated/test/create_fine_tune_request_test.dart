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

// tests for CreateFineTuneRequest
void main() {
  // final instance = CreateFineTuneRequest();

  group('test CreateFineTuneRequest', () {
    // The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
    // String trainingFile
    test('to test the property `trainingFile`', () async {
      // TODO
    });

    // The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
    // String validationFile
    test('to test the property `validationFile`', () async {
      // TODO
    });

    // CreateFineTuneRequestModel model
    test('to test the property `model`', () async {
      // TODO
    });

    // The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
    // int nEpochs (default value: 4)
    test('to test the property `nEpochs`', () async {
      // TODO
    });

    // The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
    // int batchSize
    test('to test the property `batchSize`', () async {
      // TODO
    });

    // The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
    // num learningRateMultiplier
    test('to test the property `learningRateMultiplier`', () async {
      // TODO
    });

    // The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
    // num promptLossWeight (default value: 0.01)
    test('to test the property `promptLossWeight`', () async {
      // TODO
    });

    // If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
    // bool computeClassificationMetrics (default value: false)
    test('to test the property `computeClassificationMetrics`', () async {
      // TODO
    });

    // The number of classes in a classification task.  This parameter is required for multiclass classification. 
    // int classificationNClasses
    test('to test the property `classificationNClasses`', () async {
      // TODO
    });

    // The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
    // String classificationPositiveClass
    test('to test the property `classificationPositiveClass`', () async {
      // TODO
    });

    // If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
    // List<num> classificationBetas (default value: const [])
    test('to test the property `classificationBetas`', () async {
      // TODO
    });

    // A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
    // String suffix
    test('to test the property `suffix`', () async {
      // TODO
    });


  });

}