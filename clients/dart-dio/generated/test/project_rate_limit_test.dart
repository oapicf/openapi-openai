import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ProjectRateLimit
void main() {
  final instance = ProjectRateLimitBuilder();
  // TODO add properties to the builder and call build()

  group(ProjectRateLimit, () {
    // The object type, which is always `project.rate_limit`
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The model this rate limit applies to.
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

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

    // The maximum images per minute. Only present for relevant models.
    // int maxImagesPer1Minute
    test('to test the property `maxImagesPer1Minute`', () async {
      // TODO
    });

    // The maximum audio megabytes per minute. Only present for relevant models.
    // int maxAudioMegabytesPer1Minute
    test('to test the property `maxAudioMegabytesPer1Minute`', () async {
      // TODO
    });

    // The maximum requests per day. Only present for relevant models.
    // int maxRequestsPer1Day
    test('to test the property `maxRequestsPer1Day`', () async {
      // TODO
    });

    // The maximum batch input tokens per day. Only present for relevant models.
    // int batch1DayMaxInputTokens
    test('to test the property `batch1DayMaxInputTokens`', () async {
      // TODO
    });

  });
}
