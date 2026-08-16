//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/message_stream_event_one_of.dart';
import 'package:openapi/src/model/message_object.dart';
import 'package:openapi/src/model/message_stream_event_one_of3.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/message_stream_event_one_of4.dart';
import 'package:openapi/src/model/message_stream_event_one_of1.dart';
import 'package:openapi/src/model/message_stream_event_one_of2.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'message_stream_event.g.dart';

/// MessageStreamEvent
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class MessageStreamEvent implements Built<MessageStreamEvent, MessageStreamEventBuilder> {
  /// One Of [MessageStreamEventOneOf], [MessageStreamEventOneOf1], [MessageStreamEventOneOf2], [MessageStreamEventOneOf3], [MessageStreamEventOneOf4]
  OneOf get oneOf;

  MessageStreamEvent._();

  factory MessageStreamEvent([void updates(MessageStreamEventBuilder b)]) = _$MessageStreamEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageStreamEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageStreamEvent> get serializer => _$MessageStreamEventSerializer();
}

class _$MessageStreamEventSerializer implements PrimitiveSerializer<MessageStreamEvent> {
  @override
  final Iterable<Type> types = const [MessageStreamEvent, _$MessageStreamEvent];

  @override
  final String wireName = r'MessageStreamEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  MessageStreamEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageStreamEventBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(MessageStreamEventOneOf), FullType(MessageStreamEventOneOf1), FullType(MessageStreamEventOneOf2), FullType(MessageStreamEventOneOf3), FullType(MessageStreamEventOneOf4), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class MessageStreamEventEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.message.incomplete')
  static const MessageStreamEventEventEnum threadPeriodMessagePeriodIncomplete = _$messageStreamEventEventEnum_threadPeriodMessagePeriodIncomplete;

  static Serializer<MessageStreamEventEventEnum> get serializer => _$messageStreamEventEventEnumSerializer;

  const MessageStreamEventEventEnum._(String name): super(name);

  static BuiltSet<MessageStreamEventEventEnum> get values => _$messageStreamEventEventEnumValues;
  static MessageStreamEventEventEnum valueOf(String name) => _$messageStreamEventEventEnumValueOf(name);
}

