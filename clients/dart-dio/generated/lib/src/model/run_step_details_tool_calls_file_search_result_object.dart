//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_result_object_content_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_file_search_result_object.g.dart';

/// A result instance of the file search.
///
/// Properties:
/// * [fileId] - The ID of the file that result was found in.
/// * [fileName] - The name of the file that result was found in.
/// * [score] - The score of the result. All values must be a floating point number between 0 and 1.
/// * [content] - The content of the result that was found. The content is only included if requested via the include query parameter.
@BuiltValue()
abstract class RunStepDetailsToolCallsFileSearchResultObject implements Built<RunStepDetailsToolCallsFileSearchResultObject, RunStepDetailsToolCallsFileSearchResultObjectBuilder> {
  /// The ID of the file that result was found in.
  @BuiltValueField(wireName: r'file_id')
  String get fileId;

  /// The name of the file that result was found in.
  @BuiltValueField(wireName: r'file_name')
  String get fileName;

  /// The score of the result. All values must be a floating point number between 0 and 1.
  @BuiltValueField(wireName: r'score')
  num get score;

  /// The content of the result that was found. The content is only included if requested via the include query parameter.
  @BuiltValueField(wireName: r'content')
  BuiltList<RunStepDetailsToolCallsFileSearchResultObjectContentInner>? get content;

  RunStepDetailsToolCallsFileSearchResultObject._();

  factory RunStepDetailsToolCallsFileSearchResultObject([void updates(RunStepDetailsToolCallsFileSearchResultObjectBuilder b)]) = _$RunStepDetailsToolCallsFileSearchResultObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsFileSearchResultObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsFileSearchResultObject> get serializer => _$RunStepDetailsToolCallsFileSearchResultObjectSerializer();
}

class _$RunStepDetailsToolCallsFileSearchResultObjectSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsFileSearchResultObject> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsFileSearchResultObject, _$RunStepDetailsToolCallsFileSearchResultObject];

  @override
  final String wireName = r'RunStepDetailsToolCallsFileSearchResultObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsFileSearchResultObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'file_id';
    yield serializers.serialize(
      object.fileId,
      specifiedType: const FullType(String),
    );
    yield r'file_name';
    yield serializers.serialize(
      object.fileName,
      specifiedType: const FullType(String),
    );
    yield r'score';
    yield serializers.serialize(
      object.score,
      specifiedType: const FullType(num),
    );
    if (object.content != null) {
      yield r'content';
      yield serializers.serialize(
        object.content,
        specifiedType: const FullType(BuiltList, [FullType(RunStepDetailsToolCallsFileSearchResultObjectContentInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsFileSearchResultObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsFileSearchResultObjectBuilder result,
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
        case r'file_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fileName = valueDes;
          break;
        case r'score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.score = valueDes;
          break;
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RunStepDetailsToolCallsFileSearchResultObjectContentInner)]),
          ) as BuiltList<RunStepDetailsToolCallsFileSearchResultObjectContentInner>;
          result.content.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDetailsToolCallsFileSearchResultObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsFileSearchResultObjectBuilder();
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

