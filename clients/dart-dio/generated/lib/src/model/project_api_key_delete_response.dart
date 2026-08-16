//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_api_key_delete_response.g.dart';

/// ProjectApiKeyDeleteResponse
///
/// Properties:
/// * [object] 
/// * [id] 
/// * [deleted] 
@BuiltValue()
abstract class ProjectApiKeyDeleteResponse implements Built<ProjectApiKeyDeleteResponse, ProjectApiKeyDeleteResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ProjectApiKeyDeleteResponseObjectEnum get object;
  // enum objectEnum {  organization.project.api_key.deleted,  };

  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  ProjectApiKeyDeleteResponse._();

  factory ProjectApiKeyDeleteResponse([void updates(ProjectApiKeyDeleteResponseBuilder b)]) = _$ProjectApiKeyDeleteResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectApiKeyDeleteResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectApiKeyDeleteResponse> get serializer => _$ProjectApiKeyDeleteResponseSerializer();
}

class _$ProjectApiKeyDeleteResponseSerializer implements PrimitiveSerializer<ProjectApiKeyDeleteResponse> {
  @override
  final Iterable<Type> types = const [ProjectApiKeyDeleteResponse, _$ProjectApiKeyDeleteResponse];

  @override
  final String wireName = r'ProjectApiKeyDeleteResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectApiKeyDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectApiKeyDeleteResponseObjectEnum),
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
    ProjectApiKeyDeleteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectApiKeyDeleteResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectApiKeyDeleteResponseObjectEnum),
          ) as ProjectApiKeyDeleteResponseObjectEnum;
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
  ProjectApiKeyDeleteResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectApiKeyDeleteResponseBuilder();
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

class ProjectApiKeyDeleteResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.project.api_key.deleted')
  static const ProjectApiKeyDeleteResponseObjectEnum organizationPeriodProjectPeriodApiKeyPeriodDeleted = _$projectApiKeyDeleteResponseObjectEnum_organizationPeriodProjectPeriodApiKeyPeriodDeleted;

  static Serializer<ProjectApiKeyDeleteResponseObjectEnum> get serializer => _$projectApiKeyDeleteResponseObjectEnumSerializer;

  const ProjectApiKeyDeleteResponseObjectEnum._(String name): super(name);

  static BuiltSet<ProjectApiKeyDeleteResponseObjectEnum> get values => _$projectApiKeyDeleteResponseObjectEnumValues;
  static ProjectApiKeyDeleteResponseObjectEnum valueOf(String name) => _$projectApiKeyDeleteResponseObjectEnumValueOf(name);
}

