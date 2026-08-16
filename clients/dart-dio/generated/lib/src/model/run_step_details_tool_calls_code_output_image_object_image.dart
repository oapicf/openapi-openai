//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_code_output_image_object_image.g.dart';

/// RunStepDetailsToolCallsCodeOutputImageObjectImage
///
/// Properties:
/// * [fileId] - The [file](/docs/api-reference/files) ID of the image.
@BuiltValue()
abstract class RunStepDetailsToolCallsCodeOutputImageObjectImage implements Built<RunStepDetailsToolCallsCodeOutputImageObjectImage, RunStepDetailsToolCallsCodeOutputImageObjectImageBuilder> {
  /// The [file](/docs/api-reference/files) ID of the image.
  @BuiltValueField(wireName: r'file_id')
  String get fileId;

  RunStepDetailsToolCallsCodeOutputImageObjectImage._();

  factory RunStepDetailsToolCallsCodeOutputImageObjectImage([void updates(RunStepDetailsToolCallsCodeOutputImageObjectImageBuilder b)]) = _$RunStepDetailsToolCallsCodeOutputImageObjectImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsCodeOutputImageObjectImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsCodeOutputImageObjectImage> get serializer => _$RunStepDetailsToolCallsCodeOutputImageObjectImageSerializer();
}

class _$RunStepDetailsToolCallsCodeOutputImageObjectImageSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsCodeOutputImageObjectImage> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsCodeOutputImageObjectImage, _$RunStepDetailsToolCallsCodeOutputImageObjectImage];

  @override
  final String wireName = r'RunStepDetailsToolCallsCodeOutputImageObjectImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsCodeOutputImageObjectImage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'file_id';
    yield serializers.serialize(
      object.fileId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsCodeOutputImageObjectImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsCodeOutputImageObjectImageBuilder result,
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
  RunStepDetailsToolCallsCodeOutputImageObjectImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsCodeOutputImageObjectImageBuilder();
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

