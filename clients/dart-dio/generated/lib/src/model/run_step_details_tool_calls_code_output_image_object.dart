//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_details_tool_calls_code_output_image_object_image.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_code_output_image_object.g.dart';

/// RunStepDetailsToolCallsCodeOutputImageObject
///
/// Properties:
/// * [type] - Always `image`.
/// * [image] 
@BuiltValue()
abstract class RunStepDetailsToolCallsCodeOutputImageObject implements Built<RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputImageObjectBuilder> {
  /// Always `image`.
  @BuiltValueField(wireName: r'type')
  RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum get type;
  // enum typeEnum {  image,  };

  @BuiltValueField(wireName: r'image')
  RunStepDetailsToolCallsCodeOutputImageObjectImage get image;

  RunStepDetailsToolCallsCodeOutputImageObject._();

  factory RunStepDetailsToolCallsCodeOutputImageObject([void updates(RunStepDetailsToolCallsCodeOutputImageObjectBuilder b)]) = _$RunStepDetailsToolCallsCodeOutputImageObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsCodeOutputImageObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsCodeOutputImageObject> get serializer => _$RunStepDetailsToolCallsCodeOutputImageObjectSerializer();
}

class _$RunStepDetailsToolCallsCodeOutputImageObjectSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsCodeOutputImageObject> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsCodeOutputImageObject, _$RunStepDetailsToolCallsCodeOutputImageObject];

  @override
  final String wireName = r'RunStepDetailsToolCallsCodeOutputImageObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsCodeOutputImageObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum),
    );
    yield r'image';
    yield serializers.serialize(
      object.image,
      specifiedType: const FullType(RunStepDetailsToolCallsCodeOutputImageObjectImage),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsCodeOutputImageObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsCodeOutputImageObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum),
          ) as RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'image':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsCodeOutputImageObjectImage),
          ) as RunStepDetailsToolCallsCodeOutputImageObjectImage;
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
  RunStepDetailsToolCallsCodeOutputImageObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsCodeOutputImageObjectBuilder();
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

class RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum extends EnumClass {

  /// Always `image`.
  @BuiltValueEnumConst(wireName: r'image')
  static const RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum image = _$runStepDetailsToolCallsCodeOutputImageObjectTypeEnum_image;

  static Serializer<RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum> get serializer => _$runStepDetailsToolCallsCodeOutputImageObjectTypeEnumSerializer;

  const RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum> get values => _$runStepDetailsToolCallsCodeOutputImageObjectTypeEnumValues;
  static RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum valueOf(String name) => _$runStepDetailsToolCallsCodeOutputImageObjectTypeEnumValueOf(name);
}

