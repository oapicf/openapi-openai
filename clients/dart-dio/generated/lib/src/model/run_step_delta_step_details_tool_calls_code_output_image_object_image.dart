//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_code_output_image_object_image.g.dart';

/// RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
///
/// Properties:
/// * [fileId] - The [file](/docs/api-reference/files) ID of the image.
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage implements Built<RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage, RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageBuilder> {
  /// The [file](/docs/api-reference/files) ID of the image.
  @BuiltValueField(wireName: r'file_id')
  String? get fileId;

  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage._();

  factory RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage([void updates(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage> get serializer => _$RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage, _$RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fileId != null) {
      yield r'file_id';
      yield serializers.serialize(
        object.fileId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'file_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fileId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageBuilder();
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

