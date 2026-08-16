//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_service_account_delete_response.g.dart';

/// ProjectServiceAccountDeleteResponse
///
/// Properties:
/// * [object] 
/// * [id] 
/// * [deleted] 
@BuiltValue()
abstract class ProjectServiceAccountDeleteResponse implements Built<ProjectServiceAccountDeleteResponse, ProjectServiceAccountDeleteResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ProjectServiceAccountDeleteResponseObjectEnum get object;
  // enum objectEnum {  organization.project.service_account.deleted,  };

  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  ProjectServiceAccountDeleteResponse._();

  factory ProjectServiceAccountDeleteResponse([void updates(ProjectServiceAccountDeleteResponseBuilder b)]) = _$ProjectServiceAccountDeleteResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectServiceAccountDeleteResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectServiceAccountDeleteResponse> get serializer => _$ProjectServiceAccountDeleteResponseSerializer();
}

class _$ProjectServiceAccountDeleteResponseSerializer implements PrimitiveSerializer<ProjectServiceAccountDeleteResponse> {
  @override
  final Iterable<Type> types = const [ProjectServiceAccountDeleteResponse, _$ProjectServiceAccountDeleteResponse];

  @override
  final String wireName = r'ProjectServiceAccountDeleteResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectServiceAccountDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectServiceAccountDeleteResponseObjectEnum),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'deleted';
    yield serializers.serialize(
      object.deleted,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectServiceAccountDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectServiceAccountDeleteResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectServiceAccountDeleteResponseObjectEnum),
          ) as ProjectServiceAccountDeleteResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.deleted = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectServiceAccountDeleteResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectServiceAccountDeleteResponseBuilder();
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

class ProjectServiceAccountDeleteResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.project.service_account.deleted')
  static const ProjectServiceAccountDeleteResponseObjectEnum organizationPeriodProjectPeriodServiceAccountPeriodDeleted = _$projectServiceAccountDeleteResponseObjectEnum_organizationPeriodProjectPeriodServiceAccountPeriodDeleted;

  static Serializer<ProjectServiceAccountDeleteResponseObjectEnum> get serializer => _$projectServiceAccountDeleteResponseObjectEnumSerializer;

  const ProjectServiceAccountDeleteResponseObjectEnum._(String name): super(name);

  static BuiltSet<ProjectServiceAccountDeleteResponseObjectEnum> get values => _$projectServiceAccountDeleteResponseObjectEnumValues;
  static ProjectServiceAccountDeleteResponseObjectEnum valueOf(String name) => _$projectServiceAccountDeleteResponseObjectEnumValueOf(name);
}

