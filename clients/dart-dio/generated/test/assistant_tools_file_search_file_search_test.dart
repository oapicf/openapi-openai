import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AssistantToolsFileSearchFileSearch
void main() {
  final instance = AssistantToolsFileSearchFileSearchBuilder();
  // TODO add properties to the builder and call build()

  group(AssistantToolsFileSearchFileSearch, () {
    // The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    // int maxNumResults
    test('to test the property `maxNumResults`', () async {
      // TODO
    });

    // FileSearchRankingOptions rankingOptions
    test('to test the property `rankingOptions`', () async {
      // TODO
    });

  });
}
