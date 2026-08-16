//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_response_create_params.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_response_create.g.dart';

/// This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `response.create`.
/// * [response] 
@BuiltValue()
abstract class RealtimeClientEventResponseCreate implements Built<RealtimeClientEventResponseCreate, RealtimeClientEventResponseCreateBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `response.create`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventResponseCreateTypeEnum get type;
  // enum typeEnum {  response.create,  };

  @BuiltValueField(wireName: r'response')
  RealtimeResponseCreateParams? get response;

  RealtimeClientEventResponseCreate._();

  factory RealtimeClientEventResponseCreate([void updates(RealtimeClientEventResponseCreateBuilder b)]) = _$RealtimeClientEventResponseCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventResponseCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventResponseCreate> get serializer => _$RealtimeClientEventResponseCreateSerializer();
}

class _$RealtimeClientEventResponseCreateSerializer implements PrimitiveSerializer<RealtimeClientEventResponseCreate> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventResponseCreate, _$RealtimeClientEventResponseCreate];

  @override
  final String wireName = r'RealtimeClientEventResponseCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventResponseCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventId != null) {
      yield r'event_id';
      yield serializers.serialize(
        object.eventId,
        specifiedType: const FullType(String),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RealtimeClientEventResponseCreateTypeEnum),
    );
    if (object.response != null) {
      yield r'response';
      yield serializers.serialize(
        object.response,
        specifiedType: const FullType(RealtimeResponseCreateParams),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeClientEventResponseCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventResponseCreateBuilder result,
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
            specifiedType: const FullType(RealtimeClientEventResponseCreateTypeEnum),
          ) as RealtimeClientEventResponseCreateTypeEnum;
          result.type = valueDes;
          break;
        case r'response':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseCreateParams),
          ) as RealtimeResponseCreateParams;
          result.response.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeClientEventResponseCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventResponseCreateBuilder();
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

class RealtimeClientEventResponseCreateTypeEnum extends EnumClass {

  /// The event type, must be `response.create`.
  @BuiltValueEnumConst(wireName: r'response.create')
  static const RealtimeClientEventResponseCreateTypeEnum responsePeriodCreate = _$realtimeClientEventResponseCreateTypeEnum_responsePeriodCreate;

  static Serializer<RealtimeClientEventResponseCreateTypeEnum> get serializer => _$realtimeClientEventResponseCreateTypeEnumSerializer;

  const RealtimeClientEventResponseCreateTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventResponseCreateTypeEnum> get values => _$realtimeClientEventResponseCreateTypeEnumValues;
  static RealtimeClientEventResponseCreateTypeEnum valueOf(String name) => _$realtimeClientEventResponseCreateTypeEnumValueOf(name);
}

