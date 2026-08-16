//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistant_tools_file_search_type_only.g.dart';

/// AssistantToolsFileSearchTypeOnly
///
/// Properties:
/// * [type] - The type of tool being defined: `file_search`
@BuiltValue()
abstract class AssistantToolsFileSearchTypeOnly implements Built<AssistantToolsFileSearchTypeOnly, AssistantToolsFileSearchTypeOnlyBuilder> {
  /// The type of tool being defined: `file_search`
  @BuiltValueField(wireName: r'type')
  AssistantToolsFileSearchTypeOnlyTypeEnum get type;
  // enum typeEnum {  file_search,  };

  AssistantToolsFileSearchTypeOnly._();

  factory AssistantToolsFileSearchTypeOnly([void updates(AssistantToolsFileSearchTypeOnlyBuilder b)]) = _$AssistantToolsFileSearchTypeOnly;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantToolsFileSearchTypeOnlyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantToolsFileSearchTypeOnly> get serializer => _$AssistantToolsFileSearchTypeOnlySerializer();
}

class _$AssistantToolsFileSearchTypeOnlySerializer implements PrimitiveSerializer<AssistantToolsFileSearchTypeOnly> {
  @override
  final Iterable<Type> types = const [AssistantToolsFileSearchTypeOnly, _$AssistantToolsFileSearchTypeOnly];

  @override
  final String wireName = r'AssistantToolsFileSearchTypeOnly';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantToolsFileSearchTypeOnly object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AssistantToolsFileSearchTypeOnlyTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantToolsFileSearchTypeOnly object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantToolsFileSearchTypeOnlyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantToolsFileSearchTypeOnlyTypeEnum),
          ) as AssistantToolsFileSearchTypeOnlyTypeEnum;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssistantToolsFileSearchTypeOnly deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantToolsFileSearchTypeOnlyBuilder();
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

class AssistantToolsFileSearchTypeOnlyTypeEnum extends EnumClass {

  /// The type of tool being defined: `file_search`
  @BuiltValueEnumConst(wireName: r'file_search')
  static const AssistantToolsFileSearchTypeOnlyTypeEnum fileSearch = _$assistantToolsFileSearchTypeOnlyTypeEnum_fileSearch;

  static Serializer<AssistantToolsFileSearchTypeOnlyTypeEnum> get serializer => _$assistantToolsFileSearchTypeOnlyTypeEnumSerializer;

  const AssistantToolsFileSearchTypeOnlyTypeEnum._(String name): super(name);

  static BuiltSet<AssistantToolsFileSearchTypeOnlyTypeEnum> get values => _$assistantToolsFileSearchTypeOnlyTypeEnumValues;
  static AssistantToolsFileSearchTypeOnlyTypeEnum valueOf(String name) => _$assistantToolsFileSearchTypeOnlyTypeEnumValueOf(name);
}

