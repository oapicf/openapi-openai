//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_api_key_updated_changes_requested.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_api_key_updated.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The tracking ID of the API key.
/// * [changesRequested] 
@BuiltValue()
abstract class AuditLogApiKeyUpdated implements Built<AuditLogApiKeyUpdated, AuditLogApiKeyUpdatedBuilder> {
  /// The tracking ID of the API key.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'changes_requested')
  AuditLogApiKeyUpdatedChangesRequested? get changesRequested;

  AuditLogApiKeyUpdated._();

  factory AuditLogApiKeyUpdated([void updates(AuditLogApiKeyUpdatedBuilder b)]) = _$AuditLogApiKeyUpdated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogApiKeyUpdatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogApiKeyUpdated> get serializer => _$AuditLogApiKeyUpdatedSerializer();
}

class _$AuditLogApiKeyUpdatedSerializer implements PrimitiveSerializer<AuditLogApiKeyUpdated> {
  @override
  final Iterable<Type> types = const [AuditLogApiKeyUpdated, _$AuditLogApiKeyUpdated];

  @override
  final String wireName = r'AuditLogApiKeyUpdated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogApiKeyUpdated object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.changesRequested != null) {
      yield r'changes_requested';
      yield serializers.serialize(
        object.changesRequested,
        specifiedType: const FullType(AuditLogApiKeyUpdatedChangesRequested),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogApiKeyUpdated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogApiKeyUpdatedBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'changes_requested':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogApiKeyUpdatedChangesRequested),
          ) as AuditLogApiKeyUpdatedChangesRequested;
          result.changesRequested.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogApiKeyUpdated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogApiKeyUpdatedBuilder();
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

