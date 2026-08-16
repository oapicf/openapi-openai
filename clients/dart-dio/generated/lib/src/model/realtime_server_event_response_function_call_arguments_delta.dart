//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_function_call_arguments_delta.g.dart';

/// Returned when the model-generated function call arguments are updated. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.function_call_arguments.delta`. 
/// * [responseId] - The ID of the response.
/// * [itemId] - The ID of the function call item.
/// * [outputIndex] - The index of the output item in the response.
/// * [callId] - The ID of the function call.
/// * [delta] - The arguments delta as a JSON string.
@BuiltValue()
abstract class RealtimeServerEventResponseFunctionCallArgumentsDelta implements Built<RealtimeServerEventResponseFunctionCallArgumentsDelta, RealtimeServerEventResponseFunctionCallArgumentsDeltaBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.function_call_arguments.delta`. 
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum get type;
  // enum typeEnum {  response.function_call_arguments.delta,  };

  /// The ID of the response.
  @BuiltValueField(wireName: r'response_id')
  String get responseId;

  /// The ID of the function call item.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The index of the output item in the response.
  @BuiltValueField(wireName: r'output_index')
  int get outputIndex;

  /// The ID of the function call.
  @BuiltValueField(wireName: r'call_id')
  String get callId;

  /// The arguments delta as a JSON string.
  @BuiltValueField(wireName: r'delta')
  String get delta;

  RealtimeServerEventResponseFunctionCallArgumentsDelta._();

  factory RealtimeServerEventResponseFunctionCallArgumentsDelta([void updates(RealtimeServerEventResponseFunctionCallArgumentsDeltaBuilder b)]) = _$RealtimeServerEventResponseFunctionCallArgumentsDelta;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseFunctionCallArgumentsDeltaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseFunctionCallArgumentsDelta> get serializer => _$RealtimeServerEventResponseFunctionCallArgumentsDeltaSerializer();
}

class _$RealtimeServerEventResponseFunctionCallArgumentsDeltaSerializer implements PrimitiveSerializer<RealtimeServerEventResponseFunctionCallArgumentsDelta> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseFunctionCallArgumentsDelta, _$RealtimeServerEventResponseFunctionCallArgumentsDelta];

  @override
  final String wireName = r'RealtimeServerEventResponseFunctionCallArgumentsDelta';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseFunctionCallArgumentsDelta object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event_id';
    yield serializers.serialize(
      object.eventId,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum),
    );
    yield r'response_id';
    yield serializers.serialize(
      object.responseId,
      specifiedType: const FullType(String),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'output_index';
    yield serializers.serialize(
      object.outputIndex,
      specifiedType: const FullType(int),
    );
    yield r'call_id';
    yield serializers.serialize(
      object.callId,
      specifiedType: const FullType(String),
    );
    yield r'delta';
    yield serializers.serialize(
      object.delta,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventResponseFunctionCallArgumentsDelta object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseFunctionCallArgumentsDeltaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.eventId = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum),
          ) as RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum;
          result.type = valueDes;
          break;
        case r'response_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.responseId = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'output_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.outputIndex = valueDes;
          break;
        case r'call_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.callId = valueDes;
          break;
        case r'delta':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.delta = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventResponseFunctionCallArgumentsDelta deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseFunctionCallArgumentsDeltaBuilder();
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

class RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum extends EnumClass {

  /// The event type, must be `response.function_call_arguments.delta`. 
  @BuiltValueEnumConst(wireName: r'response.function_call_arguments.delta')
  static const RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum responsePeriodFunctionCallArgumentsPeriodDelta = _$realtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum_responsePeriodFunctionCallArgumentsPeriodDelta;

  static Serializer<RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum> get serializer => _$realtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumSerializer;

  const RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum> get values => _$realtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumValues;
  static RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum valueOf(String name) => _$realtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumValueOf(name);
}

