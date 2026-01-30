import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for UsageCompletionsResult
void main() {
  final instance = UsageCompletionsResultBuilder();
  // TODO add properties to the builder and call build()

  group(UsageCompletionsResult, () {
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
    // int inputTokens
    test('to test the property `inputTokens`', () async {
      // TODO
    });

    // The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
    // int inputCachedTokens
    test('to test the property `inputCachedTokens`', () async {
      // TODO
    });

    // The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
    // int outputTokens
    test('to test the property `outputTokens`', () async {
      // TODO
    });

    // The aggregated number of audio input tokens used, including cached tokens.
    // int inputAudioTokens
    test('to test the property `inputAudioTokens`', () async {
      // TODO
    });

    // The aggregated number of audio output tokens used.
    // int outputAudioTokens
    test('to test the property `outputAudioTokens`', () async {
      // TODO
    });

    // The count of requests made to the model.
    // int numModelRequests
    test('to test the property `numModelRequests`', () async {
      // TODO
    });

    // When `group_by=project_id`, this field provides the project ID of the grouped usage result.
    // String projectId
    test('to test the property `projectId`', () async {
      // TODO
    });

    // When `group_by=user_id`, this field provides the user ID of the grouped usage result.
    // String userId
    test('to test the property `userId`', () async {
      // TODO
    });

    // When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
    // String apiKeyId
    test('to test the property `apiKeyId`', () async {
      // TODO
    });

    // When `group_by=model`, this field provides the model name of the grouped usage result.
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
    // bool batch
    test('to test the property `batch`', () async {
      // TODO
    });

  });
}
