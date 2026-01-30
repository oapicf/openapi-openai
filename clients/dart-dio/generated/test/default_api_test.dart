import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // Create an organization admin API key
    //
    // Create a new admin-level API key for the organization.
    //
    //Future<AdminApiKey> adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest) async
    test('test adminApiKeysCreate', () async {
      // TODO
    });

    // Delete an organization admin API key
    //
    // Delete the specified admin API key.
    //
    //Future<AdminApiKeysDelete200Response> adminApiKeysDelete(String keyId) async
    test('test adminApiKeysDelete', () async {
      // TODO
    });

    // Retrieve a single organization API key
    //
    // Get details for a specific organization API key by its ID.
    //
    //Future<AdminApiKey> adminApiKeysGet(String keyId) async
    test('test adminApiKeysGet', () async {
      // TODO
    });

    // List organization API keys
    //
    // Retrieve a paginated list of organization admin API keys.
    //
    //Future<ApiKeyList> adminApiKeysList({ String after, String order, int limit }) async
    test('test adminApiKeysList', () async {
      // TODO
    });

  });
}
