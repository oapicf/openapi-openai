//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_user_added_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_user_added.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The user ID.
/// * [data] 
@BuiltValue()
abstract class AuditLogUserAdded implements Built<AuditLogUserAdded, AuditLogUserAddedBuilder> {
  /// The user ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'data')
  AuditLogUserAddedData? get data;

  AuditLogUserAdded._();

  factory AuditLogUserAdded([void updates(AuditLogUserAddedBuilder b)]) = _$AuditLogUserAdded;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogUserAddedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogUserAdded> get serializer => _$AuditLogUserAddedSerializer();
}

class _$AuditLogUserAddedSerializer implements PrimitiveSerializer<AuditLogUserAdded> {
  @override
  final Iterable<Type> types = const [AuditLogUserAdded, _$AuditLogUserAdded];

  @override
  final String wireName = r'AuditLogUserAdded';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogUserAdded object, {
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
        specifiedType: const FullType(AuditLogUserAddedData),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogUserAdded object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogUserAddedBuilder result,
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
            specifiedType: const FullType(AuditLogUserAddedData),
          ) as AuditLogUserAddedData;
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
  AuditLogUserAdded deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogUserAddedBuilder();
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

