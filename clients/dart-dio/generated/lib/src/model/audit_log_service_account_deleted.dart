//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_service_account_deleted.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The service account ID.
@BuiltValue()
abstract class AuditLogServiceAccountDeleted implements Built<AuditLogServiceAccountDeleted, AuditLogServiceAccountDeletedBuilder> {
  /// The service account ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  AuditLogServiceAccountDeleted._();

  factory AuditLogServiceAccountDeleted([void updates(AuditLogServiceAccountDeletedBuilder b)]) = _$AuditLogServiceAccountDeleted;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogServiceAccountDeletedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogServiceAccountDeleted> get serializer => _$AuditLogServiceAccountDeletedSerializer();
}

class _$AuditLogServiceAccountDeletedSerializer implements PrimitiveSerializer<AuditLogServiceAccountDeleted> {
  @override
  final Iterable<Type> types = const [AuditLogServiceAccountDeleted, _$AuditLogServiceAccountDeleted];

  @override
  final String wireName = r'AuditLogServiceAccountDeleted';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogServiceAccountDeleted object, {
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
    AuditLogServiceAccountDeleted object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogServiceAccountDeletedBuilder result,
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
  AuditLogServiceAccountDeleted deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogServiceAccountDeletedBuilder();
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

