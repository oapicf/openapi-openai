//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_user_updated_changes_requested.g.dart';

/// The payload used to update the user.
///
/// Properties:
/// * [role] - The role of the user. Is either `owner` or `member`.
@BuiltValue()
abstract class AuditLogUserUpdatedChangesRequested implements Built<AuditLogUserUpdatedChangesRequested, AuditLogUserUpdatedChangesRequestedBuilder> {
  /// The role of the user. Is either `owner` or `member`.
  @BuiltValueField(wireName: r'role')
  String? get role;

  AuditLogUserUpdatedChangesRequested._();

  factory AuditLogUserUpdatedChangesRequested([void updates(AuditLogUserUpdatedChangesRequestedBuilder b)]) = _$AuditLogUserUpdatedChangesRequested;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogUserUpdatedChangesRequestedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogUserUpdatedChangesRequested> get serializer => _$AuditLogUserUpdatedChangesRequestedSerializer();
}

class _$AuditLogUserUpdatedChangesRequestedSerializer implements PrimitiveSerializer<AuditLogUserUpdatedChangesRequested> {
  @override
  final Iterable<Type> types = const [AuditLogUserUpdatedChangesRequested, _$AuditLogUserUpdatedChangesRequested];

  @override
  final String wireName = r'AuditLogUserUpdatedChangesRequested';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogUserUpdatedChangesRequested object, {
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
    AuditLogUserUpdatedChangesRequested object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogUserUpdatedChangesRequestedBuilder result,
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
  AuditLogUserUpdatedChangesRequested deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogUserUpdatedChangesRequestedBuilder();
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

