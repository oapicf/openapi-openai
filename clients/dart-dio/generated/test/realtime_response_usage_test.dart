import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeResponseUsage
void main() {
  final instance = RealtimeResponseUsageBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeResponseUsage, () {
    // The total number of tokens in the Response including input and output  text and audio tokens. 
    // int totalTokens
    test('to test the property `totalTokens`', () async {
      // TODO
    });

    // The number of input tokens used in the Response, including text and  audio tokens. 
    // int inputTokens
    test('to test the property `inputTokens`', () async {
      // TODO
    });

    // The number of output tokens sent in the Response, including text and  audio tokens. 
    // int outputTokens
    test('to test the property `outputTokens`', () async {
      // TODO
    });

    // RealtimeResponseUsageInputTokenDetails inputTokenDetails
    test('to test the property `inputTokenDetails`', () async {
      // TODO
    });

    // RealtimeResponseUsageOutputTokenDetails outputTokenDetails
    test('to test the property `outputTokenDetails`', () async {
      // TODO
    });

  });
}
