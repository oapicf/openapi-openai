//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/fine_tuning_job_checkpoint.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_fine_tuning_job_checkpoints_response.g.dart';

/// ListFineTuningJobCheckpointsResponse
///
/// Properties:
/// * [data] 
/// * [object] 
/// * [firstId] 
/// * [lastId] 
/// * [hasMore] 
@BuiltValue()
abstract class ListFineTuningJobCheckpointsResponse implements Built<ListFineTuningJobCheckpointsResponse, ListFineTuningJobCheckpointsResponseBuilder> {
  @BuiltValueField(wireName: r'data')
  BuiltList<FineTuningJobCheckpoint> get data;

  @BuiltValueField(wireName: r'object')
  ListFineTuningJobCheckpointsResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  @BuiltValueField(wireName: r'first_id')
  String? get firstId;

  @BuiltValueField(wireName: r'last_id')
  String? get lastId;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  ListFineTuningJobCheckpointsResponse._();

  factory ListFineTuningJobCheckpointsResponse([void updates(ListFineTuningJobCheckpointsResponseBuilder b)]) = _$ListFineTuningJobCheckpointsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ListFineTuningJobCheckpointsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ListFineTuningJobCheckpointsResponse> get serializer => _$ListFineTuningJobCheckpointsResponseSerializer();
}

class _$ListFineTuningJobCheckpointsResponseSerializer implements PrimitiveSerializer<ListFineTuningJobCheckpointsResponse> {
  @override
  final Iterable<Type> types = const [ListFineTuningJobCheckpointsResponse, _$ListFineTuningJobCheckpointsResponse];

  @override
  final String wireName = r'ListFineTuningJobCheckpointsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ListFineTuningJobCheckpointsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(FineTuningJobCheckpoint)]),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ListFineTuningJobCheckpointsResponseObjectEnum),
    );
    if (object.firstId != null) {
      yield r'first_id';
      yield serializers.serialize(
        object.firstId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.lastId != null) {
      yield r'last_id';
      yield serializers.serialize(
        object.lastId,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'has_more';
    yield serializers.serialize(
      object.hasMore,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ListFineTuningJobCheckpointsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ListFineTuningJobCheckpointsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(FineTuningJobCheckpoint)]),
          ) as BuiltList<FineTuningJobCheckpoint>;
          result.data.replace(valueDes);
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ListFineTuningJobCheckpointsResponseObjectEnum),
          ) as ListFineTuningJobCheckpointsResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'first_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.firstId = valueDes;
          break;
        case r'last_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  ListFineTuningJobCheckpointsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ListFineTuningJobCheckpointsResponseBuilder();
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

class ListFineTuningJobCheckpointsResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ListFineTuningJobCheckpointsResponseObjectEnum list = _$listFineTuningJobCheckpointsResponseObjectEnum_list;

  static Serializer<ListFineTuningJobCheckpointsResponseObjectEnum> get serializer => _$listFineTuningJobCheckpointsResponseObjectEnumSerializer;

  const ListFineTuningJobCheckpointsResponseObjectEnum._(String name): super(name);

  static BuiltSet<ListFineTuningJobCheckpointsResponseObjectEnum> get values => _$listFineTuningJobCheckpointsResponseObjectEnumValues;
  static ListFineTuningJobCheckpointsResponseObjectEnum valueOf(String name) => _$listFineTuningJobCheckpointsResponseObjectEnumValueOf(name);
}

