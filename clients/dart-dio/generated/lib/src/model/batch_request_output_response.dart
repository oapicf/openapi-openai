//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_request_output_response.g.dart';

/// BatchRequestOutputResponse
///
/// Properties:
/// * [statusCode] - The HTTP status code of the response
/// * [requestId] - An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
/// * [body] - The JSON body of the response
@BuiltValue()
abstract class BatchRequestOutputResponse implements Built<BatchRequestOutputResponse, BatchRequestOutputResponseBuilder> {
  /// The HTTP status code of the response
  @BuiltValueField(wireName: r'status_code')
  int? get statusCode;

  /// An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
  @BuiltValueField(wireName: r'request_id')
  String? get requestId;

  /// The JSON body of the response
  @BuiltValueField(wireName: r'body')
  JsonObject? get body;

  BatchRequestOutputResponse._();

  factory BatchRequestOutputResponse([void updates(BatchRequestOutputResponseBuilder b)]) = _$BatchRequestOutputResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BatchRequestOutputResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BatchRequestOutputResponse> get serializer => _$BatchRequestOutputResponseSerializer();
}

class _$BatchRequestOutputResponseSerializer implements PrimitiveSerializer<BatchRequestOutputResponse> {
  @override
  final Iterable<Type> types = const [BatchRequestOutputResponse, _$BatchRequestOutputResponse];

  @override
  final String wireName = r'BatchRequestOutputResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BatchRequestOutputResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.statusCode != null) {
      yield r'status_code';
      yield serializers.serialize(
        object.statusCode,
        specifiedType: const FullType(int),
      );
    }
    if (object.requestId != null) {
      yield r'request_id';
      yield serializers.serialize(
        object.requestId,
        specifiedType: const FullType(String),
      );
    }
    if (object.body != null) {
      yield r'body';
      yield serializers.serialize(
        object.body,
        specifiedType: const FullType(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BatchRequestOutputResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BatchRequestOutputResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'status_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.statusCode = valueDes;
          break;
        case r'request_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.requestId = valueDes;
          break;
        case r'body':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.body = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BatchRequestOutputResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BatchRequestOutputResponseBuilder();
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

