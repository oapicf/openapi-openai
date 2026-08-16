//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_invite_sent_data.g.dart';

/// The payload used to create the invite.
///
/// Properties:
/// * [email] - The email invited to the organization.
/// * [role] - The role the email was invited to be. Is either `owner` or `member`.
@BuiltValue()
abstract class AuditLogInviteSentData implements Built<AuditLogInviteSentData, AuditLogInviteSentDataBuilder> {
  /// The email invited to the organization.
  @BuiltValueField(wireName: r'email')
  String? get email;

  /// The role the email was invited to be. Is either `owner` or `member`.
  @BuiltValueField(wireName: r'role')
  String? get role;

  AuditLogInviteSentData._();

  factory AuditLogInviteSentData([void updates(AuditLogInviteSentDataBuilder b)]) = _$AuditLogInviteSentData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogInviteSentDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogInviteSentData> get serializer => _$AuditLogInviteSentDataSerializer();
}

class _$AuditLogInviteSentDataSerializer implements PrimitiveSerializer<AuditLogInviteSentData> {
  @override
  final Iterable<Type> types = const [AuditLogInviteSentData, _$AuditLogInviteSentData];

  @override
  final String wireName = r'AuditLogInviteSentData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogInviteSentData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.email != null) {
      yield r'email';
      yield serializers.serialize(
        object.email,
        specifiedType: const FullType(String),
      );
    }
    if (object.role != null) {
      yield r'role';
      yield serializers.serialize(
        object.role,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogInviteSentData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogInviteSentDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.email = valueDes;
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.role = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogInviteSentData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogInviteSentDataBuilder();
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

