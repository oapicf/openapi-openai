import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for StaticChunkingStrategyStatic
void main() {
  final instance = StaticChunkingStrategyStaticBuilder();
  // TODO add properties to the builder and call build()

  group(StaticChunkingStrategyStatic, () {
    // The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
    // int maxChunkSizeTokens
    test('to test the property `maxChunkSizeTokens`', () async {
      // TODO
    });

    // The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
    // int chunkOverlapTokens
    test('to test the property `chunkOverlapTokens`', () async {
      // TODO
    });

  });
}
