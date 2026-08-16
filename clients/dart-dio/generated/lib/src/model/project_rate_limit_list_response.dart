//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/project_rate_limit.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_rate_limit_list_response.g.dart';

/// ProjectRateLimitListResponse
///
/// Properties:
/// * [object] 
/// * [data] 
/// * [firstId] 
/// * [lastId] 
/// * [hasMore] 
@BuiltValue()
abstract class ProjectRateLimitListResponse implements Built<ProjectRateLimitListResponse, ProjectRateLimitListResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  ProjectRateLimitListResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  @BuiltValueField(wireName: r'data')
  BuiltList<ProjectRateLimit> get data;

  @BuiltValueField(wireName: r'first_id')
  String get firstId;

  @BuiltValueField(wireName: r'last_id')
  String get lastId;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  ProjectRateLimitListResponse._();

  factory ProjectRateLimitListResponse([void updates(ProjectRateLimitListResponseBuilder b)]) = _$ProjectRateLimitListResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectRateLimitListResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectRateLimitListResponse> get serializer => _$ProjectRateLimitListResponseSerializer();
}

class _$ProjectRateLimitListResponseSerializer implements PrimitiveSerializer<ProjectRateLimitListResponse> {
  @override
  final Iterable<Type> types = const [ProjectRateLimitListResponse, _$ProjectRateLimitListResponse];

  @override
  final String wireName = r'ProjectRateLimitListResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectRateLimitListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectRateLimitListResponseObjectEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(ProjectRateLimit)]),
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
    ProjectRateLimitListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectRateLimitListResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectRateLimitListResponseObjectEnum),
          ) as ProjectRateLimitListResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProjectRateLimit)]),
          ) as BuiltList<ProjectRateLimit>;
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
  ProjectRateLimitListResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectRateLimitListResponseBuilder();
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

class ProjectRateLimitListResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ProjectRateLimitListResponseObjectEnum list = _$projectRateLimitListResponseObjectEnum_list;

  static Serializer<ProjectRateLimitListResponseObjectEnum> get serializer => _$projectRateLimitListResponseObjectEnumSerializer;

  const ProjectRateLimitListResponseObjectEnum._(String name): super(name);

  static BuiltSet<ProjectRateLimitListResponseObjectEnum> get values => _$projectRateLimitListResponseObjectEnumValues;
  static ProjectRateLimitListResponseObjectEnum valueOf(String name) => _$projectRateLimitListResponseObjectEnumValueOf(name);
}

