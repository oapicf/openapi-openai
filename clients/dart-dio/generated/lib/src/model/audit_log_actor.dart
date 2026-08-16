//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_actor_session.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audit_log_actor_api_key.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_actor.g.dart';

/// The actor who performed the audit logged action.
///
/// Properties:
/// * [type] - The type of actor. Is either `session` or `api_key`.
/// * [session] 
/// * [apiKey] 
@BuiltValue()
abstract class AuditLogActor implements Built<AuditLogActor, AuditLogActorBuilder> {
  /// The type of actor. Is either `session` or `api_key`.
  @BuiltValueField(wireName: r'type')
  AuditLogActorTypeEnum? get type;
  // enum typeEnum {  session,  api_key,  };

  @BuiltValueField(wireName: r'session')
  AuditLogActorSession? get session;

  @BuiltValueField(wireName: r'api_key')
  AuditLogActorApiKey? get apiKey;

  AuditLogActor._();

  factory AuditLogActor([void updates(AuditLogActorBuilder b)]) = _$AuditLogActor;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogActorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogActor> get serializer => _$AuditLogActorSerializer();
}

class _$AuditLogActorSerializer implements PrimitiveSerializer<AuditLogActor> {
  @override
  final Iterable<Type> types = const [AuditLogActor, _$AuditLogActor];

  @override
  final String wireName = r'AuditLogActor';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogActor object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(AuditLogActorTypeEnum),
      );
    }
    if (object.session != null) {
      yield r'session';
      yield serializers.serialize(
        object.session,
        specifiedType: const FullType(AuditLogActorSession),
      );
    }
    if (object.apiKey != null) {
      yield r'api_key';
      yield serializers.serialize(
        object.apiKey,
        specifiedType: const FullType(AuditLogActorApiKey),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogActor object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogActorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogActorTypeEnum),
          ) as AuditLogActorTypeEnum;
          result.type = valueDes;
          break;
        case r'session':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogActorSession),
          ) as AuditLogActorSession;
          result.session = valueDes;
          break;
        case r'api_key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogActorApiKey),
          ) as AuditLogActorApiKey;
          result.apiKey = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogActor deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogActorBuilder();
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

class AuditLogActorTypeEnum extends EnumClass {

  /// The type of actor. Is either `session` or `api_key`.
  @BuiltValueEnumConst(wireName: r'session')
  static const AuditLogActorTypeEnum session = _$auditLogActorTypeEnum_session;
  /// The type of actor. Is either `session` or `api_key`.
  @BuiltValueEnumConst(wireName: r'api_key')
  static const AuditLogActorTypeEnum apiKey = _$auditLogActorTypeEnum_apiKey;

  static Serializer<AuditLogActorTypeEnum> get serializer => _$auditLogActorTypeEnumSerializer;

  const AuditLogActorTypeEnum._(String name): super(name);

  static BuiltSet<AuditLogActorTypeEnum> get values => _$auditLogActorTypeEnumValues;
  static AuditLogActorTypeEnum valueOf(String name) => _$auditLogActorTypeEnumValueOf(name);
}

