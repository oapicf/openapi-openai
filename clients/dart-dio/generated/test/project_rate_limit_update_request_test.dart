import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ProjectRateLimitUpdateRequest
void main() {
  final instance = ProjectRateLimitUpdateRequestBuilder();
  // TODO add properties to the builder and call build()

  group(ProjectRateLimitUpdateRequest, () {
    // The maximum requests per minute.
    // int maxRequestsPer1Minute
    test('to test the property `maxRequestsPer1Minute`', () async {
      // TODO
    });

    // The maximum tokens per minute.
    // int maxTokensPer1Minute
    test('to test the property `maxTokensPer1Minute`', () async {
      // TODO
    });

    // The maximum images per minute. Only relevant for certain models.
    // int maxImagesPer1Minute
    test('to test the property `maxImagesPer1Minute`', () async {
      // TODO
    });

    // The maximum audio megabytes per minute. Only relevant for certain models.
    // int maxAudioMegabytesPer1Minute
    test('to test the property `maxAudioMegabytesPer1Minute`', () async {
      // TODO
    });

    // The maximum requests per day. Only relevant for certain models.
    // int maxRequestsPer1Day
    test('to test the property `maxRequestsPer1Day`', () async {
      // TODO
    });

    // The maximum batch input tokens per day. Only relevant for certain models.
    // int batch1DayMaxInputTokens
    test('to test the property `batch1DayMaxInputTokens`', () async {
      // TODO
    });

  });
}
