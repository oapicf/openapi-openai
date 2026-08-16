//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_actor_service_account.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audit_log_actor_user.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_actor_api_key.g.dart';

/// The API Key used to perform the audit logged action.
///
/// Properties:
/// * [id] - The tracking id of the API key.
/// * [type] - The type of API key. Can be either `user` or `service_account`.
/// * [user] 
/// * [serviceAccount] 
@BuiltValue()
abstract class AuditLogActorApiKey implements Built<AuditLogActorApiKey, AuditLogActorApiKeyBuilder> {
  /// The tracking id of the API key.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The type of API key. Can be either `user` or `service_account`.
  @BuiltValueField(wireName: r'type')
  AuditLogActorApiKeyTypeEnum? get type;
  // enum typeEnum {  user,  service_account,  };

  @BuiltValueField(wireName: r'user')
  AuditLogActorUser? get user;

  @BuiltValueField(wireName: r'service_account')
  AuditLogActorServiceAccount? get serviceAccount;

  AuditLogActorApiKey._();

  factory AuditLogActorApiKey([void updates(AuditLogActorApiKeyBuilder b)]) = _$AuditLogActorApiKey;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogActorApiKeyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogActorApiKey> get serializer => _$AuditLogActorApiKeySerializer();
}

class _$AuditLogActorApiKeySerializer implements PrimitiveSerializer<AuditLogActorApiKey> {
  @override
  final Iterable<Type> types = const [AuditLogActorApiKey, _$AuditLogActorApiKey];

  @override
  final String wireName = r'AuditLogActorApiKey';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogActorApiKey object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(AuditLogActorApiKeyTypeEnum),
      );
    }
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType(AuditLogActorUser),
      );
    }
    if (object.serviceAccount != null) {
      yield r'service_account';
      yield serializers.serialize(
        object.serviceAccount,
        specifiedType: const FullType(AuditLogActorServiceAccount),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogActorApiKey object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogActorApiKeyBuilder result,
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
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogActorApiKeyTypeEnum),
          ) as AuditLogActorApiKeyTypeEnum;
          result.type = valueDes;
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogActorUser),
          ) as AuditLogActorUser;
          result.user.replace(valueDes);
          break;
        case r'service_account':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogActorServiceAccount),
          ) as AuditLogActorServiceAccount;
          result.serviceAccount.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogActorApiKey deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogActorApiKeyBuilder();
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

class AuditLogActorApiKeyTypeEnum extends EnumClass {

  /// The type of API key. Can be either `user` or `service_account`.
  @BuiltValueEnumConst(wireName: r'user')
  static const AuditLogActorApiKeyTypeEnum user = _$auditLogActorApiKeyTypeEnum_user;
  /// The type of API key. Can be either `user` or `service_account`.
  @BuiltValueEnumConst(wireName: r'service_account')
  static const AuditLogActorApiKeyTypeEnum serviceAccount = _$auditLogActorApiKeyTypeEnum_serviceAccount;

  static Serializer<AuditLogActorApiKeyTypeEnum> get serializer => _$auditLogActorApiKeyTypeEnumSerializer;

  const AuditLogActorApiKeyTypeEnum._(String name): super(name);

  static BuiltSet<AuditLogActorApiKeyTypeEnum> get values => _$auditLogActorApiKeyTypeEnumValues;
  static AuditLogActorApiKeyTypeEnum valueOf(String name) => _$auditLogActorApiKeyTypeEnumValueOf(name);
}

