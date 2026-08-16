//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/assistant_tools_file_search_file_search.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistant_tools_file_search.g.dart';

/// AssistantToolsFileSearch
///
/// Properties:
/// * [type] - The type of tool being defined: `file_search`
/// * [fileSearch] 
@BuiltValue()
abstract class AssistantToolsFileSearch implements Built<AssistantToolsFileSearch, AssistantToolsFileSearchBuilder> {
  /// The type of tool being defined: `file_search`
  @BuiltValueField(wireName: r'type')
  AssistantToolsFileSearchTypeEnum get type;
  // enum typeEnum {  file_search,  };

  @BuiltValueField(wireName: r'file_search')
  AssistantToolsFileSearchFileSearch? get fileSearch;

  AssistantToolsFileSearch._();

  factory AssistantToolsFileSearch([void updates(AssistantToolsFileSearchBuilder b)]) = _$AssistantToolsFileSearch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantToolsFileSearchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantToolsFileSearch> get serializer => _$AssistantToolsFileSearchSerializer();
}

class _$AssistantToolsFileSearchSerializer implements PrimitiveSerializer<AssistantToolsFileSearch> {
  @override
  final Iterable<Type> types = const [AssistantToolsFileSearch, _$AssistantToolsFileSearch];

  @override
  final String wireName = r'AssistantToolsFileSearch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantToolsFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AssistantToolsFileSearchTypeEnum),
    );
    if (object.fileSearch != null) {
      yield r'file_search';
      yield serializers.serialize(
        object.fileSearch,
        specifiedType: const FullType(AssistantToolsFileSearchFileSearch),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantToolsFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantToolsFileSearchBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantToolsFileSearchTypeEnum),
          ) as AssistantToolsFileSearchTypeEnum;
          result.type = valueDes;
          break;
        case r'file_search':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantToolsFileSearchFileSearch),
          ) as AssistantToolsFileSearchFileSearch;
          result.fileSearch.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssistantToolsFileSearch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantToolsFileSearchBuilder();
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

class AssistantToolsFileSearchTypeEnum extends EnumClass {

  /// The type of tool being defined: `file_search`
  @BuiltValueEnumConst(wireName: r'file_search')
  static const AssistantToolsFileSearchTypeEnum fileSearch = _$assistantToolsFileSearchTypeEnum_fileSearch;

  static Serializer<AssistantToolsFileSearchTypeEnum> get serializer => _$assistantToolsFileSearchTypeEnumSerializer;

  const AssistantToolsFileSearchTypeEnum._(String name): super(name);

  static BuiltSet<AssistantToolsFileSearchTypeEnum> get values => _$assistantToolsFileSearchTypeEnumValues;
  static AssistantToolsFileSearchTypeEnum valueOf(String name) => _$assistantToolsFileSearchTypeEnumValueOf(name);
}

