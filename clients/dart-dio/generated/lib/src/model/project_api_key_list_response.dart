//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/project_api_key.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_api_key_list_response.g.dart';

/// ProjectApiKeyListResponse
///
/// Properties:
/// * [object] 
/// * [data] 
/// * [firstId] 
/// * [lastId] 
/// * [hasMore] 
@BuiltValue()
abstract class ProjectApiKeyListResponse implements Built<ProjectApiKeyListResponse, ProjectApiKeyListResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ProjectApiKeyListResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  @BuiltValueField(wireName: r'data')
  BuiltList<ProjectApiKey> get data;

  @BuiltValueField(wireName: r'first_id')
  String get firstId;

  @BuiltValueField(wireName: r'last_id')
  String get lastId;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  ProjectApiKeyListResponse._();

  factory ProjectApiKeyListResponse([void updates(ProjectApiKeyListResponseBuilder b)]) = _$ProjectApiKeyListResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectApiKeyListResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectApiKeyListResponse> get serializer => _$ProjectApiKeyListResponseSerializer();
}

class _$ProjectApiKeyListResponseSerializer implements PrimitiveSerializer<ProjectApiKeyListResponse> {
  @override
  final Iterable<Type> types = const [ProjectApiKeyListResponse, _$ProjectApiKeyListResponse];

  @override
  final String wireName = r'ProjectApiKeyListResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectApiKeyListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectApiKeyListResponseObjectEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(ProjectApiKey)]),
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
    ProjectApiKeyListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectApiKeyListResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectApiKeyListResponseObjectEnum),
          ) as ProjectApiKeyListResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProjectApiKey)]),
          ) as BuiltList<ProjectApiKey>;
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
  ProjectApiKeyListResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectApiKeyListResponseBuilder();
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

class ProjectApiKeyListResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ProjectApiKeyListResponseObjectEnum list = _$projectApiKeyListResponseObjectEnum_list;

  static Serializer<ProjectApiKeyListResponseObjectEnum> get serializer => _$projectApiKeyListResponseObjectEnumSerializer;

  const ProjectApiKeyListResponseObjectEnum._(String name): super(name);

  static BuiltSet<ProjectApiKeyListResponseObjectEnum> get values => _$projectApiKeyListResponseObjectEnumValues;
  static ProjectApiKeyListResponseObjectEnum valueOf(String name) => _$projectApiKeyListResponseObjectEnumValueOf(name);
}

