import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CompletionUsage
void main() {
  final instance = CompletionUsageBuilder();
  // TODO add properties to the builder and call build()

  group(CompletionUsage, () {
    // Number of tokens in the generated completion.
    // int completionTokens
    test('to test the property `completionTokens`', () async {
      // TODO
    });

    // Number of tokens in the prompt.
    // int promptTokens
    test('to test the property `promptTokens`', () async {
      // TODO
    });

    // Total number of tokens used in the request (prompt + completion).
    // int totalTokens
    test('to test the property `totalTokens`', () async {
      // TODO
    });

    // CompletionUsageCompletionTokensDetails completionTokensDetails
    test('to test the property `completionTokensDetails`', () async {
      // TODO
    });

    // CompletionUsagePromptTokensDetails promptTokensDetails
    test('to test the property `promptTokensDetails`', () async {
      // TODO
    });

  });
}
