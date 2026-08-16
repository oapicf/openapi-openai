//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/thread_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'thread_stream_event.g.dart';

/// Occurs when a new [thread](/docs/api-reference/threads/object) is created.
///
/// Properties:
/// * [enabled] - Whether to enable input audio transcription.
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class ThreadStreamEvent implements Built<ThreadStreamEvent, ThreadStreamEventBuilder> {
  /// Whether to enable input audio transcription.
  @BuiltValueField(wireName: r'enabled')
  bool? get enabled;

  @BuiltValueField(wireName: r'event')
  ThreadStreamEventEventEnum get event;
  // enum eventEnum {  thread.created,  };

  @BuiltValueField(wireName: r'data')
  ThreadObject get data;

  ThreadStreamEvent._();

  factory ThreadStreamEvent([void updates(ThreadStreamEventBuilder b)]) = _$ThreadStreamEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ThreadStreamEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ThreadStreamEvent> get serializer => _$ThreadStreamEventSerializer();
}

class _$ThreadStreamEventSerializer implements PrimitiveSerializer<ThreadStreamEvent> {
  @override
  final Iterable<Type> types = const [ThreadStreamEvent, _$ThreadStreamEvent];

  @override
  final String wireName = r'ThreadStreamEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ThreadStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(bool),
      );
    }
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(ThreadStreamEventEventEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(ThreadObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ThreadStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ThreadStreamEventBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.enabled = valueDes;
          break;
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ThreadStreamEventEventEnum),
          ) as ThreadStreamEventEventEnum;
          result.event = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ThreadObject),
          ) as ThreadObject;
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
  ThreadStreamEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ThreadStreamEventBuilder();
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

class ThreadStreamEventEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.created')
  static const ThreadStreamEventEventEnum threadPeriodCreated = _$threadStreamEventEventEnum_threadPeriodCreated;

  static Serializer<ThreadStreamEventEventEnum> get serializer => _$threadStreamEventEventEnumSerializer;

  const ThreadStreamEventEventEnum._(String name): super(name);

  static BuiltSet<ThreadStreamEventEventEnum> get values => _$threadStreamEventEventEnumValues;
  static ThreadStreamEventEventEnum valueOf(String name) => _$threadStreamEventEventEnumValueOf(name);
}

