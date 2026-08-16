//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audit_log_project.g.dart';

/// The project that the action was scoped to. Absent for actions not scoped to projects.
///
/// Properties:
/// * [id] - The project ID.
/// * [name] - The project title.
@BuiltValue()
abstract class AuditLogProject implements Built<AuditLogProject, AuditLogProjectBuilder> {
  /// The project ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The project title.
  @BuiltValueField(wireName: r'name')
  String? get name;

  AuditLogProject._();

  factory AuditLogProject([void updates(AuditLogProjectBuilder b)]) = _$AuditLogProject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AuditLogProjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AuditLogProject> get serializer => _$AuditLogProjectSerializer();
}

class _$AuditLogProjectSerializer implements PrimitiveSerializer<AuditLogProject> {
  @override
  final Iterable<Type> types = const [AuditLogProject, _$AuditLogProject];

  @override
  final String wireName = r'AuditLogProject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AuditLogProject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
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
  }

  @override
  Object serialize(
    Serializers serializers,
    AuditLogProject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AuditLogProjectBuilder result,
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
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AuditLogProject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AuditLogProjectBuilder();
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

