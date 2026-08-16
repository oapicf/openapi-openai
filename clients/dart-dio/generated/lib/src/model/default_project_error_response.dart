//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'default_project_error_response.g.dart';

/// DefaultProjectErrorResponse
///
/// Properties:
/// * [code] 
/// * [message] 
@BuiltValue()
abstract class DefaultProjectErrorResponse implements Built<DefaultProjectErrorResponse, DefaultProjectErrorResponseBuilder> {
  @BuiltValueField(wireName: r'code')
  int get code;

  @BuiltValueField(wireName: r'message')
  String get message;

  DefaultProjectErrorResponse._();

  factory DefaultProjectErrorResponse([void updates(DefaultProjectErrorResponseBuilder b)]) = _$DefaultProjectErrorResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DefaultProjectErrorResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DefaultProjectErrorResponse> get serializer => _$DefaultProjectErrorResponseSerializer();
}

class _$DefaultProjectErrorResponseSerializer implements PrimitiveSerializer<DefaultProjectErrorResponse> {
  @override
  final Iterable<Type> types = const [DefaultProjectErrorResponse, _$DefaultProjectErrorResponse];

  @override
  final String wireName = r'DefaultProjectErrorResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DefaultProjectErrorResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(int),
    );
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DefaultProjectErrorResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DefaultProjectErrorResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DefaultProjectErrorResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DefaultProjectErrorResponseBuilder();
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

