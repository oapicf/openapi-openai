//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_stream_event.dart';
import 'package:openapi/src/model/run_stream_event.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/done_event.dart';
import 'package:openapi/src/model/message_stream_event.dart';
import 'package:openapi/src/model/thread_stream_event.dart';
import 'package:openapi/src/model/error_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'assistant_stream_event.g.dart';

/// Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
///
/// Properties:
/// * [enabled] - Whether to enable input audio transcription.
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class AssistantStreamEvent implements Built<AssistantStreamEvent, AssistantStreamEventBuilder> {
  /// One Of [DoneEvent], [ErrorEvent], [MessageStreamEvent], [RunStepStreamEvent], [RunStreamEvent], [ThreadStreamEvent]
  OneOf get oneOf;

  AssistantStreamEvent._();

  factory AssistantStreamEvent([void updates(AssistantStreamEventBuilder b)]) = _$AssistantStreamEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantStreamEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantStreamEvent> get serializer => _$AssistantStreamEventSerializer();
}

class _$AssistantStreamEventSerializer implements PrimitiveSerializer<AssistantStreamEvent> {
  @override
  final Iterable<Type> types = const [AssistantStreamEvent, _$AssistantStreamEvent];

  @override
  final String wireName = r'AssistantStreamEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  AssistantStreamEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantStreamEventBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(ThreadStreamEvent), FullType(RunStreamEvent), FullType(RunStepStreamEvent), FullType(MessageStreamEvent), FullType(ErrorEvent), FullType(DoneEvent), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class AssistantStreamEventEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'done')
  static const AssistantStreamEventEventEnum done = _$assistantStreamEventEventEnum_done;

  static Serializer<AssistantStreamEventEventEnum> get serializer => _$assistantStreamEventEventEnumSerializer;

  const AssistantStreamEventEventEnum._(String name): super(name);

  static BuiltSet<AssistantStreamEventEventEnum> get values => _$assistantStreamEventEventEnumValues;
  static AssistantStreamEventEventEnum valueOf(String name) => _$assistantStreamEventEventEnumValueOf(name);
}

class AssistantStreamEventDataEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'[DONE]')
  static const AssistantStreamEventDataEnum leftSquareBracketDONERightSquareBracket = _$assistantStreamEventDataEnum_leftSquareBracketDONERightSquareBracket;

  static Serializer<AssistantStreamEventDataEnum> get serializer => _$assistantStreamEventDataEnumSerializer;

  const AssistantStreamEventDataEnum._(String name): super(name);

  static BuiltSet<AssistantStreamEventDataEnum> get values => _$assistantStreamEventDataEnumValues;
  static AssistantStreamEventDataEnum valueOf(String name) => _$assistantStreamEventDataEnumValueOf(name);
}

