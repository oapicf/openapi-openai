//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_organization_updated_changes_requested.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_organization_updated.g.dart';

/// The details for events with this `type`.
///
/// Properties:
/// * [id] - The organization ID.
/// * [changesRequested] 
@BuiltValue()
abstract class AuditLogOrganizationUpdated implements Built<AuditLogOrganizationUpdated, AuditLogOrganizationUpdatedBuilder> {
  /// The organization ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'changes_requested')
  AuditLogOrganizationUpdatedChangesRequested? get changesRequested;

  AuditLogOrganizationUpdated._();

  factory AuditLogOrganizationUpdated([void updates(AuditLogOrganizationUpdatedBuilder b)]) = _$AuditLogOrganizationUpdated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogOrganizationUpdatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogOrganizationUpdated> get serializer => _$AuditLogOrganizationUpdatedSerializer();
}

class _$AuditLogOrganizationUpdatedSerializer implements PrimitiveSerializer<AuditLogOrganizationUpdated> {
  @override
  final Iterable<Type> types = const [AuditLogOrganizationUpdated, _$AuditLogOrganizationUpdated];

  @override
  final String wireName = r'AuditLogOrganizationUpdated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogOrganizationUpdated object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.changesRequested != null) {
      yield r'changes_requested';
      yield serializers.serialize(
        object.changesRequested,
        specifiedType: const FullType(AuditLogOrganizationUpdatedChangesRequested),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogOrganizationUpdated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogOrganizationUpdatedBuilder result,
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
        case r'changes_requested':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogOrganizationUpdatedChangesRequested),
          ) as AuditLogOrganizationUpdatedChangesRequested;
          result.changesRequested.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogOrganizationUpdated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogOrganizationUpdatedBuilder();
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

