//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_project_created_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_project_created.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The project ID.
/// * [data] 
@BuiltValue()
abstract class AuditLogProjectCreated implements Built<AuditLogProjectCreated, AuditLogProjectCreatedBuilder> {
  /// The project ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'data')
  AuditLogProjectCreatedData? get data;

  AuditLogProjectCreated._();

  factory AuditLogProjectCreated([void updates(AuditLogProjectCreatedBuilder b)]) = _$AuditLogProjectCreated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogProjectCreatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogProjectCreated> get serializer => _$AuditLogProjectCreatedSerializer();
}

class _$AuditLogProjectCreatedSerializer implements PrimitiveSerializer<AuditLogProjectCreated> {
  @override
  final Iterable<Type> types = const [AuditLogProjectCreated, _$AuditLogProjectCreated];

  @override
  final String wireName = r'AuditLogProjectCreated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogProjectCreated object, {
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
        specifiedType: const FullType(AuditLogProjectCreatedData),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogProjectCreated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogProjectCreatedBuilder result,
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
            specifiedType: const FullType(AuditLogProjectCreatedData),
          ) as AuditLogProjectCreatedData;
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
  AuditLogProjectCreated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogProjectCreatedBuilder();
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

