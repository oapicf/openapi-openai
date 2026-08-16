//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_api_key_deleted.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The tracking ID of the API key.
@BuiltValue()
abstract class AuditLogApiKeyDeleted implements Built<AuditLogApiKeyDeleted, AuditLogApiKeyDeletedBuilder> {
  /// The tracking ID of the API key.
  @BuiltValueField(wireName: r'id')
  String? get id;

  AuditLogApiKeyDeleted._();

  factory AuditLogApiKeyDeleted([void updates(AuditLogApiKeyDeletedBuilder b)]) = _$AuditLogApiKeyDeleted;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogApiKeyDeletedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogApiKeyDeleted> get serializer => _$AuditLogApiKeyDeletedSerializer();
}

class _$AuditLogApiKeyDeletedSerializer implements PrimitiveSerializer<AuditLogApiKeyDeleted> {
  @override
  final Iterable<Type> types = const [AuditLogApiKeyDeleted, _$AuditLogApiKeyDeleted];

  @override
  final String wireName = r'AuditLogApiKeyDeleted';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogApiKeyDeleted object, {
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
    AuditLogApiKeyDeleted object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogApiKeyDeletedBuilder result,
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
  AuditLogApiKeyDeleted deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogApiKeyDeletedBuilder();
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

