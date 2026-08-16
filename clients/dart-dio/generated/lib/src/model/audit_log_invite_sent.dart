//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_invite_sent_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_invite_sent.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The ID of the invite.
/// * [data] 
@BuiltValue()
abstract class AuditLogInviteSent implements Built<AuditLogInviteSent, AuditLogInviteSentBuilder> {
  /// The ID of the invite.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'data')
  AuditLogInviteSentData? get data;

  AuditLogInviteSent._();

  factory AuditLogInviteSent([void updates(AuditLogInviteSentBuilder b)]) = _$AuditLogInviteSent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogInviteSentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogInviteSent> get serializer => _$AuditLogInviteSentSerializer();
}

class _$AuditLogInviteSentSerializer implements PrimitiveSerializer<AuditLogInviteSent> {
  @override
  final Iterable<Type> types = const [AuditLogInviteSent, _$AuditLogInviteSent];

  @override
  final String wireName = r'AuditLogInviteSent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogInviteSent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(AuditLogInviteSentData),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogInviteSent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogInviteSentBuilder result,
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
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogInviteSentData),
          ) as AuditLogInviteSentData;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogInviteSent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogInviteSentBuilder();
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

