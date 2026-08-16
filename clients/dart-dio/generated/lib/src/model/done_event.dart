//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'done_event.g.dart';

/// Occurs when a stream ends.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class DoneEvent implements Built<DoneEvent, DoneEventBuilder> {
  @BuiltValueField(wireName: r'event')
  DoneEventEventEnum get event;
  // enum eventEnum {  done,  };

  @BuiltValueField(wireName: r'data')
  DoneEventDataEnum get data;
  // enum dataEnum {  [DONE],  };

  DoneEvent._();

  factory DoneEvent([void updates(DoneEventBuilder b)]) = _$DoneEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DoneEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DoneEvent> get serializer => _$DoneEventSerializer();
}

class _$DoneEventSerializer implements PrimitiveSerializer<DoneEvent> {
  @override
  final Iterable<Type> types = const [DoneEvent, _$DoneEvent];

  @override
  final String wireName = r'DoneEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DoneEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(DoneEventEventEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(DoneEventDataEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DoneEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DoneEventBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DoneEventEventEnum),
          ) as DoneEventEventEnum;
          result.event = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DoneEventDataEnum),
          ) as DoneEventDataEnum;
          result.data = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DoneEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DoneEventBuilder();
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

class DoneEventEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'done')
  static const DoneEventEventEnum done = _$doneEventEventEnum_done;

  static Serializer<DoneEventEventEnum> get serializer => _$doneEventEventEnumSerializer;

  const DoneEventEventEnum._(String name): super(name);

  static BuiltSet<DoneEventEventEnum> get values => _$doneEventEventEnumValues;
  static DoneEventEventEnum valueOf(String name) => _$doneEventEventEnumValueOf(name);
}

class DoneEventDataEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'[DONE]')
  static const DoneEventDataEnum leftSquareBracketDONERightSquareBracket = _$doneEventDataEnum_leftSquareBracketDONERightSquareBracket;

  static Serializer<DoneEventDataEnum> get serializer => _$doneEventDataEnumSerializer;

  const DoneEventDataEnum._(String name): super(name);

  static BuiltSet<DoneEventDataEnum> get values => _$doneEventDataEnumValues;
  static DoneEventDataEnum valueOf(String name) => _$doneEventDataEnumValueOf(name);
}

