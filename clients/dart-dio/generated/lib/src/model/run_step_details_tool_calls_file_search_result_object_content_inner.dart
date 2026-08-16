//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_file_search_result_object_content_inner.g.dart';

/// RunStepDetailsToolCallsFileSearchResultObjectContentInner
///
/// Properties:
/// * [type] - The type of the content.
/// * [text] - The text content of the file.
@BuiltValue()
abstract class RunStepDetailsToolCallsFileSearchResultObjectContentInner implements Built<RunStepDetailsToolCallsFileSearchResultObjectContentInner, RunStepDetailsToolCallsFileSearchResultObjectContentInnerBuilder> {
  /// The type of the content.
  @BuiltValueField(wireName: r'type')
  RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum? get type;
  // enum typeEnum {  text,  };

  /// The text content of the file.
  @BuiltValueField(wireName: r'text')
  String? get text;

  RunStepDetailsToolCallsFileSearchResultObjectContentInner._();

  factory RunStepDetailsToolCallsFileSearchResultObjectContentInner([void updates(RunStepDetailsToolCallsFileSearchResultObjectContentInnerBuilder b)]) = _$RunStepDetailsToolCallsFileSearchResultObjectContentInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsFileSearchResultObjectContentInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsFileSearchResultObjectContentInner> get serializer => _$RunStepDetailsToolCallsFileSearchResultObjectContentInnerSerializer();
}

class _$RunStepDetailsToolCallsFileSearchResultObjectContentInnerSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsFileSearchResultObjectContentInner> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsFileSearchResultObjectContentInner, _$RunStepDetailsToolCallsFileSearchResultObjectContentInner];

  @override
  final String wireName = r'RunStepDetailsToolCallsFileSearchResultObjectContentInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsFileSearchResultObjectContentInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum),
      );
    }
    if (object.text != null) {
      yield r'text';
      yield serializers.serialize(
        object.text,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsFileSearchResultObjectContentInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsFileSearchResultObjectContentInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum),
          ) as RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDetailsToolCallsFileSearchResultObjectContentInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsFileSearchResultObjectContentInnerBuilder();
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

class RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum extends EnumClass {

  /// The type of the content.
  @BuiltValueEnumConst(wireName: r'text')
  static const RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum text = _$runStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum_text;

  static Serializer<RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum> get serializer => _$runStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumSerializer;

  const RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum> get values => _$runStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumValues;
  static RunStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnum valueOf(String name) => _$runStepDetailsToolCallsFileSearchResultObjectContentInnerTypeEnumValueOf(name);
}

