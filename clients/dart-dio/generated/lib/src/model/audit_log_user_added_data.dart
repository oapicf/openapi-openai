//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_user_added_data.g.dart';

/// The payload used to add the user to the project.
///
/// Properties:
/// * [role] - The role of the user. Is either `owner` or `member`.
@BuiltValue()
abstract class AuditLogUserAddedData implements Built<AuditLogUserAddedData, AuditLogUserAddedDataBuilder> {
  /// The role of the user. Is either `owner` or `member`.
  @BuiltValueField(wireName: r'role')
  String? get role;

  AuditLogUserAddedData._();

  factory AuditLogUserAddedData([void updates(AuditLogUserAddedDataBuilder b)]) = _$AuditLogUserAddedData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogUserAddedDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogUserAddedData> get serializer => _$AuditLogUserAddedDataSerializer();
}

class _$AuditLogUserAddedDataSerializer implements PrimitiveSerializer<AuditLogUserAddedData> {
  @override
  final Iterable<Type> types = const [AuditLogUserAddedData, _$AuditLogUserAddedData];

  @override
  final String wireName = r'AuditLogUserAddedData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogUserAddedData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    AuditLogUserAddedData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogUserAddedDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  AuditLogUserAddedData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogUserAddedDataBuilder();
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

