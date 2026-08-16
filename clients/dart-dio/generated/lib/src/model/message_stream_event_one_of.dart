//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_stream_event_one_of.g.dart';

/// Occurs when a [message](/docs/api-reference/messages/object) is created.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class MessageStreamEventOneOf implements Built<MessageStreamEventOneOf, MessageStreamEventOneOfBuilder> {
  @BuiltValueField(wireName: r'event')
  MessageStreamEventOneOfEventEnum get event;
  // enum eventEnum {  thread.message.created,  };

  @BuiltValueField(wireName: r'data')
  MessageObject get data;

  MessageStreamEventOneOf._();

  factory MessageStreamEventOneOf([void updates(MessageStreamEventOneOfBuilder b)]) = _$MessageStreamEventOneOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageStreamEventOneOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageStreamEventOneOf> get serializer => _$MessageStreamEventOneOfSerializer();
}

class _$MessageStreamEventOneOfSerializer implements PrimitiveSerializer<MessageStreamEventOneOf> {
  @override
  final Iterable<Type> types = const [MessageStreamEventOneOf, _$MessageStreamEventOneOf];

  @override
  final String wireName = r'MessageStreamEventOneOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageStreamEventOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(MessageStreamEventOneOfEventEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(MessageObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageStreamEventOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageStreamEventOneOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageStreamEventOneOfEventEnum),
          ) as MessageStreamEventOneOfEventEnum;
          result.event = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageObject),
          ) as MessageObject;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageStreamEventOneOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageStreamEventOneOfBuilder();
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

class MessageStreamEventOneOfEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.message.created')
  static const MessageStreamEventOneOfEventEnum threadPeriodMessagePeriodCreated = _$messageStreamEventOneOfEventEnum_threadPeriodMessagePeriodCreated;

  static Serializer<MessageStreamEventOneOfEventEnum> get serializer => _$messageStreamEventOneOfEventEnumSerializer;

  const MessageStreamEventOneOfEventEnum._(String name): super(name);

  static BuiltSet<MessageStreamEventOneOfEventEnum> get values => _$messageStreamEventOneOfEventEnumValues;
  static MessageStreamEventOneOfEventEnum valueOf(String name) => _$messageStreamEventOneOfEventEnumValueOf(name);
}

