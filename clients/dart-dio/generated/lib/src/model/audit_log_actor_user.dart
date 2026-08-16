//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_actor_user.g.dart';

/// The user who performed the audit logged action.
///
/// Properties:
/// * [id] - The user id.
/// * [email] - The user email.
@BuiltValue()
abstract class AuditLogActorUser implements Built<AuditLogActorUser, AuditLogActorUserBuilder> {
  /// The user id.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The user email.
  @BuiltValueField(wireName: r'email')
  String? get email;

  AuditLogActorUser._();

  factory AuditLogActorUser([void updates(AuditLogActorUserBuilder b)]) = _$AuditLogActorUser;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogActorUserBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogActorUser> get serializer => _$AuditLogActorUserSerializer();
}

class _$AuditLogActorUserSerializer implements PrimitiveSerializer<AuditLogActorUser> {
  @override
  final Iterable<Type> types = const [AuditLogActorUser, _$AuditLogActorUser];

  @override
  final String wireName = r'AuditLogActorUser';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogActorUser object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.email != null) {
      yield r'email';
      yield serializers.serialize(
        object.email,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogActorUser object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogActorUserBuilder result,
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
        case r'email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.email = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogActorUser deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogActorUserBuilder();
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

