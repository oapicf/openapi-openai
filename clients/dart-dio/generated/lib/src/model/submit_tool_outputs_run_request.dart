//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/submit_tool_outputs_run_request_tool_outputs_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'submit_tool_outputs_run_request.g.dart';

/// SubmitToolOutputsRunRequest
///
/// Properties:
/// * [toolOutputs] - A list of tools for which the outputs are being submitted.
/// * [stream] - If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
@BuiltValue()
abstract class SubmitToolOutputsRunRequest implements Built<SubmitToolOutputsRunRequest, SubmitToolOutputsRunRequestBuilder> {
  /// A list of tools for which the outputs are being submitted.
  @BuiltValueField(wireName: r'tool_outputs')
  BuiltList<SubmitToolOutputsRunRequestToolOutputsInner> get toolOutputs;

  /// If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  @BuiltValueField(wireName: r'stream')
  bool? get stream;

  SubmitToolOutputsRunRequest._();

  factory SubmitToolOutputsRunRequest([void updates(SubmitToolOutputsRunRequestBuilder b)]) = _$SubmitToolOutputsRunRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SubmitToolOutputsRunRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SubmitToolOutputsRunRequest> get serializer => _$SubmitToolOutputsRunRequestSerializer();
}

class _$SubmitToolOutputsRunRequestSerializer implements PrimitiveSerializer<SubmitToolOutputsRunRequest> {
  @override
  final Iterable<Type> types = const [SubmitToolOutputsRunRequest, _$SubmitToolOutputsRunRequest];

  @override
  final String wireName = r'SubmitToolOutputsRunRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SubmitToolOutputsRunRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'tool_outputs';
    yield serializers.serialize(
      object.toolOutputs,
      specifiedType: const FullType(BuiltList, [FullType(SubmitToolOutputsRunRequestToolOutputsInner)]),
    );
    if (object.stream != null) {
      yield r'stream';
      yield serializers.serialize(
        object.stream,
        specifiedType: const FullType.nullable(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SubmitToolOutputsRunRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SubmitToolOutputsRunRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'tool_outputs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(SubmitToolOutputsRunRequestToolOutputsInner)]),
          ) as BuiltList<SubmitToolOutputsRunRequestToolOutputsInner>;
          result.toolOutputs.replace(valueDes);
          break;
        case r'stream':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.stream = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SubmitToolOutputsRunRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SubmitToolOutputsRunRequestBuilder();
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

