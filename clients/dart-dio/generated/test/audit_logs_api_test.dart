import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AuditLogsApi
void main() {
  final instance = Openapi().getAuditLogsApi();

  group(AuditLogsApi, () {
    // List user actions and configuration changes within this organization.
    //
    //Future<ListAuditLogsResponse> listAuditLogs({ ListAuditLogsEffectiveAtParameter effectiveAt, BuiltList<String> projectIdsLeftSquareBracketRightSquareBracket, BuiltList<AuditLogEventType> eventTypesLeftSquareBracketRightSquareBracket, BuiltList<String> actorIdsLeftSquareBracketRightSquareBracket, BuiltList<String> actorEmailsLeftSquareBracketRightSquareBracket, BuiltList<String> resourceIdsLeftSquareBracketRightSquareBracket, int limit, String after, String before }) async
    test('test listAuditLogs', () async {
      // TODO
    });

  });
}
