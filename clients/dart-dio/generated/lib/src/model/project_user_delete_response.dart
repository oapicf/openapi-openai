//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_user_delete_response.g.dart';

/// ProjectUserDeleteResponse
///
/// Properties:
/// * [object] 
/// * [id] 
/// * [deleted] 
@BuiltValue()
abstract class ProjectUserDeleteResponse implements Built<ProjectUserDeleteResponse, ProjectUserDeleteResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ProjectUserDeleteResponseObjectEnum get object;
  // enum objectEnum {  organization.project.user.deleted,  };

  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  ProjectUserDeleteResponse._();

  factory ProjectUserDeleteResponse([void updates(ProjectUserDeleteResponseBuilder b)]) = _$ProjectUserDeleteResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectUserDeleteResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectUserDeleteResponse> get serializer => _$ProjectUserDeleteResponseSerializer();
}

class _$ProjectUserDeleteResponseSerializer implements PrimitiveSerializer<ProjectUserDeleteResponse> {
  @override
  final Iterable<Type> types = const [ProjectUserDeleteResponse, _$ProjectUserDeleteResponse];

  @override
  final String wireName = r'ProjectUserDeleteResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectUserDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectUserDeleteResponseObjectEnum),
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
    ProjectUserDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectUserDeleteResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectUserDeleteResponseObjectEnum),
          ) as ProjectUserDeleteResponseObjectEnum;
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
  ProjectUserDeleteResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectUserDeleteResponseBuilder();
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

class ProjectUserDeleteResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.project.user.deleted')
  static const ProjectUserDeleteResponseObjectEnum organizationPeriodProjectPeriodUserPeriodDeleted = _$projectUserDeleteResponseObjectEnum_organizationPeriodProjectPeriodUserPeriodDeleted;

  static Serializer<ProjectUserDeleteResponseObjectEnum> get serializer => _$projectUserDeleteResponseObjectEnumSerializer;

  const ProjectUserDeleteResponseObjectEnum._(String name): super(name);

  static BuiltSet<ProjectUserDeleteResponseObjectEnum> get values => _$projectUserDeleteResponseObjectEnumValues;
  static ProjectUserDeleteResponseObjectEnum valueOf(String name) => _$projectUserDeleteResponseObjectEnumValueOf(name);
}

