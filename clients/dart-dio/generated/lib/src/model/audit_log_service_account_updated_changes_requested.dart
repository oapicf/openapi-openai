//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_service_account_updated_changes_requested.g.dart';

/// The payload used to updated the service account.
///
/// Properties:
/// * [role] - The role of the service account. Is either `owner` or `member`.
@BuiltValue()
abstract class AuditLogServiceAccountUpdatedChangesRequested implements Built<AuditLogServiceAccountUpdatedChangesRequested, AuditLogServiceAccountUpdatedChangesRequestedBuilder> {
  /// The role of the service account. Is either `owner` or `member`.
  @BuiltValueField(wireName: r'role')
  String? get role;

  AuditLogServiceAccountUpdatedChangesRequested._();

  factory AuditLogServiceAccountUpdatedChangesRequested([void updates(AuditLogServiceAccountUpdatedChangesRequestedBuilder b)]) = _$AuditLogServiceAccountUpdatedChangesRequested;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogServiceAccountUpdatedChangesRequestedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogServiceAccountUpdatedChangesRequested> get serializer => _$AuditLogServiceAccountUpdatedChangesRequestedSerializer();
}

class _$AuditLogServiceAccountUpdatedChangesRequestedSerializer implements PrimitiveSerializer<AuditLogServiceAccountUpdatedChangesRequested> {
  @override
  final Iterable<Type> types = const [AuditLogServiceAccountUpdatedChangesRequested, _$AuditLogServiceAccountUpdatedChangesRequested];

  @override
  final String wireName = r'AuditLogServiceAccountUpdatedChangesRequested';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogServiceAccountUpdatedChangesRequested object, {
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
    AuditLogServiceAccountUpdatedChangesRequested object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogServiceAccountUpdatedChangesRequestedBuilder result,
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
  AuditLogServiceAccountUpdatedChangesRequested deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogServiceAccountUpdatedChangesRequestedBuilder();
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

