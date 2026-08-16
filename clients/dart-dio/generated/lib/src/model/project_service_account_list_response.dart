//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/project_service_account.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_service_account_list_response.g.dart';

/// ProjectServiceAccountListResponse
///
/// Properties:
/// * [object] 
/// * [data] 
/// * [firstId] 
/// * [lastId] 
/// * [hasMore] 
@BuiltValue()
abstract class ProjectServiceAccountListResponse implements Built<ProjectServiceAccountListResponse, ProjectServiceAccountListResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ProjectServiceAccountListResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  @BuiltValueField(wireName: r'data')
  BuiltList<ProjectServiceAccount> get data;

  @BuiltValueField(wireName: r'first_id')
  String get firstId;

  @BuiltValueField(wireName: r'last_id')
  String get lastId;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  ProjectServiceAccountListResponse._();

  factory ProjectServiceAccountListResponse([void updates(ProjectServiceAccountListResponseBuilder b)]) = _$ProjectServiceAccountListResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectServiceAccountListResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectServiceAccountListResponse> get serializer => _$ProjectServiceAccountListResponseSerializer();
}

class _$ProjectServiceAccountListResponseSerializer implements PrimitiveSerializer<ProjectServiceAccountListResponse> {
  @override
  final Iterable<Type> types = const [ProjectServiceAccountListResponse, _$ProjectServiceAccountListResponse];

  @override
  final String wireName = r'ProjectServiceAccountListResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectServiceAccountListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectServiceAccountListResponseObjectEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(ProjectServiceAccount)]),
    );
    yield r'first_id';
    yield serializers.serialize(
      object.firstId,
      specifiedType: const FullType(String),
    );
    yield r'last_id';
    yield serializers.serialize(
      object.lastId,
      specifiedType: const FullType(String),
    );
    yield r'has_more';
    yield serializers.serialize(
      object.hasMore,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectServiceAccountListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectServiceAccountListResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectServiceAccountListResponseObjectEnum),
          ) as ProjectServiceAccountListResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProjectServiceAccount)]),
          ) as BuiltList<ProjectServiceAccount>;
          result.data.replace(valueDes);
          break;
        case r'first_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.firstId = valueDes;
          break;
        case r'last_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.lastId = valueDes;
          break;
        case r'has_more':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasMore = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectServiceAccountListResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectServiceAccountListResponseBuilder();
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

class ProjectServiceAccountListResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ProjectServiceAccountListResponseObjectEnum list = _$projectServiceAccountListResponseObjectEnum_list;

  static Serializer<ProjectServiceAccountListResponseObjectEnum> get serializer => _$projectServiceAccountListResponseObjectEnumSerializer;

  const ProjectServiceAccountListResponseObjectEnum._(String name): super(name);

  static BuiltSet<ProjectServiceAccountListResponseObjectEnum> get values => _$projectServiceAccountListResponseObjectEnumValues;
  static ProjectServiceAccountListResponseObjectEnum valueOf(String name) => _$projectServiceAccountListResponseObjectEnumValueOf(name);
}

