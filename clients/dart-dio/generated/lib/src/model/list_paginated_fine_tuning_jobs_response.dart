//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/fine_tuning_job.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_paginated_fine_tuning_jobs_response.g.dart';

/// ListPaginatedFineTuningJobsResponse
///
/// Properties:
/// * [data] 
/// * [hasMore] 
/// * [object] 
@BuiltValue()
abstract class ListPaginatedFineTuningJobsResponse implements Built<ListPaginatedFineTuningJobsResponse, ListPaginatedFineTuningJobsResponseBuilder> {
  @BuiltValueField(wireName: r'data')
  BuiltList<FineTuningJob> get data;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  @BuiltValueField(wireName: r'object')
  ListPaginatedFineTuningJobsResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  ListPaginatedFineTuningJobsResponse._();

  factory ListPaginatedFineTuningJobsResponse([void updates(ListPaginatedFineTuningJobsResponseBuilder b)]) = _$ListPaginatedFineTuningJobsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ListPaginatedFineTuningJobsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ListPaginatedFineTuningJobsResponse> get serializer => _$ListPaginatedFineTuningJobsResponseSerializer();
}

class _$ListPaginatedFineTuningJobsResponseSerializer implements PrimitiveSerializer<ListPaginatedFineTuningJobsResponse> {
  @override
  final Iterable<Type> types = const [ListPaginatedFineTuningJobsResponse, _$ListPaginatedFineTuningJobsResponse];

  @override
  final String wireName = r'ListPaginatedFineTuningJobsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ListPaginatedFineTuningJobsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(FineTuningJob)]),
    );
    yield r'has_more';
    yield serializers.serialize(
      object.hasMore,
      specifiedType: const FullType(bool),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ListPaginatedFineTuningJobsResponseObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ListPaginatedFineTuningJobsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ListPaginatedFineTuningJobsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(FineTuningJob)]),
          ) as BuiltList<FineTuningJob>;
          result.data.replace(valueDes);
          break;
        case r'has_more':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasMore = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ListPaginatedFineTuningJobsResponseObjectEnum),
          ) as ListPaginatedFineTuningJobsResponseObjectEnum;
          result.object = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ListPaginatedFineTuningJobsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ListPaginatedFineTuningJobsResponseBuilder();
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

class ListPaginatedFineTuningJobsResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ListPaginatedFineTuningJobsResponseObjectEnum list = _$listPaginatedFineTuningJobsResponseObjectEnum_list;

  static Serializer<ListPaginatedFineTuningJobsResponseObjectEnum> get serializer => _$listPaginatedFineTuningJobsResponseObjectEnumSerializer;

  const ListPaginatedFineTuningJobsResponseObjectEnum._(String name): super(name);

  static BuiltSet<ListPaginatedFineTuningJobsResponseObjectEnum> get values => _$listPaginatedFineTuningJobsResponseObjectEnumValues;
  static ListPaginatedFineTuningJobsResponseObjectEnum valueOf(String name) => _$listPaginatedFineTuningJobsResponseObjectEnumValueOf(name);
}

