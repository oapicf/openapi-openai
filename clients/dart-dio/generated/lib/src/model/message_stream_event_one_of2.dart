//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_delta_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_stream_event_one_of2.g.dart';

/// Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class MessageStreamEventOneOf2 implements Built<MessageStreamEventOneOf2, MessageStreamEventOneOf2Builder> {
  @BuiltValueField(wireName: r'event')
  MessageStreamEventOneOf2EventEnum get event;
  // enum eventEnum {  thread.message.delta,  };

  @BuiltValueField(wireName: r'data')
  MessageDeltaObject get data;

  MessageStreamEventOneOf2._();

  factory MessageStreamEventOneOf2([void updates(MessageStreamEventOneOf2Builder b)]) = _$MessageStreamEventOneOf2;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageStreamEventOneOf2Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageStreamEventOneOf2> get serializer => _$MessageStreamEventOneOf2Serializer();
}

class _$MessageStreamEventOneOf2Serializer implements PrimitiveSerializer<MessageStreamEventOneOf2> {
  @override
  final Iterable<Type> types = const [MessageStreamEventOneOf2, _$MessageStreamEventOneOf2];

  @override
  final String wireName = r'MessageStreamEventOneOf2';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageStreamEventOneOf2 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(MessageStreamEventOneOf2EventEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(MessageDeltaObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageStreamEventOneOf2 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageStreamEventOneOf2Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageStreamEventOneOf2EventEnum),
          ) as MessageStreamEventOneOf2EventEnum;
          result.event = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaObject),
          ) as MessageDeltaObject;
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
  MessageStreamEventOneOf2 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageStreamEventOneOf2Builder();
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

class MessageStreamEventOneOf2EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.message.delta')
  static const MessageStreamEventOneOf2EventEnum threadPeriodMessagePeriodDelta = _$messageStreamEventOneOf2EventEnum_threadPeriodMessagePeriodDelta;

  static Serializer<MessageStreamEventOneOf2EventEnum> get serializer => _$messageStreamEventOneOf2EventEnumSerializer;

  const MessageStreamEventOneOf2EventEnum._(String name): super(name);

  static BuiltSet<MessageStreamEventOneOf2EventEnum> get values => _$messageStreamEventOneOf2EventEnumValues;
  static MessageStreamEventOneOf2EventEnum valueOf(String name) => _$messageStreamEventOneOf2EventEnumValueOf(name);
}

