//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_api_key_created_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_api_key_created.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The tracking ID of the API key.
/// * [data] 
@BuiltValue()
abstract class AuditLogApiKeyCreated implements Built<AuditLogApiKeyCreated, AuditLogApiKeyCreatedBuilder> {
  /// The tracking ID of the API key.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'data')
  AuditLogApiKeyCreatedData? get data;

  AuditLogApiKeyCreated._();

  factory AuditLogApiKeyCreated([void updates(AuditLogApiKeyCreatedBuilder b)]) = _$AuditLogApiKeyCreated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogApiKeyCreatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogApiKeyCreated> get serializer => _$AuditLogApiKeyCreatedSerializer();
}

class _$AuditLogApiKeyCreatedSerializer implements PrimitiveSerializer<AuditLogApiKeyCreated> {
  @override
  final Iterable<Type> types = const [AuditLogApiKeyCreated, _$AuditLogApiKeyCreated];

  @override
  final String wireName = r'AuditLogApiKeyCreated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogApiKeyCreated object, {
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
        specifiedType: const FullType(AuditLogApiKeyCreatedData),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogApiKeyCreated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogApiKeyCreatedBuilder result,
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
            specifiedType: const FullType(AuditLogApiKeyCreatedData),
          ) as AuditLogApiKeyCreatedData;
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
  AuditLogApiKeyCreated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogApiKeyCreatedBuilder();
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

