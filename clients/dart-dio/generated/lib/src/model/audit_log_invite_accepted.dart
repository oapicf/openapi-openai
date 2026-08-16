//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_invite_accepted.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The ID of the invite.
@BuiltValue()
abstract class AuditLogInviteAccepted implements Built<AuditLogInviteAccepted, AuditLogInviteAcceptedBuilder> {
  /// The ID of the invite.
  @BuiltValueField(wireName: r'id')
  String? get id;

  AuditLogInviteAccepted._();

  factory AuditLogInviteAccepted([void updates(AuditLogInviteAcceptedBuilder b)]) = _$AuditLogInviteAccepted;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogInviteAcceptedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogInviteAccepted> get serializer => _$AuditLogInviteAcceptedSerializer();
}

class _$AuditLogInviteAcceptedSerializer implements PrimitiveSerializer<AuditLogInviteAccepted> {
  @override
  final Iterable<Type> types = const [AuditLogInviteAccepted, _$AuditLogInviteAccepted];

  @override
  final String wireName = r'AuditLogInviteAccepted';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogInviteAccepted object, {
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
    AuditLogInviteAccepted object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogInviteAcceptedBuilder result,
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
  AuditLogInviteAccepted deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogInviteAcceptedBuilder();
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

