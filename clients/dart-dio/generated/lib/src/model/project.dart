//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project.g.dart';

/// Represents an individual project.
///
/// Properties:
/// * [id] - The identifier, which can be referenced in API endpoints
/// * [object] - The object type, which is always `organization.project`
/// * [name] - The name of the project. This appears in reporting.
/// * [createdAt] - The Unix timestamp (in seconds) of when the project was created.
/// * [archivedAt] - The Unix timestamp (in seconds) of when the project was archived or `null`.
/// * [status] - `active` or `archived`
@BuiltValue()
abstract class Project implements Built<Project, ProjectBuilder> {
  /// The identifier, which can be referenced in API endpoints
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `organization.project`
  @BuiltValueField(wireName: r'object')
  ProjectObjectEnum get object;
  // enum objectEnum {  organization.project,  };

  /// The name of the project. This appears in reporting.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The Unix timestamp (in seconds) of when the project was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The Unix timestamp (in seconds) of when the project was archived or `null`.
  @BuiltValueField(wireName: r'archived_at')
  int? get archivedAt;

  /// `active` or `archived`
  @BuiltValueField(wireName: r'status')
  ProjectStatusEnum get status;
  // enum statusEnum {  active,  archived,  };

  Project._();

  factory Project([void updates(ProjectBuilder b)]) = _$Project;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Project> get serializer => _$ProjectSerializer();
}

class _$ProjectSerializer implements PrimitiveSerializer<Project> {
  @override
  final Iterable<Type> types = const [Project, _$Project];

  @override
  final String wireName = r'Project';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Project object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectObjectEnum),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    if (object.archivedAt != null) {
      yield r'archived_at';
      yield serializers.serialize(
        object.archivedAt,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(ProjectStatusEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    Project object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectBuilder result,
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
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectObjectEnum),
          ) as ProjectObjectEnum;
          result.object = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'archived_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.archivedAt = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectStatusEnum),
          ) as ProjectStatusEnum;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Project deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectBuilder();
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

class ProjectObjectEnum extends EnumClass {

  /// The object type, which is always `organization.project`
  @BuiltValueEnumConst(wireName: r'organization.project')
  static const ProjectObjectEnum organizationPeriodProject = _$projectObjectEnum_organizationPeriodProject;

  static Serializer<ProjectObjectEnum> get serializer => _$projectObjectEnumSerializer;

  const ProjectObjectEnum._(String name): super(name);

  static BuiltSet<ProjectObjectEnum> get values => _$projectObjectEnumValues;
  static ProjectObjectEnum valueOf(String name) => _$projectObjectEnumValueOf(name);
}

class ProjectStatusEnum extends EnumClass {

  /// `active` or `archived`
  @BuiltValueEnumConst(wireName: r'active')
  static const ProjectStatusEnum active = _$projectStatusEnum_active;
  /// `active` or `archived`
  @BuiltValueEnumConst(wireName: r'archived')
  static const ProjectStatusEnum archived = _$projectStatusEnum_archived;

  static Serializer<ProjectStatusEnum> get serializer => _$projectStatusEnumSerializer;

  const ProjectStatusEnum._(String name): super(name);

  static BuiltSet<ProjectStatusEnum> get values => _$projectStatusEnumValues;
  static ProjectStatusEnum valueOf(String name) => _$projectStatusEnumValueOf(name);
}

