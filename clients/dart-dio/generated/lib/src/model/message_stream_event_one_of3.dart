//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_stream_event_one_of3.g.dart';

/// Occurs when a [message](/docs/api-reference/messages/object) is completed.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class MessageStreamEventOneOf3 implements Built<MessageStreamEventOneOf3, MessageStreamEventOneOf3Builder> {
  @BuiltValueField(wireName: r'event')
  MessageStreamEventOneOf3EventEnum get event;
  // enum eventEnum {  thread.message.completed,  };

  @BuiltValueField(wireName: r'data')
  MessageObject get data;

  MessageStreamEventOneOf3._();

  factory MessageStreamEventOneOf3([void updates(MessageStreamEventOneOf3Builder b)]) = _$MessageStreamEventOneOf3;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageStreamEventOneOf3Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageStreamEventOneOf3> get serializer => _$MessageStreamEventOneOf3Serializer();
}

class _$MessageStreamEventOneOf3Serializer implements PrimitiveSerializer<MessageStreamEventOneOf3> {
  @override
  final Iterable<Type> types = const [MessageStreamEventOneOf3, _$MessageStreamEventOneOf3];

  @override
  final String wireName = r'MessageStreamEventOneOf3';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageStreamEventOneOf3 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(MessageStreamEventOneOf3EventEnum),
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
    MessageStreamEventOneOf3 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageStreamEventOneOf3Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageStreamEventOneOf3EventEnum),
          ) as MessageStreamEventOneOf3EventEnum;
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
  MessageStreamEventOneOf3 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageStreamEventOneOf3Builder();
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

class MessageStreamEventOneOf3EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.message.completed')
  static const MessageStreamEventOneOf3EventEnum threadPeriodMessagePeriodCompleted = _$messageStreamEventOneOf3EventEnum_threadPeriodMessagePeriodCompleted;

  static Serializer<MessageStreamEventOneOf3EventEnum> get serializer => _$messageStreamEventOneOf3EventEnumSerializer;

  const MessageStreamEventOneOf3EventEnum._(String name): super(name);

  static BuiltSet<MessageStreamEventOneOf3EventEnum> get values => _$messageStreamEventOneOf3EventEnumValues;
  static MessageStreamEventOneOf3EventEnum valueOf(String name) => _$messageStreamEventOneOf3EventEnumValueOf(name);
}

