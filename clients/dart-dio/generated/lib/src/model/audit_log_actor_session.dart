//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_actor_user.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_actor_session.g.dart';

/// The session in which the audit logged action was performed.
///
/// Properties:
/// * [user] 
/// * [ipAddress] - The IP address from which the action was performed.
@BuiltValue()
abstract class AuditLogActorSession implements Built<AuditLogActorSession, AuditLogActorSessionBuilder> {
  @BuiltValueField(wireName: r'user')
  AuditLogActorUser? get user;

  /// The IP address from which the action was performed.
  @BuiltValueField(wireName: r'ip_address')
  String? get ipAddress;

  AuditLogActorSession._();

  factory AuditLogActorSession([void updates(AuditLogActorSessionBuilder b)]) = _$AuditLogActorSession;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogActorSessionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogActorSession> get serializer => _$AuditLogActorSessionSerializer();
}

class _$AuditLogActorSessionSerializer implements PrimitiveSerializer<AuditLogActorSession> {
  @override
  final Iterable<Type> types = const [AuditLogActorSession, _$AuditLogActorSession];

  @override
  final String wireName = r'AuditLogActorSession';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogActorSession object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType(AuditLogActorUser),
      );
    }
    if (object.ipAddress != null) {
      yield r'ip_address';
      yield serializers.serialize(
        object.ipAddress,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogActorSession object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogActorSessionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogActorUser),
          ) as AuditLogActorUser;
          result.user.replace(valueDes);
          break;
        case r'ip_address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.ipAddress = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogActorSession deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogActorSessionBuilder();
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

