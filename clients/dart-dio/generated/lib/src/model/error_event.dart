//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'error_event.g.dart';

/// Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class ErrorEvent implements Built<ErrorEvent, ErrorEventBuilder> {
  @BuiltValueField(wireName: r'event')
  ErrorEventEventEnum get event;
  // enum eventEnum {  error,  };

  @BuiltValueField(wireName: r'data')
  Error get data;

  ErrorEvent._();

  factory ErrorEvent([void updates(ErrorEventBuilder b)]) = _$ErrorEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ErrorEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ErrorEvent> get serializer => _$ErrorEventSerializer();
}

class _$ErrorEventSerializer implements PrimitiveSerializer<ErrorEvent> {
  @override
  final Iterable<Type> types = const [ErrorEvent, _$ErrorEvent];

  @override
  final String wireName = r'ErrorEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ErrorEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(ErrorEventEventEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(Error),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ErrorEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ErrorEventBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ErrorEventEventEnum),
          ) as ErrorEventEventEnum;
          result.event = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Error),
          ) as Error;
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
  ErrorEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ErrorEventBuilder();
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

class ErrorEventEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'error')
  static const ErrorEventEventEnum error = _$errorEventEventEnum_error;

  static Serializer<ErrorEventEventEnum> get serializer => _$errorEventEventEnumSerializer;

  const ErrorEventEventEnum._(String name): super(name);

  static BuiltSet<ErrorEventEventEnum> get values => _$errorEventEventEnumValues;
  static ErrorEventEventEnum valueOf(String name) => _$errorEventEventEnumValueOf(name);
}

