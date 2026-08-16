//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_organization_updated_changes_requested_settings.g.dart';

/// AuditLogOrganizationUpdatedChangesRequestedSettings
///
/// Properties:
/// * [threadsUiVisibility] - Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
/// * [usageDashboardVisibility] - Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
@BuiltValue()
abstract class AuditLogOrganizationUpdatedChangesRequestedSettings implements Built<AuditLogOrganizationUpdatedChangesRequestedSettings, AuditLogOrganizationUpdatedChangesRequestedSettingsBuilder> {
  /// Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
  @BuiltValueField(wireName: r'threads_ui_visibility')
  String? get threadsUiVisibility;

  /// Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
  @BuiltValueField(wireName: r'usage_dashboard_visibility')
  String? get usageDashboardVisibility;

  AuditLogOrganizationUpdatedChangesRequestedSettings._();

  factory AuditLogOrganizationUpdatedChangesRequestedSettings([void updates(AuditLogOrganizationUpdatedChangesRequestedSettingsBuilder b)]) = _$AuditLogOrganizationUpdatedChangesRequestedSettings;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogOrganizationUpdatedChangesRequestedSettingsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogOrganizationUpdatedChangesRequestedSettings> get serializer => _$AuditLogOrganizationUpdatedChangesRequestedSettingsSerializer();
}

class _$AuditLogOrganizationUpdatedChangesRequestedSettingsSerializer implements PrimitiveSerializer<AuditLogOrganizationUpdatedChangesRequestedSettings> {
  @override
  final Iterable<Type> types = const [AuditLogOrganizationUpdatedChangesRequestedSettings, _$AuditLogOrganizationUpdatedChangesRequestedSettings];

  @override
  final String wireName = r'AuditLogOrganizationUpdatedChangesRequestedSettings';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogOrganizationUpdatedChangesRequestedSettings object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.threadsUiVisibility != null) {
      yield r'threads_ui_visibility';
      yield serializers.serialize(
        object.threadsUiVisibility,
        specifiedType: const FullType(String),
      );
    }
    if (object.usageDashboardVisibility != null) {
      yield r'usage_dashboard_visibility';
      yield serializers.serialize(
        object.usageDashboardVisibility,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogOrganizationUpdatedChangesRequestedSettings object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogOrganizationUpdatedChangesRequestedSettingsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'threads_ui_visibility':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.threadsUiVisibility = valueDes;
          break;
        case r'usage_dashboard_visibility':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.usageDashboardVisibility = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogOrganizationUpdatedChangesRequestedSettings deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogOrganizationUpdatedChangesRequestedSettingsBuilder();
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

