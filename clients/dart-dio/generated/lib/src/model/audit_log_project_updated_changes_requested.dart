//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_project_updated_changes_requested.g.dart';

/// The payload used to update the project.
///
/// Properties:
/// * [title] - The title of the project as seen on the dashboard.
@BuiltValue()
abstract class AuditLogProjectUpdatedChangesRequested implements Built<AuditLogProjectUpdatedChangesRequested, AuditLogProjectUpdatedChangesRequestedBuilder> {
  /// The title of the project as seen on the dashboard.
  @BuiltValueField(wireName: r'title')
  String? get title;

  AuditLogProjectUpdatedChangesRequested._();

  factory AuditLogProjectUpdatedChangesRequested([void updates(AuditLogProjectUpdatedChangesRequestedBuilder b)]) = _$AuditLogProjectUpdatedChangesRequested;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogProjectUpdatedChangesRequestedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogProjectUpdatedChangesRequested> get serializer => _$AuditLogProjectUpdatedChangesRequestedSerializer();
}

class _$AuditLogProjectUpdatedChangesRequestedSerializer implements PrimitiveSerializer<AuditLogProjectUpdatedChangesRequested> {
  @override
  final Iterable<Type> types = const [AuditLogProjectUpdatedChangesRequested, _$AuditLogProjectUpdatedChangesRequested];

  @override
  final String wireName = r'AuditLogProjectUpdatedChangesRequested';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogProjectUpdatedChangesRequested object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogProjectUpdatedChangesRequested object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogProjectUpdatedChangesRequestedBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogProjectUpdatedChangesRequested deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogProjectUpdatedChangesRequestedBuilder();
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

