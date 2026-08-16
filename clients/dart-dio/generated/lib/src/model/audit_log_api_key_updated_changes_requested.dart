//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_api_key_updated_changes_requested.g.dart';

/// The payload used to update the API key.
///
/// Properties:
/// * [scopes] - A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
@BuiltValue()
abstract class AuditLogApiKeyUpdatedChangesRequested implements Built<AuditLogApiKeyUpdatedChangesRequested, AuditLogApiKeyUpdatedChangesRequestedBuilder> {
  /// A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
  @BuiltValueField(wireName: r'scopes')
  BuiltList<String>? get scopes;

  AuditLogApiKeyUpdatedChangesRequested._();

  factory AuditLogApiKeyUpdatedChangesRequested([void updates(AuditLogApiKeyUpdatedChangesRequestedBuilder b)]) = _$AuditLogApiKeyUpdatedChangesRequested;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogApiKeyUpdatedChangesRequestedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogApiKeyUpdatedChangesRequested> get serializer => _$AuditLogApiKeyUpdatedChangesRequestedSerializer();
}

class _$AuditLogApiKeyUpdatedChangesRequestedSerializer implements PrimitiveSerializer<AuditLogApiKeyUpdatedChangesRequested> {
  @override
  final Iterable<Type> types = const [AuditLogApiKeyUpdatedChangesRequested, _$AuditLogApiKeyUpdatedChangesRequested];

  @override
  final String wireName = r'AuditLogApiKeyUpdatedChangesRequested';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogApiKeyUpdatedChangesRequested object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scopes != null) {
      yield r'scopes';
      yield serializers.serialize(
        object.scopes,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogApiKeyUpdatedChangesRequested object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogApiKeyUpdatedChangesRequestedBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scopes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.scopes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogApiKeyUpdatedChangesRequested deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogApiKeyUpdatedChangesRequestedBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

