//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/fine_tuning_job_event.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_fine_tuning_job_events_response.g.dart';

/// ListFineTuningJobEventsResponse
///
/// Properties:
/// * [data] 
/// * [object] 
@BuiltValue()
abstract class ListFineTuningJobEventsResponse implements Built<ListFineTuningJobEventsResponse, ListFineTuningJobEventsResponseBuilder> {
  @BuiltValueField(wireName: r'data')
  BuiltList<FineTuningJobEvent> get data;

  @BuiltValueField(wireName: r'object')
  ListFineTuningJobEventsResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  ListFineTuningJobEventsResponse._();

  factory ListFineTuningJobEventsResponse([void updates(ListFineTuningJobEventsResponseBuilder b)]) = _$ListFineTuningJobEventsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ListFineTuningJobEventsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ListFineTuningJobEventsResponse> get serializer => _$ListFineTuningJobEventsResponseSerializer();
}

class _$ListFineTuningJobEventsResponseSerializer implements PrimitiveSerializer<ListFineTuningJobEventsResponse> {
  @override
  final Iterable<Type> types = const [ListFineTuningJobEventsResponse, _$ListFineTuningJobEventsResponse];

  @override
  final String wireName = r'ListFineTuningJobEventsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ListFineTuningJobEventsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(FineTuningJobEvent)]),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ListFineTuningJobEventsResponseObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ListFineTuningJobEventsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ListFineTuningJobEventsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(FineTuningJobEvent)]),
          ) as BuiltList<FineTuningJobEvent>;
          result.data.replace(valueDes);
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ListFineTuningJobEventsResponseObjectEnum),
          ) as ListFineTuningJobEventsResponseObjectEnum;
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
  ListFineTuningJobEventsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ListFineTuningJobEventsResponseBuilder();
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

class ListFineTuningJobEventsResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ListFineTuningJobEventsResponseObjectEnum list = _$listFineTuningJobEventsResponseObjectEnum_list;

  static Serializer<ListFineTuningJobEventsResponseObjectEnum> get serializer => _$listFineTuningJobEventsResponseObjectEnumSerializer;

  const ListFineTuningJobEventsResponseObjectEnum._(String name): super(name);

  static BuiltSet<ListFineTuningJobEventsResponseObjectEnum> get values => _$listFineTuningJobEventsResponseObjectEnumValues;
  static ListFineTuningJobEventsResponseObjectEnum valueOf(String name) => _$listFineTuningJobEventsResponseObjectEnumValueOf(name);
}

