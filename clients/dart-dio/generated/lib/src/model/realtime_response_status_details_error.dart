//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_response_status_details_error.g.dart';

/// A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
///
/// Properties:
/// * [type] - The type of error.
/// * [code] - Error code, if any.
@BuiltValue()
abstract class RealtimeResponseStatusDetailsError implements Built<RealtimeResponseStatusDetailsError, RealtimeResponseStatusDetailsErrorBuilder> {
  /// The type of error.
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Error code, if any.
  @BuiltValueField(wireName: r'code')
  String? get code;

  RealtimeResponseStatusDetailsError._();

  factory RealtimeResponseStatusDetailsError([void updates(RealtimeResponseStatusDetailsErrorBuilder b)]) = _$RealtimeResponseStatusDetailsError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseStatusDetailsErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseStatusDetailsError> get serializer => _$RealtimeResponseStatusDetailsErrorSerializer();
}

class _$RealtimeResponseStatusDetailsErrorSerializer implements PrimitiveSerializer<RealtimeResponseStatusDetailsError> {
  @override
  final Iterable<Type> types = const [RealtimeResponseStatusDetailsError, _$RealtimeResponseStatusDetailsError];

  @override
  final String wireName = r'RealtimeResponseStatusDetailsError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseStatusDetailsError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeResponseStatusDetailsError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeResponseStatusDetailsErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.code = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeResponseStatusDetailsError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseStatusDetailsErrorBuilder();
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

