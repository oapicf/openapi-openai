//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/file_search_ranking_options.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistant_tools_file_search_file_search.g.dart';

/// Overrides for the file search tool.
///
/// Properties:
/// * [maxNumResults] - The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
/// * [rankingOptions] 
@BuiltValue()
abstract class AssistantToolsFileSearchFileSearch implements Built<AssistantToolsFileSearchFileSearch, AssistantToolsFileSearchFileSearchBuilder> {
  /// The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  @BuiltValueField(wireName: r'max_num_results')
  int? get maxNumResults;

  @BuiltValueField(wireName: r'ranking_options')
  FileSearchRankingOptions? get rankingOptions;

  AssistantToolsFileSearchFileSearch._();

  factory AssistantToolsFileSearchFileSearch([void updates(AssistantToolsFileSearchFileSearchBuilder b)]) = _$AssistantToolsFileSearchFileSearch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantToolsFileSearchFileSearchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantToolsFileSearchFileSearch> get serializer => _$AssistantToolsFileSearchFileSearchSerializer();
}

class _$AssistantToolsFileSearchFileSearchSerializer implements PrimitiveSerializer<AssistantToolsFileSearchFileSearch> {
  @override
  final Iterable<Type> types = const [AssistantToolsFileSearchFileSearch, _$AssistantToolsFileSearchFileSearch];

  @override
  final String wireName = r'AssistantToolsFileSearchFileSearch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantToolsFileSearchFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxNumResults != null) {
      yield r'max_num_results';
      yield serializers.serialize(
        object.maxNumResults,
        specifiedType: const FullType(int),
      );
    }
    if (object.rankingOptions != null) {
      yield r'ranking_options';
      yield serializers.serialize(
        object.rankingOptions,
        specifiedType: const FullType(FileSearchRankingOptions),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantToolsFileSearchFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantToolsFileSearchFileSearchBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max_num_results':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxNumResults = valueDes;
          break;
        case r'ranking_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FileSearchRankingOptions),
          ) as FileSearchRankingOptions;
          result.rankingOptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssistantToolsFileSearchFileSearch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantToolsFileSearchFileSearchBuilder();
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

