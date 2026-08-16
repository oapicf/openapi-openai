//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_rate_limit_updated_changes_requested.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_rate_limit_updated.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The rate limit ID
/// * [changesRequested] 
@BuiltValue()
abstract class AuditLogRateLimitUpdated implements Built<AuditLogRateLimitUpdated, AuditLogRateLimitUpdatedBuilder> {
  /// The rate limit ID
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'changes_requested')
  AuditLogRateLimitUpdatedChangesRequested? get changesRequested;

  AuditLogRateLimitUpdated._();

  factory AuditLogRateLimitUpdated([void updates(AuditLogRateLimitUpdatedBuilder b)]) = _$AuditLogRateLimitUpdated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogRateLimitUpdatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogRateLimitUpdated> get serializer => _$AuditLogRateLimitUpdatedSerializer();
}

class _$AuditLogRateLimitUpdatedSerializer implements PrimitiveSerializer<AuditLogRateLimitUpdated> {
  @override
  final Iterable<Type> types = const [AuditLogRateLimitUpdated, _$AuditLogRateLimitUpdated];

  @override
  final String wireName = r'AuditLogRateLimitUpdated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogRateLimitUpdated object, {
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
        specifiedType: const FullType(AuditLogRateLimitUpdatedChangesRequested),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogRateLimitUpdated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogRateLimitUpdatedBuilder result,
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
            specifiedType: const FullType(AuditLogRateLimitUpdatedChangesRequested),
          ) as AuditLogRateLimitUpdatedChangesRequested;
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
  AuditLogRateLimitUpdated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogRateLimitUpdatedBuilder();
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

