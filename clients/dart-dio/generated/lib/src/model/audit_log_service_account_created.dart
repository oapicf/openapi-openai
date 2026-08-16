//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_service_account_created_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_service_account_created.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The service account ID.
/// * [data] 
@BuiltValue()
abstract class AuditLogServiceAccountCreated implements Built<AuditLogServiceAccountCreated, AuditLogServiceAccountCreatedBuilder> {
  /// The service account ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'data')
  AuditLogServiceAccountCreatedData? get data;

  AuditLogServiceAccountCreated._();

  factory AuditLogServiceAccountCreated([void updates(AuditLogServiceAccountCreatedBuilder b)]) = _$AuditLogServiceAccountCreated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogServiceAccountCreatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogServiceAccountCreated> get serializer => _$AuditLogServiceAccountCreatedSerializer();
}

class _$AuditLogServiceAccountCreatedSerializer implements PrimitiveSerializer<AuditLogServiceAccountCreated> {
  @override
  final Iterable<Type> types = const [AuditLogServiceAccountCreated, _$AuditLogServiceAccountCreated];

  @override
  final String wireName = r'AuditLogServiceAccountCreated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogServiceAccountCreated object, {
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
        specifiedType: const FullType(AuditLogServiceAccountCreatedData),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogServiceAccountCreated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogServiceAccountCreatedBuilder result,
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
            specifiedType: const FullType(AuditLogServiceAccountCreatedData),
          ) as AuditLogServiceAccountCreatedData;
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
  AuditLogServiceAccountCreated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogServiceAccountCreatedBuilder();
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

