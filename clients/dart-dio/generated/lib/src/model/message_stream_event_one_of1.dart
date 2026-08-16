//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_stream_event_one_of1.g.dart';

/// Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class MessageStreamEventOneOf1 implements Built<MessageStreamEventOneOf1, MessageStreamEventOneOf1Builder> {
  @BuiltValueField(wireName: r'event')
  MessageStreamEventOneOf1EventEnum get event;
  // enum eventEnum {  thread.message.in_progress,  };

  @BuiltValueField(wireName: r'data')
  MessageObject get data;

  MessageStreamEventOneOf1._();

  factory MessageStreamEventOneOf1([void updates(MessageStreamEventOneOf1Builder b)]) = _$MessageStreamEventOneOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageStreamEventOneOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageStreamEventOneOf1> get serializer => _$MessageStreamEventOneOf1Serializer();
}

class _$MessageStreamEventOneOf1Serializer implements PrimitiveSerializer<MessageStreamEventOneOf1> {
  @override
  final Iterable<Type> types = const [MessageStreamEventOneOf1, _$MessageStreamEventOneOf1];

  @override
  final String wireName = r'MessageStreamEventOneOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageStreamEventOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(MessageStreamEventOneOf1EventEnum),
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
    MessageStreamEventOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageStreamEventOneOf1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageStreamEventOneOf1EventEnum),
          ) as MessageStreamEventOneOf1EventEnum;
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
  MessageStreamEventOneOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageStreamEventOneOf1Builder();
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

class MessageStreamEventOneOf1EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.message.in_progress')
  static const MessageStreamEventOneOf1EventEnum threadPeriodMessagePeriodInProgress = _$messageStreamEventOneOf1EventEnum_threadPeriodMessagePeriodInProgress;

  static Serializer<MessageStreamEventOneOf1EventEnum> get serializer => _$messageStreamEventOneOf1EventEnumSerializer;

  const MessageStreamEventOneOf1EventEnum._(String name): super(name);

  static BuiltSet<MessageStreamEventOneOf1EventEnum> get values => _$messageStreamEventOneOf1EventEnumValues;
  static MessageStreamEventOneOf1EventEnum valueOf(String name) => _$messageStreamEventOneOf1EventEnumValueOf(name);
}

