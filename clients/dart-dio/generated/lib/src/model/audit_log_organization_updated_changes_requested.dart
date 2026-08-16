//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audit_log_organization_updated_changes_requested_settings.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_organization_updated_changes_requested.g.dart';

/// The payload used to update the organization settings.
///
/// Properties:
/// * [title] - The organization title.
/// * [description] - The organization description.
/// * [name] - The organization name.
/// * [settings] 
@BuiltValue()
abstract class AuditLogOrganizationUpdatedChangesRequested implements Built<AuditLogOrganizationUpdatedChangesRequested, AuditLogOrganizationUpdatedChangesRequestedBuilder> {
  /// The organization title.
  @BuiltValueField(wireName: r'title')
  String? get title;

  /// The organization description.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// The organization name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'settings')
  AuditLogOrganizationUpdatedChangesRequestedSettings? get settings;

  AuditLogOrganizationUpdatedChangesRequested._();

  factory AuditLogOrganizationUpdatedChangesRequested([void updates(AuditLogOrganizationUpdatedChangesRequestedBuilder b)]) = _$AuditLogOrganizationUpdatedChangesRequested;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogOrganizationUpdatedChangesRequestedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogOrganizationUpdatedChangesRequested> get serializer => _$AuditLogOrganizationUpdatedChangesRequestedSerializer();
}

class _$AuditLogOrganizationUpdatedChangesRequestedSerializer implements PrimitiveSerializer<AuditLogOrganizationUpdatedChangesRequested> {
  @override
  final Iterable<Type> types = const [AuditLogOrganizationUpdatedChangesRequested, _$AuditLogOrganizationUpdatedChangesRequested];

  @override
  final String wireName = r'AuditLogOrganizationUpdatedChangesRequested';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogOrganizationUpdatedChangesRequested object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.settings != null) {
      yield r'settings';
      yield serializers.serialize(
        object.settings,
        specifiedType: const FullType(AuditLogOrganizationUpdatedChangesRequestedSettings),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogOrganizationUpdatedChangesRequested object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogOrganizationUpdatedChangesRequestedBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'settings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AuditLogOrganizationUpdatedChangesRequestedSettings),
          ) as AuditLogOrganizationUpdatedChangesRequestedSettings;
          result.settings.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogOrganizationUpdatedChangesRequested deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogOrganizationUpdatedChangesRequestedBuilder();
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

