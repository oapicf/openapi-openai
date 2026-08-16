//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'file_search_ranking_options.g.dart';

/// The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
///
/// Properties:
/// * [ranker] - The ranker to use for the file search. If not specified will use the `auto` ranker.
/// * [scoreThreshold] - The score threshold for the file search. All values must be a floating point number between 0 and 1.
@BuiltValue()
abstract class FileSearchRankingOptions implements Built<FileSearchRankingOptions, FileSearchRankingOptionsBuilder> {
  /// The ranker to use for the file search. If not specified will use the `auto` ranker.
  @BuiltValueField(wireName: r'ranker')
  FileSearchRankingOptionsRankerEnum? get ranker;
  // enum rankerEnum {  auto,  default_2024_08_21,  };

  /// The score threshold for the file search. All values must be a floating point number between 0 and 1.
  @BuiltValueField(wireName: r'score_threshold')
  num get scoreThreshold;

  FileSearchRankingOptions._();

  factory FileSearchRankingOptions([void updates(FileSearchRankingOptionsBuilder b)]) = _$FileSearchRankingOptions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FileSearchRankingOptionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FileSearchRankingOptions> get serializer => _$FileSearchRankingOptionsSerializer();
}

class _$FileSearchRankingOptionsSerializer implements PrimitiveSerializer<FileSearchRankingOptions> {
  @override
  final Iterable<Type> types = const [FileSearchRankingOptions, _$FileSearchRankingOptions];

  @override
  final String wireName = r'FileSearchRankingOptions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FileSearchRankingOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ranker != null) {
      yield r'ranker';
      yield serializers.serialize(
        object.ranker,
        specifiedType: const FullType(FileSearchRankingOptionsRankerEnum),
      );
    }
    yield r'score_threshold';
    yield serializers.serialize(
      object.scoreThreshold,
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    FileSearchRankingOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FileSearchRankingOptionsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ranker':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FileSearchRankingOptionsRankerEnum),
          ) as FileSearchRankingOptionsRankerEnum;
          result.ranker = valueDes;
          break;
        case r'score_threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.scoreThreshold = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FileSearchRankingOptions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FileSearchRankingOptionsBuilder();
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

class FileSearchRankingOptionsRankerEnum extends EnumClass {

  /// The ranker to use for the file search. If not specified will use the `auto` ranker.
  @BuiltValueEnumConst(wireName: r'auto')
  static const FileSearchRankingOptionsRankerEnum auto = _$fileSearchRankingOptionsRankerEnum_auto;
  /// The ranker to use for the file search. If not specified will use the `auto` ranker.
  @BuiltValueEnumConst(wireName: r'default_2024_08_21')
  static const FileSearchRankingOptionsRankerEnum default20240821 = _$fileSearchRankingOptionsRankerEnum_default20240821;

  static Serializer<FileSearchRankingOptionsRankerEnum> get serializer => _$fileSearchRankingOptionsRankerEnumSerializer;

  const FileSearchRankingOptionsRankerEnum._(String name): super(name);

  static BuiltSet<FileSearchRankingOptionsRankerEnum> get values => _$fileSearchRankingOptionsRankerEnumValues;
  static FileSearchRankingOptionsRankerEnum valueOf(String name) => _$fileSearchRankingOptionsRankerEnumValueOf(name);
}

