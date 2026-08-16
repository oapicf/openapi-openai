//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_service_account_created_data.g.dart';

/// The payload used to create the service account.
///
/// Properties:
/// * [role] - The role of the service account. Is either `owner` or `member`.
@BuiltValue()
abstract class AuditLogServiceAccountCreatedData implements Built<AuditLogServiceAccountCreatedData, AuditLogServiceAccountCreatedDataBuilder> {
  /// The role of the service account. Is either `owner` or `member`.
  @BuiltValueField(wireName: r'role')
  String? get role;

  AuditLogServiceAccountCreatedData._();

  factory AuditLogServiceAccountCreatedData([void updates(AuditLogServiceAccountCreatedDataBuilder b)]) = _$AuditLogServiceAccountCreatedData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogServiceAccountCreatedDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogServiceAccountCreatedData> get serializer => _$AuditLogServiceAccountCreatedDataSerializer();
}

class _$AuditLogServiceAccountCreatedDataSerializer implements PrimitiveSerializer<AuditLogServiceAccountCreatedData> {
  @override
  final Iterable<Type> types = const [AuditLogServiceAccountCreatedData, _$AuditLogServiceAccountCreatedData];

  @override
  final String wireName = r'AuditLogServiceAccountCreatedData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogServiceAccountCreatedData object, {
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
    AuditLogServiceAccountCreatedData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogServiceAccountCreatedDataBuilder result,
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
  AuditLogServiceAccountCreatedData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogServiceAccountCreatedDataBuilder();
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

