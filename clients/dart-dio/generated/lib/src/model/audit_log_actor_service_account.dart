//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_actor_service_account.g.dart';

/// The service account that performed the audit logged action.
///
/// Properties:
/// * [id] - The service account id.
@BuiltValue()
abstract class AuditLogActorServiceAccount implements Built<AuditLogActorServiceAccount, AuditLogActorServiceAccountBuilder> {
  /// The service account id.
  @BuiltValueField(wireName: r'id')
  String? get id;

  AuditLogActorServiceAccount._();

  factory AuditLogActorServiceAccount([void updates(AuditLogActorServiceAccountBuilder b)]) = _$AuditLogActorServiceAccount;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogActorServiceAccountBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogActorServiceAccount> get serializer => _$AuditLogActorServiceAccountSerializer();
}

class _$AuditLogActorServiceAccountSerializer implements PrimitiveSerializer<AuditLogActorServiceAccount> {
  @override
  final Iterable<Type> types = const [AuditLogActorServiceAccount, _$AuditLogActorServiceAccount];

  @override
  final String wireName = r'AuditLogActorServiceAccount';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogActorServiceAccount object, {
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
    AuditLogActorServiceAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogActorServiceAccountBuilder result,
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
  AuditLogActorServiceAccount deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogActorServiceAccountBuilder();
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

