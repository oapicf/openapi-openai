//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_output_image_object_image.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_code_output_image_object.g.dart';

/// RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
///
/// Properties:
/// * [index] - The index of the output in the outputs array.
/// * [type] - Always `image`.
/// * [image] 
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject implements Built<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject, RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectBuilder> {
  /// The index of the output in the outputs array.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// Always `image`.
  @BuiltValueField(wireName: r'type')
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum get type;
  // enum typeEnum {  image,  };

  @BuiltValueField(wireName: r'image')
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? get image;

  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject._();

  factory RunStepDeltaStepDetailsToolCallsCodeOutputImageObject([void updates(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsCodeOutputImageObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject> get serializer => _$RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsCodeOutputImageObject, _$RunStepDeltaStepDetailsToolCallsCodeOutputImageObject];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsCodeOutputImageObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum),
    );
    if (object.image != null) {
      yield r'image';
      yield serializers.serialize(
        object.image,
        specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum),
          ) as RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'image':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage),
          ) as RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
          result.image.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectBuilder();
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

class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum extends EnumClass {

  /// Always `image`.
  @BuiltValueEnumConst(wireName: r'image')
  static const RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum image = _$runStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum_image;

  static Serializer<RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum> get serializer => _$runStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumSerializer;

  const RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum> get values => _$runStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumValues;
  static RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsToolCallsCodeOutputImageObjectTypeEnumValueOf(name);
}

