//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_rate_limit_deleted.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The rate limit ID
@BuiltValue()
abstract class AuditLogRateLimitDeleted implements Built<AuditLogRateLimitDeleted, AuditLogRateLimitDeletedBuilder> {
  /// The rate limit ID
  @BuiltValueField(wireName: r'id')
  String? get id;

  AuditLogRateLimitDeleted._();

  factory AuditLogRateLimitDeleted([void updates(AuditLogRateLimitDeletedBuilder b)]) = _$AuditLogRateLimitDeleted;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogRateLimitDeletedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogRateLimitDeleted> get serializer => _$AuditLogRateLimitDeletedSerializer();
}

class _$AuditLogRateLimitDeletedSerializer implements PrimitiveSerializer<AuditLogRateLimitDeleted> {
  @override
  final Iterable<Type> types = const [AuditLogRateLimitDeleted, _$AuditLogRateLimitDeleted];

  @override
  final String wireName = r'AuditLogRateLimitDeleted';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogRateLimitDeleted object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogRateLimitDeleted object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogRateLimitDeletedBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogRateLimitDeleted deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogRateLimitDeletedBuilder();
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

