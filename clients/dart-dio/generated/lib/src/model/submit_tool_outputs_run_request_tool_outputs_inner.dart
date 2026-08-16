//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'submit_tool_outputs_run_request_tool_outputs_inner.g.dart';

/// SubmitToolOutputsRunRequestToolOutputsInner
///
/// Properties:
/// * [toolCallId] - The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
/// * [output] - The output of the tool call to be submitted to continue the run.
@BuiltValue()
abstract class SubmitToolOutputsRunRequestToolOutputsInner implements Built<SubmitToolOutputsRunRequestToolOutputsInner, SubmitToolOutputsRunRequestToolOutputsInnerBuilder> {
  /// The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
  @BuiltValueField(wireName: r'tool_call_id')
  String? get toolCallId;

  /// The output of the tool call to be submitted to continue the run.
  @BuiltValueField(wireName: r'output')
  String? get output;

  SubmitToolOutputsRunRequestToolOutputsInner._();

  factory SubmitToolOutputsRunRequestToolOutputsInner([void updates(SubmitToolOutputsRunRequestToolOutputsInnerBuilder b)]) = _$SubmitToolOutputsRunRequestToolOutputsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SubmitToolOutputsRunRequestToolOutputsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SubmitToolOutputsRunRequestToolOutputsInner> get serializer => _$SubmitToolOutputsRunRequestToolOutputsInnerSerializer();
}

class _$SubmitToolOutputsRunRequestToolOutputsInnerSerializer implements PrimitiveSerializer<SubmitToolOutputsRunRequestToolOutputsInner> {
  @override
  final Iterable<Type> types = const [SubmitToolOutputsRunRequestToolOutputsInner, _$SubmitToolOutputsRunRequestToolOutputsInner];

  @override
  final String wireName = r'SubmitToolOutputsRunRequestToolOutputsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SubmitToolOutputsRunRequestToolOutputsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.toolCallId != null) {
      yield r'tool_call_id';
      yield serializers.serialize(
        object.toolCallId,
        specifiedType: const FullType(String),
      );
    }
    if (object.output != null) {
      yield r'output';
      yield serializers.serialize(
        object.output,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SubmitToolOutputsRunRequestToolOutputsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SubmitToolOutputsRunRequestToolOutputsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'tool_call_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.toolCallId = valueDes;
          break;
        case r'output':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.output = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SubmitToolOutputsRunRequestToolOutputsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SubmitToolOutputsRunRequestToolOutputsInnerBuilder();
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

