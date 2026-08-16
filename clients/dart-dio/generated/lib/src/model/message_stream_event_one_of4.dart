//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_stream_event_one_of4.g.dart';

/// Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class MessageStreamEventOneOf4 implements Built<MessageStreamEventOneOf4, MessageStreamEventOneOf4Builder> {
  @BuiltValueField(wireName: r'event')
  MessageStreamEventOneOf4EventEnum get event;
  // enum eventEnum {  thread.message.incomplete,  };

  @BuiltValueField(wireName: r'data')
  MessageObject get data;

  MessageStreamEventOneOf4._();

  factory MessageStreamEventOneOf4([void updates(MessageStreamEventOneOf4Builder b)]) = _$MessageStreamEventOneOf4;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageStreamEventOneOf4Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageStreamEventOneOf4> get serializer => _$MessageStreamEventOneOf4Serializer();
}

class _$MessageStreamEventOneOf4Serializer implements PrimitiveSerializer<MessageStreamEventOneOf4> {
  @override
  final Iterable<Type> types = const [MessageStreamEventOneOf4, _$MessageStreamEventOneOf4];

  @override
  final String wireName = r'MessageStreamEventOneOf4';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageStreamEventOneOf4 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(MessageStreamEventOneOf4EventEnum),
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
    MessageStreamEventOneOf4 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageStreamEventOneOf4Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageStreamEventOneOf4EventEnum),
          ) as MessageStreamEventOneOf4EventEnum;
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
  MessageStreamEventOneOf4 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageStreamEventOneOf4Builder();
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

class MessageStreamEventOneOf4EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.message.incomplete')
  static const MessageStreamEventOneOf4EventEnum threadPeriodMessagePeriodIncomplete = _$messageStreamEventOneOf4EventEnum_threadPeriodMessagePeriodIncomplete;

  static Serializer<MessageStreamEventOneOf4EventEnum> get serializer => _$messageStreamEventOneOf4EventEnumSerializer;

  const MessageStreamEventOneOf4EventEnum._(String name): super(name);

  static BuiltSet<MessageStreamEventOneOf4EventEnum> get values => _$messageStreamEventOneOf4EventEnumValues;
  static MessageStreamEventOneOf4EventEnum valueOf(String name) => _$messageStreamEventOneOf4EventEnumValueOf(name);
}

