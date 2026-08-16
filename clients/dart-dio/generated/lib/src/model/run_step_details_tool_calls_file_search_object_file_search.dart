//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_result_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_ranking_options_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_file_search_object_file_search.g.dart';

/// For now, this is always going to be an empty object.
///
/// Properties:
/// * [rankingOptions] 
/// * [results] - The results of the file search.
@BuiltValue()
abstract class RunStepDetailsToolCallsFileSearchObjectFileSearch implements Built<RunStepDetailsToolCallsFileSearchObjectFileSearch, RunStepDetailsToolCallsFileSearchObjectFileSearchBuilder> {
  @BuiltValueField(wireName: r'ranking_options')
  RunStepDetailsToolCallsFileSearchRankingOptionsObject? get rankingOptions;

  /// The results of the file search.
  @BuiltValueField(wireName: r'results')
  BuiltList<RunStepDetailsToolCallsFileSearchResultObject>? get results;

  RunStepDetailsToolCallsFileSearchObjectFileSearch._();

  factory RunStepDetailsToolCallsFileSearchObjectFileSearch([void updates(RunStepDetailsToolCallsFileSearchObjectFileSearchBuilder b)]) = _$RunStepDetailsToolCallsFileSearchObjectFileSearch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsFileSearchObjectFileSearchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsFileSearchObjectFileSearch> get serializer => _$RunStepDetailsToolCallsFileSearchObjectFileSearchSerializer();
}

class _$RunStepDetailsToolCallsFileSearchObjectFileSearchSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsFileSearchObjectFileSearch> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsFileSearchObjectFileSearch, _$RunStepDetailsToolCallsFileSearchObjectFileSearch];

  @override
  final String wireName = r'RunStepDetailsToolCallsFileSearchObjectFileSearch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsFileSearchObjectFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.rankingOptions != null) {
      yield r'ranking_options';
      yield serializers.serialize(
        object.rankingOptions,
        specifiedType: const FullType(RunStepDetailsToolCallsFileSearchRankingOptionsObject),
      );
    }
    if (object.results != null) {
      yield r'results';
      yield serializers.serialize(
        object.results,
        specifiedType: const FullType(BuiltList, [FullType(RunStepDetailsToolCallsFileSearchResultObject)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsFileSearchObjectFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsFileSearchObjectFileSearchBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ranking_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsFileSearchRankingOptionsObject),
          ) as RunStepDetailsToolCallsFileSearchRankingOptionsObject;
          result.rankingOptions.replace(valueDes);
          break;
        case r'results':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RunStepDetailsToolCallsFileSearchResultObject)]),
          ) as BuiltList<RunStepDetailsToolCallsFileSearchResultObject>;
          result.results.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDetailsToolCallsFileSearchObjectFileSearch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsFileSearchObjectFileSearchBuilder();
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

